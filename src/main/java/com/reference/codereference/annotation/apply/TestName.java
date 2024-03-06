package com.reference.codereference.annotation.apply;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TestName {
    String value() default "";
}