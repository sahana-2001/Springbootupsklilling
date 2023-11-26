package com.v1.employeeservice.service;

import com.v1.employeeservice.dto.APIResponseDto;
import com.v1.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long id);
}
