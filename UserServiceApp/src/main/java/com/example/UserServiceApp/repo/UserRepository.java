package com.example.UserServiceApp.repo;



import com.example.UserServiceApp.entity.UserAll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserAll, Long> {
    UserAll findByUsername(String username);
}

