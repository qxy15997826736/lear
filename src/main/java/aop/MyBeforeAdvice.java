package aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @version :1.0
 * @Author :qianxiangyun
 * @Date :2022/3/13
 * @Description aop
 */
// 自定义记录业务方法名称前置通知 :开发额外功能
public class MyBeforeAdvice implements MethodBeforeAdvice {
    /**
     *
     * @param method 当前执行方法对象
     * @param objects 当前执行方法的参数
     * @param o 目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("===================前置通知===================");
        System.out.println("当前执行方法：" + method.getName());
        System.out.println("当前执行方法参数：" + objects[0]);
        System.out.println("目标对象：" + o);
    }
}
