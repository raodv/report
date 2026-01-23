## 简介

&emsp; &emsp; AJ-Report是全开源的一个BI平台，酷炫大屏展示，能随时随地掌控业务动态，让每个决策都有数据支撑。<br>
&emsp; &emsp;
多数据源支持，内置mysql、elasticsearch、kudu驱动，支持自定义数据集省去数据接口开发，目前已支持30+种大屏组件/图表，不会开发，照着设计稿也可以制作大屏。<br>
&emsp; &emsp; 三步轻松完成大屏设计：配置数据源---->写SQL配置数据集---->拖拽配置大屏---->保存发布。欢迎体验。

## 在线体验

#### &emsp; [在线体验](https://ajreport.beliefteam.cn/index.html "链接"): https://ajreport.beliefteam.cn/index.html  &emsp;体验账号：guest 密码：guest

## React版本
还在开发中, 感兴趣可以去提交图表组件，把vue版本的图表组件挪过去。
#### https://gitee.com/qlsgr/DataReport/
![输入图片说明](report-ui/src/assets/images/user/2ae93917-a5c0-4523-869a-155a2c54d8e7.png)

#### 文档位置

#### &emsp; [在线文档](https://ajreport.beliefteam.cn/report-doc/ "doc"): https://ajreport.beliefteam.cn/report-doc/ <br>

源码 doc -> docs -> guide 目录下即所有文档

#### 模板链接

#### &emsp; [模板下载](https://ajreport.beliefteam.cn/download "temp"): https://ajreport.beliefteam.cn/download<br>

通过百度网盘分享的文件：大屏模板
链接:https://pan.baidu.com/s/1rkjBiiTpA4DBQdep-uAYzQ?pwd=w3rm提取码:w3rm

#### &emsp; [在线提问](https://gitee.com/belief-team/report/issues "issue"): https://gitee.com/belief-team/report/issues <br>

## 发行版本

#### &emsp; [下载链接](https://gitee.com/belief-team/report/releases "下载链接"): https://gitee.com/belief-team/report/releases <br>

## 功能概述

#### &emsp; 组件介绍

&emsp;&emsp; 大屏设计（AJ-Report）是一个可视化拖拽编辑的，直观，酷炫，具有科技感的图表工具全开源项目。
内置的基础功能包括数据源，数据集，报表管理，项目部分截图如下。<br>

