package study;

/**
 * @version :1.0
 * @Author :qianxiangyun
 * @Date :2022/3/8
 * @Description study
 */
public class StudentDaoImpl implements StudentDao{
    @Override
    public void save(String name) {
        System.out.println(name);
    }

}
