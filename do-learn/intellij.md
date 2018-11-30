
- 配置

- [pom 配置例子](https://github.com/bmuschko/whats-new-in-java-11/blob/master/pom.xml)
- 
  ![in01](../img/in01.png)

  ![in02](../img/in02.png)

  ![in03](../img/in03.png)

``` xml
    <properties>
      <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.7.0</version>
                <configuration>
                    <source>11</source>
                    <target>11</target>
                    <fork>true</fork>
                </configuration>
            </plugin>
        </plugins>
    </build>
```

## 创建 model
 ![in04](../img/in04.png)

 ![in05](../img/in05.png)
 
 ![in06](../img/in06.png)

 ![in07](../img/in07.png)

- 本地路径
 ![in08](../img/in08.png)

- model Java 文件创建
 ![in09](../img/in09.png)

- package 创建
 ![in10](../img/in10.png)


 ![in01](../img/in01.png)


 ![in01](../img/in01.png)
