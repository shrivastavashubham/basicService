package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Customer;

@Repository
public interface CustomerMasterJpaRepository extends JpaRepository<Customer, Long>{
	
	public Customer findById(Long id);

}
