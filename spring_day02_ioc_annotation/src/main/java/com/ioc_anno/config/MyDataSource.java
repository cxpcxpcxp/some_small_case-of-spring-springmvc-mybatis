package com.ioc_anno.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
public class MyDataSource {
    @Value("${db.driver}")
    private String driver;

    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @Bean("dataSource")
    public DataSource getDataSource(){
        ComboPooledDataSource DataSource = new ComboPooledDataSource();
        try {
            DataSource.setDriverClass(driver);
            DataSource.setJdbcUrl(url);
            DataSource.setUser(username);
            DataSource.setPassword(password);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        return DataSource;
    }

    @Bean("template")
    public JdbcTemplate getTemplate(DataSource dataSource){
        JdbcTemplate template = new JdbcTemplate(dataSource);
        return template;
    }
}
