package init;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @version :1.0
 * @Author :qianxiangyun
 * @Date :2022/3/8
 * @Description init
 */
public class UserServiceImpl implements UserService{
    //这样是由自己创建
    //private UserDao u = new UserDaoImpl();

    private UserDao u;
    private String name;
    private Integer age;

    private Double count;
    private Date dir;

    private String[] aa;
    private UserDao[] userDaos;
    private List<String> hbb;
    private Map<String,String> maps;

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setHbb(List<String> hbb) {
        this.hbb = hbb;
    }

    public void setUserDaos(UserDao[] userDaos) {
        this.userDaos = userDaos;
    }

    public void setAa(String[] aa) {
        this.aa = aa;
    }

    public void setDir(Date dir) {
        this.dir = dir;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setU(UserDao u) {
        this.u = u;
    }

    @Override
    public void save(String name) {
        System.out.println("Service name " + name);
        u.save("dao");
        System.out.println("name = " + this.name);
        System.out.println("age" + this.age);
        System.out.println("date" + this.dir);
        for (String a : aa){
            System.out.println("a" + a);
        }
        for (UserDao a : userDaos){
            System.out.println("UserDao" + a);
        }
        for (String s : hbb) {
            System.out.println("s" + s);
        }
        System.out.println(maps.get("key") + maps.get("value"));

    }
}
