package com.mars.core.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MarsTest {

    /**
     * main方法所在的类
     * @return 类
     */
    Class testClass();

    /**
     * 指定使用哪个配置文件
     * @return 配置环境
     */
    String config() default "";
}
