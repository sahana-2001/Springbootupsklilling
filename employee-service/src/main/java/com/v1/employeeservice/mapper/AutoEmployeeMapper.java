package com.v1.employeeservice.mapper;

import com.v1.employeeservice.dto.EmployeeDto;
import com.v1.employeeservice.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoEmployeeMapper {

    AutoEmployeeMapper AUTO_EMPLOYEE_MAPPER = Mappers.getMapper(AutoEmployeeMapper.class);

    /**
     * mapping to EmployeeDto
     * @param employee
     * @return
     */
    EmployeeDto mapToEmployeeDto(Employee employee);

    /**
     * mapping to Employee
     * @param employeeDto
     * @return
     */
    Employee mapToEmployee(EmployeeDto employeeDto);

}
