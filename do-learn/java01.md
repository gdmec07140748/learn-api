
- 安装目录 - D:\java

- [Java 模块 视频](https://www.imooc.com/video/17231)

- [IntelliJ IDEA神器使用技巧 视频](https://www.imooc.com/video/16228)

- [SpringMVC](https://www.imooc.com/video/9338)

- [Hibernate](https://www.imooc.com/learn/524)

- [jdk11 安装](https://jingyan.baidu.com/article/d3b74d64164d361f77e60938.html)

- [maven 安装](https://jingyan.baidu.com/article/22a299b5e8a3829e19376a8e.html)

- [intellij idea 安装](https://jingyan.baidu.com/article/afd8f4debd60f434e286e91f.html)

- [intellij idea 破解](https://www.cnblogs.com/aacoutlook/p/9036299.html)

- []()
- []()
- []()


- 建议将现在的仓库变为国内的仓库,改Maven开发包中的"conf/settings.xml"文件
``` xml
    <mirror>
        <id>nexus-pentaho</id>
        <mirrorOf>central</mirrorOf>
        <name>Nexus pentaho</name>
        <url>https://nexus.pentaho.org/content/repositories/omni/</url>
    </mirror>
    
     <!-- 中央仓库1 -->
    <mirror>
        <id>repo1</id>
        <mirrorOf>central</mirrorOf>
        <name>Human Readable Name for this Mirror.</name>
        <url>http://repo1.maven.org/maven2/</url>
    </mirror>

    <!-- 中央仓库2 -->
    <mirror>
        <id>repo2</id>
        <mirrorOf>central</mirrorOf>
        <name>Human Readable Name for this Mirror.</name>
        <url>http://repo2.maven.org/maven2/</url>
    </mirror>
``` 