package com.ldh.javacore.annotation;

import java.lang.annotation.Repeatable;

/**
 * Created on 2018/6/14.
 */
@Repeatable(Persons.class)
public @interface Person {
    public String role() default "";
}
