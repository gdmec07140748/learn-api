- [maven 使用](http://wiki.jikexueyuan.com/project/maven/project-templates.html)

- [Apache Maven 入门篇 ( 上 )](https://www.oracle.com/technetwork/cn/community/java/apache-maven-getting-started-1-406235-zhs.html)

- clean 删除 target

- 编译 mvn compile

- 测试 mvn test

- 打包 mvn package

- install 安装 jar 包到本地仓库中

- expected START_TAG or END_TAG not TEXT 错误 重新敲一遍

```xml
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>

  <!-- 制定 pom 版本 -->
  <modelVersion>4.0.0</modelVersion>
  <!--
    默认 war
     jar zip pom
   -->
  <packaging>war</packaging>
   <!-- 项目名 -->
  <name>mavenintel-demo</name>
  <!--
    第一个 0 表示 大写版本号
    第二个 0 表示 分支版本号
    第三个 0 表示 小版本号
    0.0.1
    snapshot 快照
    alpha 内部测试
    beta 公测
    Release 发布
    GA 正式发布
   -->
  <version>1.0-SNAPSHOT</version> 

  <dependencies>
    <dependency>
      <groupId>com.imooc.mavenintel</groupId>
      <artifactId>[the artifact id of the block to be mounted]</artifactId>
      <version>1.0-SNAPSHOT</version>
      <type></type>
      <!-- 依赖范围：只存在测试 默认：compile 
        compile 编译测试运行都有效
        provided 编译测试有效
        runtime 测试和运行有效
        test 只在测试有效
        system 与本机系统关联，可移植性差
        import 导入的范围，它只使用在 dependencyManagement 中，表示从其他 pom 导入 dependency 的配置
        地址： https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html
      -->
      <scope>test</scope>
      <!-- 设置依赖是否可选 false -->
      <optional></optional>
      <!-- 排除依赖传递列表 -->
      <exclusions>
        <exclusion></exclusion>
      </exclusions>
    </dependency>
  </dependencies>
  </dependencies>

  <!-- 依赖管理 -->
  <dependencyManagement>
    <dependencies></dependencies>
  </dependencyManagement>

  <build>
    <!-- 插件列表 -->
    <plugins>
      <plugin>
        <groupId>org.mortbay.jetty</groupId>
        <artifactId>maven-jetty-plugin</artifactId>
        <version>6.1.7</version>
        <configuration>
          <connectors>
            <connector implementation="org.mortbay.jetty.nio.SelectChannelConnector">
              <port>8888</port>
              <maxIdleTime>30000</maxIdleTime>
            </connector>
          </connectors>
          <webAppSourceDirectory>${project.build.directory}/${pom.artifactId}-${pom.version}</webAppSourceDirectory>
          <contextPath>/</contextPath>
        </configuration>
      </plugin>
    </plugins>
  </build>

  <!-- 继承 -->
  <parent></parent>
  <!-- 指定多个模块一起编译 -->
  <modules>
    <module>../hongxing-bge</module>
  </modules>
```

- install - jar 包 加入本地仓库，其他项目可以引入

- mvn archetype:generate 生成 骨架

- mvn archetype:generate -DgroupId=com.imooc.maven04 -DartifactId=maven04-demo -Dversion=1.0.0SNAPSHOT -Dpackage=com.imooc.maven04.demo
    - -DgroupId=组织名，公司网址反写+项目名
    - -DartifactId=项目名-模块名
    - -Dversion=版本号
    - -Dpackage=代码所在包名

- settings 更改本地仓库地址     localRepository

- site 生成站点

- 依赖冲突
    - 短路优先
    - 谁先声明谁优先

- mvn jetty:run    