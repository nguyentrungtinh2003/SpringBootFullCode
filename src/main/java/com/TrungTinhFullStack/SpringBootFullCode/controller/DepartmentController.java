package com.TrungTinhFullStack.SpringBootFullCode.controller;

import com.TrungTinhFullStack.SpringBootFullCode.entity.Department;
import com.TrungTinhFullStack.SpringBootFullCode.service.DepartmentService;
import com.TrungTinhFullStack.SpringBootFullCode.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartment() {
       return  departmentService.getAllDepartment();
    }

    @GetMapping("/departments/{departmentId}")
    public Department getDepartmentById(@PathVariable Long departmentId) {
        return departmentService.getDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{departmentId}")
    public String deleteDepartmentById(@PathVariable Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted success";
    }

}
