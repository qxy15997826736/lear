package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version :1.0
 * @Author :qianxiangyun
 * @Date :2022/3/13
 * @Description aop
 */
public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/spring.xml");
        EmpService empService = (EmpService) context.getBean("empService");
        System.out.println(empService.getClass());
        empService.find("小弟");
    }
}
