package com.sometest.service.impl;

import com.sometest.dao.IRoleDAO;
import com.sometest.pojo.Role;
import com.sometest.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private IRoleDAO roleDAO;
    @Override
    public List<Role> findAll() {
        return roleDAO.findAll();
    }
}
