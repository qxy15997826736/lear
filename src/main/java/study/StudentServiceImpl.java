package study;

/**
 * @version :1.0
 * @Author :qianxiangyun
 * @Date :2022/3/8
 * @Description study
 */
public class StudentServiceImpl implements StudentService{
    private StudentDaoImpl studentDao;

    public void setStudentDao(StudentDaoImpl studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void save(String name) {
        System.out.println(name);
        studentDao.save(name);
    }
    public void init(){
        System.out.println("初始化");
    }
    public void destory(){
        System.out.println("初始化");
    }
}
