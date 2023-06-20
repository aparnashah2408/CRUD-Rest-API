package net.javaguides.SpringBoot.controller;

import net.javaguides.SpringBoot.exception.ResourceNotFoundException;
import net.javaguides.SpringBoot.model.Employee;
import net.javaguides.SpringBoot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;


    //this api will return a list of employee to the client
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    //build create employee rest api
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    //build getemployeebyid rest api
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee does not exist with ID "+id));
        return ResponseEntity.ok(employee);
    }

    //update employee rest api
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id,@RequestBody Employee employeeDetails){
        Employee updateEmployee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("no employee with id "+id));
        updateEmployee.setFirstName(employeeDetails.getFirstName());
        updateEmployee.setLastName(employeeDetails.getLastName());
        updateEmployee.setEmailId(employeeDetails.getEmailId());

        employeeRepository.save(updateEmployee);
        return ResponseEntity.ok(updateEmployee);
    }

    //build delete employee
    @DeleteMapping("{id}")
    public ResponseEntity<Employee> deleteEmp(@PathVariable long id){
        Employee emp = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No employee by id "+id));
        employeeRepository.delete(emp);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

