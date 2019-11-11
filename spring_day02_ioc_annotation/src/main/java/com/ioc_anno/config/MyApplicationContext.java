package com.ioc_anno.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com.ioc_anno")
@Import(MyDataSource.class)
@PropertySource("jdbc.properties")
public class MyApplicationContext {
}
