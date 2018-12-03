
- [junit web](https://blog.csdn.net/u011138533/article/details/52165577)


```java
package gdut.bai.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class UserEntityTest {

    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void setUp() throws Exception {
        // 1.创建配置对象
        Configuration config = new Configuration().configure();
        // 2.创建服务注册对象
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        // 3.创建会话工厂对象
        sessionFactory = config.buildSessionFactory(serviceRegistry);
        // 4.会话对象
        session  = sessionFactory.openSession();
        // 5.开启事务
        transaction = session.beginTransaction();
    }

    @After
    public void tearDown() throws Exception {
        transaction.commit(); // 提交事务
        session.close(); // 关闭会话
        sessionFactory.close(); // 关闭会话工厂
    }

    @Test
    public void UserEntityTest(){
        UserEntity userEntity = new UserEntity(1, "name", "123", "dd", "ddd");
        session.save(userEntity);
    }

}
```