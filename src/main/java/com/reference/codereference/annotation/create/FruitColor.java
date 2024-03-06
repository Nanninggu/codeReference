package com.reference.codereference.annotation.create;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    enum Color {BLUE, RED, GREEN}

    Color fruitColor() default Color.GREEN;
}
