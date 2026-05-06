package com.mani.demo.repository;

import com.mani.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <Users, Long>{

}
