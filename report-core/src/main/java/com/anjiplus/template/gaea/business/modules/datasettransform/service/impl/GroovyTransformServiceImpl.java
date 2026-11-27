package com.anjiplus.template.gaea.business.modules.datasettransform.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.anji.plus.gaea.exception.BusinessExceptionBuilder;
import com.anjiplus.template.gaea.business.code.ResponseCode;
import com.anjiplus.template.gaea.business.modules.datasettransform.controller.dto.DataSetTransformDto;
import com.anjiplus.template.gaea.business.modules.datasettransform.service.IGroovyHandler;
import com.anjiplus.template.gaea.business.modules.datasettransform.service.TransformStrategy;
import groovy.lang.GroovyClassLoader;
import lombok.extern.slf4j.Slf4j;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.codehaus.groovy.control.customizers.SecureASTCustomizer;
import org.springframework.stereotype.Component;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.Arrays;
import java.util.List;

/**
 * Created by raodeming on 2021/3/23.
 */
@Component
@Slf4j
public class GroovyTransformServiceImpl implements TransformStrategy {

    private GroovyClassLoader groovyClassLoader = createSecureClassLoader();

    /**
     * 构建受限的GroovyClassLoader，禁止脚本访问系统命令执行、反射、IO、网络等危险类，防止任意代码执行
     *
     * @return
     */
    private static GroovyClassLoader createSecureClassLoader() {
        SecureASTCustomizer secureASTCustomizer = new SecureASTCustomizer();
        secureASTCustomizer.setIndirectImportCheckEnabled(true);
        secureASTCustomizer.setImportsBlacklist(Arrays.asList(
                "java.lang.Runtime", "java.lang.ProcessBuilder", "java.lang.System",
                "java.lang.Class", "java.lang.ClassLoader", "java.lang.reflect",
                "java.io", "java.nio.file", "java.net", "groovy.lang.GroovyShell",
                "groovy.lang.GroovyClassLoader"));
        CompilerConfiguration compilerConfiguration = new CompilerConfiguration();
        compilerConfiguration.addCompilationCustomizers(secureASTCustomizer);
        return new GroovyClassLoader(GroovyTransformServiceImpl.class.getClassLoader(), compilerConfiguration);
    }

    /**
     * 数据清洗转换 类型
     *
     * @return
     */
    @Override
    public String type() {
        return "javaBean";
    }

    /***
     * 清洗转换算法接口
     * @param def
     * @param data
     * @return
     */
    @Override
    public List<JSONObject> transform(DataSetTransformDto def, List<JSONObject> data) {
        String transformScript = def.getTransformScript();
        Class<?> clazz = groovyClassLoader.parseClass(transformScript);
        if (clazz != null) {
            try {
                Object instance = clazz.newInstance();
                if (instance!=null) {
                    if (instance instanceof IGroovyHandler) {
                        IGroovyHandler handler = (IGroovyHandler) instance;
                        return handler.transform(data);
                    } else {
                        System.err.println("转换失败！");
                    }
                }
            } catch (Exception e) {
                log.info("执行javaBean异常", e);
                throw BusinessExceptionBuilder.build(ResponseCode.EXECUTE_GROOVY_ERROR, e.getMessage());
            }
        }
        return data;
    }
}
