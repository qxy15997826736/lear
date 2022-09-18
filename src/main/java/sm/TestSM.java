package sm;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version :1.0
 * @Author :qianxiangyun
 * @Date :2022/3/14
 * @Description sm
 */
public class TestSM {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("sm/spring.xml");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory)context.getBean("sqlSessionFactory");
        SqlSession ss = sqlSessionFactory.openSession();
        System.out.println(ss);
        System.out.println(ss.getClass());
    }
}
