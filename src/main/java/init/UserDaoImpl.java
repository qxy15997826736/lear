package init;

/**
 * @version :1.0
 * @Author :qianxiangyun
 * @Date :2022/3/8
 * @Description init
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void save(String name) {
        System.out.println("name" + name);
    }
}
