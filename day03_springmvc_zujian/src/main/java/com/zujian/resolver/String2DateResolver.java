package com.zujian.resolver;

import org.springframework.core.convert.converter.Converter;
import org.springframework.format.datetime.DateFormatterRegistrar;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class String2DateResolver implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        System.out.println(s);
        Date date = null;
        SimpleDateFormat dateFormat = null;
        try {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            date = dateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }
}
