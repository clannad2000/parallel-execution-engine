package com.arun;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation used to capture names of methods marked as Parallelizable by clients
 * 使用java语言中的注解生成器生成代码
 * https://blog.csdn.net/justxuemin/article/details/72804134
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Parallelizable {

}
