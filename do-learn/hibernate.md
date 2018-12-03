- [youtube](https://www.youtube.com/watch?v=ULw3FdgaLp0)

- [imooc](https://www.imooc.com/video/7714)

- Mybatis 

- 创建 hibernate 的配置文件

```xml
<!DOCTYPE hibernate-configuration PUBLIC
    "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
    "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
    <!-- 通常，一个session-factory节点代表一个数据库 -->
    <session-factory>
    
        <!-- 1. 数据库连接配置 -->
        <property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
        <property name="hibernate.connection.url">jdbc:mysql:///hib_demo?useUnicode=true&amp;characterEncoding=UTF8</property>
        <property name="hibernate.connection.username">root</property>
        <property name="hibernate.connection.password">root</property>
        <!-- 
                数据库方法配置，hibernate在运行的时候，会根据不同的方言生成符合当前数据库语法的sql
        -->
        <property name="hibernate.dialect">org.hibernate.dialect.MySQL5Dialect</property>
        
        <!-- 2. 其他相关配置 -->
        <!-- 2.1 显示hibernate在运行时候执行的sql语句 -->
        <property name="hibernate.show_sql">true</property>
        <!-- 2.2 格式化sql -->
        <property name="hibernate.format_sql">true</property>
        <!-- 2.3 自动建表  -->
        <property name="hibernate.hbm2ddl.auto">update</property>
        
        <!-- 3. 加载所有映射 -->
        <mapping resource="com/yif/a_hello/Employee.hbm.xml"/>
        
    </session-factory>
</hibernate-configuration>
```

- 创建持久类
    - 1.公有的类
    - 2.提供公有的不带参数的默认的构造方法
    - 3.属性私有
    - 4.属性 getter / setter 封装


- 创建对象-关系映射文件

- 通过 hibernate API 编写访问数据库的代码

Error:(24, 79) java: 无法将类 org.hibernate.boot.registry.StandardServiceRegistryBuilder中的方法 applySetting应用到给定类型;
  需要: java.lang.String,java.lang.Object
  找到: java.util.Properties
  原因: 实际参数列表和形式参数列表长度不同