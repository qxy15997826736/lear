package init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version :1.0
 * @Author :qianxiangyun
 * @Date :2022/3/8
 * @Description init
 */
public class TestSpring {
    public static void main(String[] args) {
        //启动工厂，读取resoures下的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("init/spring.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.save("333");
        UserDaoImpl UserDaoImp = (UserDaoImpl) context.getBean("userDao");
        UserDaoImp.save("teeg");
        UserDao userDao1 = (UserDao) context.getBean("userDao");
        userDao1.save("sss");
        System.out.println("tetet");
    }
}
