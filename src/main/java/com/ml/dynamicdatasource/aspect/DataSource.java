package com.ml.dynamicdatasource.aspect;

import com.ml.dynamicdatasource.datasource.enums.DS;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {

    DS value() default DS.DS0;

}
