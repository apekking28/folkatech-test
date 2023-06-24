package com.ilham.ecommerce.service;

import com.ilham.ecommerce.entity.User;
import com.ilham.ecommerce.exception.BadRequestException;
import com.ilham.ecommerce.exception.ResourceNotFoundException;
import com.ilham.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(String id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Pengguna dengan id " + id + " tidak ditemukan"));
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User create(User user) {
        if (!StringUtils.hasText(user.getId())) {
            throw new BadRequestException("Username harus di isi");
        }

        if (userRepository.existsById(user.getId())) {
            throw new BadRequestException("Username " + user.getId() + " sudah terdaftar");
        }
        if (!StringUtils.hasText(user.getEmail())) {
            throw new BadRequestException("Email harus di isi");
        }

        if (userRepository.existsByEmail(user.getEmail())) {
            throw new BadRequestException("Email " + user.getEmail() + " sudah terdaftar");
        }

        user.setIsAktif(true);
        return userRepository.save(user);
    }

}
