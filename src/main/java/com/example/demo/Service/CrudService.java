package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Repository.CustomerMasterJpaRepository;

@Service
public class CrudService {

	@Autowired
	CustomerMasterJpaRepository customerMasterJpaRepository;

	public Customer addCutsomer(Customer customer) {
		if (customer != null) {
			customerMasterJpaRepository.save(customer);
			return customer;
		}
		return null;
	}

	public Customer showCutsomer(Long custId) {
		if (custId != 0 && custId != null) {
			return customerMasterJpaRepository.findById(custId);
		}
		return null;
	}

	public String deleteCutsomer(Long custId) {
		if (custId != null && custId != 0) {
			customerMasterJpaRepository.delete(custId);
			return "Success";
		}
		return "Failure";
	}

	public List<Customer> showAll() {
		return customerMasterJpaRepository.findAll();
	}

	public Customer updateCutsomer(Customer customer) {

		if (customer != null) {
			customerMasterJpaRepository.save(customer);
			return customer;
		}
		return null;

	}

}
