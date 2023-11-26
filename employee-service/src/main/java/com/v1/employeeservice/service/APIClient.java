package com.v1.employeeservice.service;

import com.v1.employeeservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "DEPARTMENT-SERVICE")
//@FeignClient(url = "http://localhost:8083" ,value = "DEPARTMENT-SERVICE")
public interface APIClient {

    @GetMapping("/api/departments/{department-code}")
    DepartmentDto getDepartment(@PathVariable("department-code") String departmentCode);
}
