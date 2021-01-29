package com.chz.libnavannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
/*
* Activity注解处理器
* */
@Target(ElementType.TYPE)
public @interface ActivityDestination {
    String pageUrl();
    boolean needLogin() default false;
    boolean asStarter() default false;
}
