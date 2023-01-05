package com.example.bit512.controller;

import com.example.bit512.entity.Department;
import com.example.bit512.service.Interface.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bit512/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    /*
     * query all department
     */

    @GetMapping("/department")
    public List<Department> listDepartments() {
        return departmentService.findAll();
    }

    /*
     * create department entity
     */

    @PostMapping(path = "/new")
    public Department create(@RequestBody final Department entity) {
        return departmentService.create(entity);
    }
}
