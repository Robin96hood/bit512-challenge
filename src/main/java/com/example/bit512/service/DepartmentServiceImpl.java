package com.example.bit512.service;

import com.example.bit512.entity.Department;
import com.example.bit512.repository.DepartmentRepository;
import com.example.bit512.service.Interface.DepartmentService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    /*
     * create department entity
     */

    @Override
    public Department create(Department entity) {
        return departmentRepository.save(entity);
    }

    /*
     * query all department
     */

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

}