![操作](https://images.gitee.com/uploads/images/2021/0703/094742_c0243f70_1728982.gif "2021-07-03_09-43-50.gif")

## 数据流程图

![An image](https://images.gitee.com/uploads/images/2021/0630/160451_31bb9052_1728982.png)

## 打包目录build

```
├── bin                                           启动命令脚本
│   ├── restart.sh
│   ├── start.bat
│   ├── start.sh
│   └── stop.sh
├── conf                                       配置文件目录
│   └── bootstrap.yml
├── logs                                          启动日志目录
├── cache                                         本地缓存目录
├── lib                                           自定义扩展包&report-core核心包
```

## 系统目录

```
├── doc                                           文档源码
│   ├── docs
│   ├── package.json
│   └── README.md
├── pom.xml                                       父pom，jar版本管理
├── report-core                                   java源码
│   ├── pom.xml                                   gaea父pom，jar版本管理
│   └── README.md
├── report-ui                                     前端vue源码
├── LICENSE
├── README.md
```

## 核心技术

### 依赖

- [Mysql] 5.7
- [Jdk] 1.8

### 后端

- [aj-gaea](https://gitee.com/anji-plus/gaea) 低代码平台+spring微服务组件.
- [Spring Boot2.3.5.RELEASE](https://spring.io/projects/spring-boot/): Spring Boot是一款开箱即用框架，让我们的Spring应用变的更轻量化、更快的入门。
  在主程序执行main函数就可以运行。你也可以打包你的应用为jar并通过使用java -jar来运行你的Web应用；
- [Mybatis-plus3.3.2](https://mp.baomidou.com/): MyBatis-plus（简称 MP）是一个 MyBatis (opens new window) 的增强工具。
- [flyway5.2.1](https://flywaydb.org/): 主要用于在你的应用版本不断升级的同时，升级你的数据库结构和里面的数据

### 前端

- [npm](https://www.npmjs.com/)：node.js的包管理工具，用于统一管理我们前端项目中需要用到的包、插件、工具、命令等，便于开发和维护。
- [webpack](https://webpack.docschina.org/)：用于现代 JavaScript 应用程序的静态模块打包工具。
- [ES6](https://es6.ruanyifeng.com/)：JavaScript的新版本，ECMAScript6的简称。利用ES6我们可以简化我们的JS代码，同时利用其提供的强大功能来快速实现JS逻辑。
- [vue-cli](https://cli.vuejs.org/)：Vue的脚手架工具，用于自动生成Vue项目的目录及文件。
- [vue-router](https://router.vuejs.org/)： Vue提供的前端路由工具，利用其我们实现页面的路由控制，局部刷新及按需加载，构建单页应用，实现前后端分离。
- [element-ui](https://element.eleme.cn/#/zh-CN)：基于MVVM框架Vue开源出来的一套前端ui组件。
- [avue](https://www.avuejs.com/): 用该组件包裹后可以变成拖拽组件，采用相对于父类绝对定位，用键盘的上下左右也可以控制移动。
- [vue-echarts](https://www.npmjs.com/package/vue-echarts/): vue-echarts是封装后的vue插件，基于 ECharts v4.0.1+ 开发。
- [vue-superslide](https://www.npmjs.com/package/vue-super-slider/): Vue-SuperSlide(Github) 是 SuperSlide 的 Vue 封装版本。
- [vuedraggable](https://github.com/SortableJS/Vue.Draggable/): 是一款基于Sortable.js实现的vue拖拽插件。
- [luckysheet](https://gitee.com/mengshukeji/Luckysheet): Luckysheet ，一款纯前端类似excel的在线表格，功能强大、配置简单、完全开源。

## 部署方式

**[运行环境参考文档](https://ajreport.beliefteam.cn/report-doc/guide/quicklyDevelop.html)** <br>
**注意版本兼容性** <br>
源码 doc -> docs -> guide 目录下即所有文档。<br>
启动文档（在线文档图片多，打开很慢可以本地启动文档，方便查看） <br>

```
cd .\doc\
npm run docs:dev
```

### 发行版部署

**[发行版部署详细文档](https://ajreport.beliefteam.cn/report-doc/guide/quicklyDistribution.html)** <br>

简易步骤

```
下载最新发行版，解压
cd aj-report-xxxx
vim conf/bootstrap.yml 修改数据库连接、上传下载地址、jwt令牌等信息
sh bin/start.sh Linux启动
bin/start.bat Windows修改第4行的JAVA_HOME后(去掉rem注释)，双击启动

启动后访问
http://serverip:9095
用户名密码：admin/123456

```

### 源码编译部署

**[源码编译部署详细文档](https://ajreport.beliefteam.cn/report-doc/guide/quicklySource.html)** <br>

在Linux上先准备好maven、node.js、jdk

- [Apache Maven] 3.5 <br>
- [Node.js] 请使用LTS版本
    - report1.5以下版本请使用 node <= V14
    - report1.5及以上版本请使用 node >= V14
- [Jdk] 1.8

简易步骤

```
git clone https://gitee.com/belief-team/report.git
cd report
sh build.sh
编译完成放在build文件夹 aj-report-xxxx.zip

unzip aj-report-xxxx.zip
cd aj-report-xxxx
vim conf/bootstrap.yml 修改数据库连接、上传下载地址、jwt令牌等信息
sh bin/start.sh Linux启动
bin/start.bat Windows修改第4行的JAVA_HOME后(去掉rem注释)，双击启动

启动后访问
http://serverip:9095
用户名密码：admin/123456

```

### 前后端分离部署

**[前后端分离部署参考文档](https://ajreport.beliefteam.cn/report-doc/guide/quicklySeparate.html)** <br>

## 信息安全

### 修改密钥

```
启动前，切记配置文件中修改，修改默认的32位密钥，避免被伪造攻击，修改admin默认密码
spring.gaea.Security.jwtSecret = 修改32位jwt密钥
```

### 慎重公网

```
建议内网部署，避免公网攻击
```

## 快速入门

**[快速入门](https://ajreport.beliefteam.cn/report-doc/guide/quicklyUse.html)** <br>

**[更多社区大屏](https://ajreport.beliefteam.cn/report-doc/guide/bigScreenCase.html)** <br>

**[社区大屏下载链接](https://ajreport.beliefteam.cn/download/)** <br>

## SQL初始化

sql文件的目录在：report-core --> src --> main --> resources --> db.migration <br>
系统初始化时flyway会自动的将该目录下的sql文件执行，不需要手动执行sql文件，执行完将会创建
aj_report（存放系统基础数据）数据库 <br>

**注意：** 如果sql初始化有问题，请将bootstrap.yml中flyway改为false，并手动执行这些sql <br>

示例数据sql目录在：doc/example，有需要的请手动执行 <br>

## 谁在使用

感谢关注并使用AJ-Report的朋友，如果贵公司、组织、学校等正在使用AJ-Report，希望可以按照此[Issue](https://gitee.com/anji-plus/report/issues/I3ZXT4)
登记并提供贵公司、组织、学校的logo，我们将把贵方的logo放在项目首页进行展示并优先进行技术支持 <br>

<a href='http://www.jtit.com.cn/'><img src="doc/docs/picture/WhoIsUsing/17.png" width = "130" height = "50" /> </a>
<img src="doc/docs/picture/WhoIsUsing/5.png" width = "130" height = "50" alt="广东南铝建筑机器人科技有限公司"/>
<a href='http://www.plian.net/'><img src="doc/docs/picture/WhoIsUsing/4.png" width = "130" height = "50" /> </a>
<a href='http://www.turingoal.com/'><img src="doc/docs/picture/WhoIsUsing/3.png" width = "130" height = "50" /> </a>
<br>

<a href='http://www.yourongyun.cn/'><img src="doc/docs/picture/WhoIsUsing/12.png" width = "130" height = "50" /> </a>
<a href='https://www.yunstech.cn'> <img src="doc/docs/picture/WhoIsUsing/1.png" width = "130" height = "50" align=left/> </a>
<a href='http://www.fgkb.net/'><img src="doc/docs/picture/WhoIsUsing/2.png" width = "130" height = "50" /> </a>
<a href='https://soft.pusdn.com/'><img src="doc/docs/picture/WhoIsUsing/15.png" width = "130" height = "50" /> </a>
<br>

<a href='https://www.sandieji.tech/'><img src="doc/docs/picture/WhoIsUsing/9.png" width = "128" height = "130" /></a>
<img src="doc/docs/picture/WhoIsUsing/11.png" width = "128" height = "130" alt="北京易盛宁洲科技有限公司"/>
<img src="doc/docs/picture/WhoIsUsing/10.png" width = "128" height = "130" alt="光引科技"/>
<img src="doc/docs/picture/WhoIsUsing/8.png" width = "128" height = "130" alt="武汉微安信息科技有限公司"/>
<br>

<a href='https://www.zjjcl.cn/'><img src="doc/docs/picture/WhoIsUsing/16.png" width = "130" height = "50" /> </a>
<a href='https://www.wenkai.net/'><img src="doc/docs/picture/WhoIsUsing/13.png" width = "130" height = "50" /> </a>
<img src="doc/docs/picture/WhoIsUsing/7.png" width = "130" height = "50" />
<img src="doc/docs/picture/WhoIsUsing/6.jpeg" width = "130" height = "50" />
<img src="doc/docs/picture/WhoIsUsing/14.png" width = "130" height = "50" />
<br>

## 已知问题

- IE白屏（兼容性问题）

## 版本问题

已知以下版本存在兼容性问题，请不要使用

- Node.js 请根据实际使用的report版本调整
- openJdk
- Jdk 1.7及以下/11及以上（jdk11部分版本有问题）
- Mysql 8.0（8.0.23/26版本没有问题，8.0.21版本存在问题）

**[常见问题](https://ajreport.beliefteam.cn/report-doc/guide/question.html)**

## 商业授权

AJ-Report使用[Apache2.0开源协议](http://www.apache.org/licenses/LICENSE-2.0.html)
，允许商业使用，但务必保留类作者、Copyright信息。 <br>
个人和企业，在直接使用、二次开发后商业使用，需要遵守：

- 包含Apache LICENSE文件
- 如果修改了代码，需要在被修改的文件中说明
- 在修改和有源代码衍生的代码中，需要带有原来代码中的协议，商标
- 在二次开发后商业发布的产品中，使用了多个开源软件，则必须包含一个Notice文件，在Notice文件中需要带有Apache
  LICENSE。你可以在Notice中增加自己的许可，但不可以表现为对Apache
  LICENSE构成更改。

## 技术支持

**如有问题，请提交 [Issue](https://gitee.com/belief-team/report/issues) <br>**

个人微信：个人微信，不闲聊，加群、咨询请备注，备注格式不限但最好是：“项目名 + 问题” ，项目名可以是**AJ-Report**、**Report**、**大屏
**，只要能一眼分辨就行 <br>
例1：大屏 加群 <br>
例2：report 有个问题xxxx <br>
有问题，不管是技术问题还是使用问题，都尽量在群里问。加个人微信记得**一定要加备注 ！！！**<br>

<img src="https://foruda.gitee.com/images/1724817510954363329/305a6044_7492051.jpeg" width = "300" height = "450" align=left/>

## 更多支持

联系方式 <br>

<img src="https://foruda.gitee.com/images/1681893479845506596/859934b5_1950629.png" width = "300" height = "300" align=left/>

## 加入我们

- 提交PR是最快的加入方式:<br>
  · PR可以包含新功能、现有功能的改进。<br>
  . PR请提交到dev分支 <br>
- 提供文档原文或者文档链接:<br>
  . 文档原文的话，请放在doc/docs/guide/community目录下，也可直接提交pr <br>
  . 文档链接的话，文档需要完全的公开，不掺杂收费等相关内容，审核通过会放在首页 <br>
- 提供大屏模板:<br>
  . 可将自己设计好的大屏进行导出(不包含数据集)，将导出产生的压缩包提供给我们 <br>
  . 提供的大屏将会在AJ-Report在线演示环境进行展示和供其他人下载 <br>

#### 开源不易，劳烦各位star ☺

## 感谢JetBrains 的支持

#### JetBrains:[https://www.jetbrains.com/?from=AJ-Report](https://www.jetbrains.com/?from=AJ-Report"链接")

<br>

