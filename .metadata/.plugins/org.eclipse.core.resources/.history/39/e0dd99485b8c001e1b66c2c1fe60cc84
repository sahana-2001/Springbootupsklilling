package com.v1.departmentservice.mapper;

import com.v1.departmentservice.dto.DepartmentDto;
import com.v1.departmentservice.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoDepartmentMapper {

    AutoDepartmentMapper AUTO_DEPARTMENT_MAPPER = Mappers.getMapper(AutoDepartmentMapper.class);

    /**
     * Convert to DepartmentDto
     * @param department
     * @return
     */
    DepartmentDto mapToDepartmentDto(Department department);

    /**
     * Convert to Department
     * @param departmentDto
     * @return
     */
    Department mapToDepartment(DepartmentDto departmentDto);
}
