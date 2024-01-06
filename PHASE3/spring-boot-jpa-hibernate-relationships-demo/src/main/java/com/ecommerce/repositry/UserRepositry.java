package com.ecommerce.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.User;

@Repository
public interface UserRepositry extends JpaRepository<User, Long>{

}
