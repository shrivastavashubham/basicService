package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Service.CrudService;

@RestController
@CrossOrigin
public class CrudController {

	@Autowired
	CrudService crudService;
	
	@RequestMapping(value = "addCustomer", method = RequestMethod.POST)
	public @ResponseBody Object addElement(@RequestBody Customer customer) {
		return crudService.addCutsomer(customer);
	}
	
	@RequestMapping(value = "getCustomer/{custId}", method = RequestMethod.GET)
	public @ResponseBody Object getElement(@PathVariable Long custId) {
		return crudService.showCutsomer(custId);
	}
	
	@RequestMapping(value = "deleteCustomer/{custId}", method = RequestMethod.GET)
	public @ResponseBody Object deleteElement(@PathVariable Long custId) {
		return crudService.deleteCutsomer(custId);
	}
	
	@RequestMapping(value = "updateCustomer", method = RequestMethod.POST)
	public @ResponseBody Object updateElement(@RequestBody Customer customer) {
		return crudService.updateCutsomer(customer);
	}
	
	@RequestMapping(value = "showAll", method = RequestMethod.GET)
	public @ResponseBody Object addElement() {
		return crudService.showAll();
	}
}
