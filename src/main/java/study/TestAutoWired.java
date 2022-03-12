package study;

import init.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version :1.0
 * @Author :qianxiangyun
 * @Date :2022/3/8
 * @Description study
 */
public class TestAutoWired {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ApplicationContext context = new ClassPathXmlApplicationContext("study/spring.xml");
        StudentService studentService = (StudentServiceImpl) context.getBean("studentService");
        StudentService studentService1 = (StudentServiceImpl) context.getBean("studentService");
        System.out.println(studentService == studentService1);
        //反射
        StudentService  aa = (StudentService)Class.forName("study.StudentServiceImpl").newInstance();
        System.out.println(aa);
    }

}
