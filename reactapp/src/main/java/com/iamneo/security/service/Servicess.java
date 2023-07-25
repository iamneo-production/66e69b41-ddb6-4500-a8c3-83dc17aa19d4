package com.iamneo.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iamneo.security.entity.VendorEntity;
import com.iamneo.security.repository.VendorRepository;

public class Servicess {
	@Autowired
	public VendorRepository employeeRepo;
	public boolean addEmployee(VendorEntity employee)
	{
	return employeeRepo.save(employee)!=null?true:false;
	}
	public List <VendorEntity> getAllEmployees()
	{
	return employeeRepo.findAll();
	}

	public String deleteCart(int id) {
	employeeRepo.deleteById(id);
	return "Delete the item "+id;
	}
}
