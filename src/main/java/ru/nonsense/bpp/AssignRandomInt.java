package ru.nonsense.bpp;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface AssignRandomInt {
    int min();
    int max();
}
