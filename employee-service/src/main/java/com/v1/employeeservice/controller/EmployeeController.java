package com.v1.employeeservice.controller;

import com.v1.employeeservice.dto.APIResponseDto;
import com.v1.employeeservice.dto.EmployeeDto;
import com.v1.employeeservice.entity.Employee;
import com.v1.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    /**
     * Create Employee
     * http://localhost:8082/api/employees/create
     * @param employeeDto
     * @return
     */
    @PostMapping("/create")
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto saveEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);

    }

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getEmployeeById(@PathVariable("id") Long employeeId){
        APIResponseDto apiResponseDto = employeeService.getEmployeeById(employeeId);
        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }
}
