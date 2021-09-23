package com.example.siteSpring.repos;

import com.example.siteSpring.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User,Long>{
    User findByUsername(String username);
}
