package init;

/**
 * @version :1.0
 * @Author :Hannigan
 * @Date :2022/3/8
 * @Description init
 */
public class TestUser {
    public static void main(String[] args) {
        UserDaoImpl u = new UserDaoImpl();
        u.save("123");
    }
}
