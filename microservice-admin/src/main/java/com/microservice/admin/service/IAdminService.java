package com.microservice.admin.service;

import com.microservice.admin.entities.Admin;

import java.util.List;

public interface IAdminService {
    List<Admin> findAll();
    Admin findById(Long id);
    void save(Admin admin);
    void deleteById(Long id);
}
