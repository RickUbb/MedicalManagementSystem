package service;

import entities.Admin;
import persistence.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService implements IAdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public List<Admin> findAll() {
        return (List<Admin>) adminRepository.findAll();
    }

    @Override
    public Admin findById(Long id) {
        return adminRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Admin admin) {
        adminRepository.save(admin);
    }

    @Override
    public void deleteById(Long id) {
        adminRepository.deleteById(id);
    }
}
