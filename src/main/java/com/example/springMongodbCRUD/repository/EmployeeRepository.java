package com.example.springMongodbCRUD.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springMongodbCRUD.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer>{

}
