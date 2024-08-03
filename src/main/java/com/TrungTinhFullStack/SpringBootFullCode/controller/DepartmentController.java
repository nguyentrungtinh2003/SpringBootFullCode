package com.TrungTinhFullStack.SpringBootFullCode.controller;

import com.TrungTinhFullStack.SpringBootFullCode.entity.Department;
import com.TrungTinhFullStack.SpringBootFullCode.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Saving Department: {}", department);
        return departmentService.saveDepartment(department);
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        LOGGER.info("Fetching all departments");
        return departmentService.getAllDepartment();
    }

    @GetMapping("/{departmentId}")
    public Department getDepartmentById(@PathVariable Long departmentId) {
        LOGGER.info("Fetching Department with ID: {}", departmentId);
        return departmentService.getDepartmentById(departmentId);
    }

    @PutMapping("/{departmentId}")
    public Department updateDepartment(@PathVariable Long departmentId, @RequestBody Department department) {
        LOGGER.info("Updating Department with ID: {}", departmentId);
        return departmentService.updateDepartment(departmentId, department);
    }

    @DeleteMapping("/{departmentId}")
    public String deleteDepartmentById(@PathVariable Long departmentId) {
        LOGGER.info("Deleting Department with ID: {}", departmentId);
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted successfully";
    }

    @GetMapping("/search/{departmentName}")
    public Department findDepartmentByName(@PathVariable String departmentName) {
        LOGGER.info("Searching Department with name: {}", departmentName);
        return departmentService.findDepartmentByName(departmentName);
    }
}
