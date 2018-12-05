
- [经典Java面试题收集 basoc](https://juejin.im/post/5aa87d4f6fb9a028b410c0b9)
- [经典Java面试题收集](https://juejin.im/post/5aa9925e518825557459692c)


Math.round(11.5)的返回值是12，Math.round(-11.5)的返回值是-11。四舍五入的原理是在参数上加0.5然后进行下取整。
String 类是final类，不可以被继承。

：方法的重载和重写都是实现多态的方式，区别在于前者实现的是编译时的多态性，而后者实现的是运行时的多态性。重载发生在一个类中，同名的方法如果有不同的参数列表（参数类型不同、参数个数不同或者二者都不同）则视为重载；重写发生在子类与父类之间，重写要求子类被重写方法与父类被重写方法有相同的返回类型，比父类被重写方法更好访问，不能比父类被重写方法声明更多的异常（里氏代换原则）。重载对返回类型没有特殊的要求。

加载
连接（验证、准备[为静态变量分配内存并设置默认的初始值]和解析[将符号引用替换为直接引用]）
初始化
1)如果类存在直接的父类并且这个类还没有被初始化，那么就先初始化父类
2)如果类中存在初始化语句，就依次执行这些初始化语句。 类的加载是由类加载器完成的，类加载器包括：根加载器（BootStrap）、扩展加载器（Extension）

如何取得年月日、小时分钟秒？
```java
public class DateTimeTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));    // 0 - 11
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));

        // Java 8
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt.getYear());
        System.out.println(dt.getMonthValue());     // 1 - 12
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getHour());
        System.out.println(dt.getMinute());
        System.out.println(dt.getSecond());
    }
}

```
如何取得从1970年1月1日0时0分0秒到现在的毫秒数？
```java
Calendar.getInstance().getTimeInMillis();
System.currentTimeMillis();
Clock.systemDefaultZone().millis(); // Java 8
```
如何取得某月的最后一天？
```java
Calendar time = Calendar.getInstance();
time.getActualMaximum(Calendar.DAY_OF_MONTH);
```
如何格式化日期？
利用java.text.DataFormat 的子类（如SimpleDateFormat类）中的format(Date)方法可将日期格式化。Java 8中可以用java.time.format.DateTimeFormatter来格式化时间日期，代码如下所示。
```java
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

class DateFormatTest {

    public static void main(String[] args) {
        SimpleDateFormat oldFormatter = new SimpleDateFormat("yyyy/MM/dd");
        Date date1 = new Date();
        System.out.println(oldFormatter.format(date1));

        // Java 8
        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date2 = LocalDate.now();
        System.out.println(date2.format(newFormatter));
    }
}
```
打印昨天的当前时刻。
```java
import java.util.Calendar;
import java.time.LocalDateTime;

class YesterdayCurrent {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        System.out.println(cal.getTime());

        // java 8
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime yesterday = today.minusDays(1);
        System.out.println(yesterday);
    }
}
```

列出一些你常见的运行时异常？
    ArithmeticException（算术异常）
    ClassCastException （类转换异常）
    IllegalArgumentException （非法参数异常）
    IndexOutOfBoundsException （下标越界异常）
    NullPointerException （空指针异常）
    SecurityException （安全异常）



```
JSP有9个内置对象：

request：封装客户端的请求，其中包含来自GET或POST请求的参数；
response：封装服务器对客户端的响应；
pageContext：通过该对象可以获取其他对象；
session：封装用户会话的对象；
application：封装服务器运行环境的对象；
out：输出服务器响应的输出流对象；
config：Web应用的配置对象；
page：JSP页面本身（相当于Java程序中的this）；
exception：封装页面抛出异常的对象。

讲解JSP中的四种作用域。
答：JSP中的四种作用域包括page、request、session和application，具体来说：

page代表与一个页面相关的对象和属性。
request代表与Web客户机发出的一个请求相关的对象和属性。一个请求可能跨越多个页面，涉及多个Web组件；需要在页面显示的临时数据可以置于此作用域。
session代表与某个用户与服务器建立的一次会话相关的对象和属性。跟某个用户相关的数据应该放在用户自己的session中。
application代表与整个Web应用程序相关的对象和属性，它实质上是跨越整个Web应用程序，包括多个页面、请求和会话的一个全局作用域。

如何实现JSP或Servlet的单线程模式？
<%@page isThreadSafe=”false”%>

obj - HttpServletRequest
fun - getSession
fun - setAttribute
fun - getAttribute
HttpSession

过滤器相关的接口主要有：Filter、FilterConfig和FilterChain。

监听器有哪些作用和用法？
答：Java Web开发中的监听器（listener）就是application、session、request三个对象创建、销毁或者往其中添加修改删除属性时自动执行代码的功能组件，如下所示：
①ServletContextListener：对Servlet上下文的创建和销毁进行监听。
②ServletContextAttributeListener：监听Servlet上下文属性的添加、删除和替换。
③HttpSessionListener：对Session的创建和销毁进行监听。

补充：session的销毁有两种情况：1). session超时（可以在web.xml中通过<session-config>/<session-timeout>标签配置超时时间）；2). 通过调用session对象的invalidate()方法使session失效。

④HttpSessionAttributeListener：对Session对象中属性的添加、删除和替换进行监听。
⑤ServletRequestListener：对请求对象的初始化和销毁进行监听。
⑥ServletRequestAttributeListener：对请求对象属性的添加、删除和替换进行监听。

web.xml用于配置Web应用的相关信息，如：监听器（listener）、过滤器（filter）、 Servlet、相关参数、会话超时时间、安全验证方式、错误页面等，下面是一些开发中常见的配置：

```

EL的隐式对象包括：pageContext、initParam（访问上下文参数）、param（访问请求参数）、paramValues、header（访问请求头）、headerValues、cookie（访问cookie）、applicationScope（访问application作用域）、sessionScope（访问session作用域）、requestScope（访问request作用域）、pageScope（访问page作用域）
```js
${pageContext.request.method}
${pageContext["request"]["method"]}
${pageContext.request["method"]}
${pageContext["request"].method}
${initParam.defaultEncoding}
${header["accept-language"]}
${headerValues["accept-language"][0]}
${cookie.jsessionid.value}
${sessionScope.loginUser.username}
```

```js
// jsp
<%-- 静态包含 --%>
<%@ include file="..." %>

<%-- 动态包含 --%>
<jsp:include page="...">
    <jsp:param name="..." value="..." />
</jsp:include>
```
