package com.ecommerce.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.AadharCard;

@Repository
public interface AadharCardRepositry extends JpaRepository<AadharCard, Long>{

}
