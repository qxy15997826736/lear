package init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version :1.0
 * @Author :qianxiangyun
 * @Date :2022/3/8
 * @Description init
 */
public class TestDI {
    public static void main(String[] args) throws ClassNotFoundException {
        //启动工厂，读取resoures下的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("init/spring.xml");
        UserService se = (UserService) context.getBean("userService");
        se.save("service");

        Class a = Class.forName("init.UserServiceImpl");
        System.out.println(a.getName());
    }
}
