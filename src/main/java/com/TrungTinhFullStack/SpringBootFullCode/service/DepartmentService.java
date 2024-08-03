package com.TrungTinhFullStack.SpringBootFullCode.service;

import com.TrungTinhFullStack.SpringBootFullCode.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> getAllDepartment();
    public Department getDepartmentById(Long departmentId);
    public void deleteDepartmentById(Long departmentId);
}
