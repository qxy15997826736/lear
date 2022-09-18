package aop;

/**
 * @version :1.0
 * @Author :qianxiangyun
 * @Date :2022/3/13
 * @Description aop
 */
// 原始业务对象 目标对象
public class EmpServiceImpl implements EmpService {

    @Override
    public void save(String name) {
        System.out.println("前置通知save dao");
        System.out.println("处理业务逻辑save dao");
    }

    @Override
    public void find(String name) {
        System.out.println("处理业务逻辑find dao");
    }
}
