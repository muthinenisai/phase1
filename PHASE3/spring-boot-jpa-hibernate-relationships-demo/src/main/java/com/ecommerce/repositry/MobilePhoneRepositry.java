package com.ecommerce.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.MobilePhone;

@Repository
public interface MobilePhoneRepositry extends JpaRepository<MobilePhone, Long>{

}