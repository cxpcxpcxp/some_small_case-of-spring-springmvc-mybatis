package com.ioc_anno.service;

import com.ioc_anno.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUserService {
    public List<User> findAll();
}
