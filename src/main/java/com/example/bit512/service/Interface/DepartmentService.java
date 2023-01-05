package com.example.bit512.service.Interface;

import com.example.bit512.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department create(Department entity);
    List<Department> findAll();
}
