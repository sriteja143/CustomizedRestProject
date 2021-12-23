package com.sriteja.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.sriteja.entity.Employee;

@RepositoryRestResource(path = "emp")
public interface EmpRepo extends CrudRepository<Employee, Long> {
	 @RestResource(path = "names")
	 List<Employee> findByEmpname(String name);
}
