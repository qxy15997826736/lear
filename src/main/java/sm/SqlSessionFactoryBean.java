package sm;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.FactoryBean;

import java.io.InputStream;

/**
 * @version :1.0
 * @Author :qianxiangyun
 * @Date :2022/3/14
 * @Description sm
 */
//自定义SqlSessionFactory
public class SqlSessionFactoryBean implements FactoryBean<SqlSessionFactory> {
    private String configLocations;

    public void setConfigLocations(String configLocations) {
        this.configLocations = configLocations;
    }

    @Override
    public SqlSessionFactory getObject() throws Exception {
        InputStream is = Resources.getResourceAsStream(configLocations);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        return build;
    }

    @Override
    public Class<?> getObjectType() {
        return SqlSessionFactory.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
