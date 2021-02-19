package com.example.files_download.controllers.dao;

import com.example.files_download.controllers.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface UserDAO extends JpaRepository<User, Integer> {


}
