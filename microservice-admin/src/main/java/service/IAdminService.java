package service;

import entities.Admin;

import java.util.List;

public interface IAdminService {
    List<Admin> findAll();
    Admin findById(Long id);
    void save(Admin admin);
    void deleteById(Long id);
}
