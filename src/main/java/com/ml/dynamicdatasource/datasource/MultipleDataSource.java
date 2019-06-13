package com.ml.dynamicdatasource.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @NAME: MultipleDataSource
 * @DATE: 2019/6/13
 * @Author Mr.MaL
 * @Description TODO
 **/
public class MultipleDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDataSource();
    }
}
