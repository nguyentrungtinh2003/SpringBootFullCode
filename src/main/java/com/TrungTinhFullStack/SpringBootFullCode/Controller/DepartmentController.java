package com.TrungTinhFullStack.SpringBootFullCode.Controller;

import com.TrungTinhFullStack.SpringBootFullCode.Entity.Department;
import com.TrungTinhFullStack.SpringBootFullCode.Service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Save department success");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartment() {
        LOGGER.info("Get all department");
        return departmentService.getAllDepartment();
    }

    @GetMapping("/departments/{id}")
    public Department getDepartmentByID(@PathVariable Long id) {
        LOGGER.info("Get department by id");
        return departmentService.getDepartmentByID(id);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartment(@PathVariable Long id) {
        LOGGER.info("Delete department by id");
        return departmentService.deleteDepartment(id);
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable Long id,@RequestBody Department department) {
        LOGGER.info("Update department by id");
        return departmentService.updateDepartment(id,department);
    }

    @GetMapping("/departments/name/{name}")
    public Department getDepartmentByName(@PathVariable String name) {
        LOGGER.info("Get department by name");
        return departmentService.getDepartmentByName(name);
    }

}
