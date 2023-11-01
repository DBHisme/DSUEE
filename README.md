# DSUEE
# 项目名称
烧结工序极致能效减碳技术数字化系统（Digital System for Ultimate Energy Efficiency and Carbon Reduction Technology in Sintering Process）

## 功能特性
整合文件上传、多级缓存、数据库主从复制读写分离、多线程高并发等一系列技术，使得该系统通过将输入各种参数和选择不同的模型，实现了烧结工序能耗的计算和用料情况的实时展示，同时具备历史数据保存、文献查询等功能。使用该系统可以进行烧结工序模拟能耗，也可以部署到钢厂的炼钢设备上直接采集数据，然后在该可视化系统上显示。

## 技术堆栈

编程语言：Java、Vue3、JavaScript等
后端框架：Spring
前端框架：Vue.js
数据库：MySQL
版本控制：使用版本控制系统Git来管理代码
部署工具：Docker
开发工具：IntelliJ IDEA、Visual Studio Code
云服务提供商：Google Cloud

## 安装和使用
我上传到仓库的是前端项目和后端项目，可以手动使用vscode打开前端项目，idea打开后端项目，再引入database，修改配置依赖，最后启动后端和前端即可使用

### 安装
以下是在项目中使用 Spring Boot 和 Vue 3 时的安装步骤和依赖项。

前端依赖项（Vue 3）
确保你的电脑已经安装了 Node.js。你可以在终端中运行 node -v 命令来验证。
在你的项目根目录下，打开终端，并运行以下命令来初始化一个新的 Vue 3 项目：
$ vue create .
这将创建一个新的 Vue 3 项目，并安装相关依赖项。
根据你的需求选择所需的插件和配置选项。
一旦初始化完成，你可以运行以下命令来启动 Vue 3 项目的开发服务器：
$ npm run serve
# frontend
首次启动前
npm install
#### 使用说明
启动
npm run serve
如果启动失败执行
$env:NODE_OPTIONS="--openssl-legacy-provider"
再执行
npm run serve
后端依赖项（Spring Boot）
确保你的电脑已经安装了 Java Development Kit (JDK)。你可以在终端中运行 java -version 命令来验证。
在你的项目中使用 Spring Boot，你可以使用 Maven 或 Gradle 进行构建管理。确保你已经在项目中正确配置了 Maven 。
在你的项目中添加 Spring Boot 的相关依赖项。你可以在 Maven 或 Gradle 的配置文件中添加所需的依赖项，以获取 Spring Boot 的功能和类库。
完成以上步骤后，项目就可以在 Spring Boot 和 Vue 3 的基础上运行起来了。
$ npm install
