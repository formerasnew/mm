package com.chz.libnavannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
* fragment注解处理器
* */
@Target(ElementType.TYPE)
public @interface FragmentDestination {
    String pageUrl();
    boolean needLogin() default false;
    boolean asStarter() default false;
}
