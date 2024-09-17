package com.poc.sb.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder<?> dataSource = DataSourceBuilder.create();
        dataSource.driverClassName("org.h2.Driver");
        dataSource.url("jdbc:h2:mem:testdb");
        dataSource.username("sa");
        dataSource.password("");
        return dataSource.build();
    }
}
