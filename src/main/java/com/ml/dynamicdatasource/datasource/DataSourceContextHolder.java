package com.ml.dynamicdatasource.datasource;

import com.ml.dynamicdatasource.datasource.enums.DS;

/**
 * @NAME: DataSourceContextHolder
 * @DATE: 2019/6/13
 * @Author Mr.MaL
 * @Description TODO
 **/
public class DataSourceContextHolder {

    private DataSourceContextHolder() {
    }

    private final static ThreadLocal<String> contextHolder = new InheritableThreadLocal<>();

    public  static void setDataSource(DS ds){
        contextHolder.set(ds.getName());
    }

    public static String getDataSource(){
        return contextHolder.get();
    }

    public static void remove(){
        contextHolder.remove();
    }

}
