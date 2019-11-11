package com.sometest.config;

import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.sometest")
@PropertySource("jdbc.properties")
@Import(MyDataSource.class)
public class MyApplcationContext {
}
