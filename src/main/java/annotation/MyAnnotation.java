package annotation;

import java.lang.annotation.*;

/**
 * @version :1.0
 * @Author :qianxiangyun
 * @Date :2022/9/5
 * @Description annotation
 */
@Target(value = {ElementType.METHOD,ElementType.TYPE})
// 运行时有效
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@Inherited //
public @interface MyAnnotation {
}
