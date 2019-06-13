package com.ml.dynamicdatasource.aspect;

import com.ml.dynamicdatasource.datasource.DataSourceContextHolder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @NAME: DataSourceAspect
 * @DATE: 2019/6/13
 * @Author Mr.MaL
 * @Description TODO
 **/
@Component
@Aspect
public class DataSourceAspect {

    @Pointcut("@within(com.ml.dynamicdatasource.aspect.DataSource) || @target(com.ml.dynamicdatasource.aspect.DataSource)")
    public void pointCut(){

    }

    @Before("@annotation(dataSource)")
    public void doBefore(DataSource dataSource) {
        DataSourceContextHolder.setDataSource(dataSource.value());
    }


    @After("pointCut()")
    public void doAfter(){
        DataSourceContextHolder.remove();
    }

}
