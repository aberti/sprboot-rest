package com.example;

import com.example.domain.Employee;
import com.example.domain.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @PostConstruct
    private void init(){
        Employee employee = new Employee();
        employee.setFirstname("aber aber");
        employee.setLastName("ber");
        employee.setTitle("ble ble ble");
        repository.save(employee);
    }

}
