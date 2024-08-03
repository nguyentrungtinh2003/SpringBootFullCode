package com.TrungTinhFullStack.SpringBootFullCode.service;

import com.TrungTinhFullStack.SpringBootFullCode.entity.Department;
import com.TrungTinhFullStack.SpringBootFullCode.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> getAllDepartment();
    public Department getDepartmentById(Long departmentId) ;
    public Department updateDepartment(Long departmentId, Department department) ;
    public void deleteDepartmentById(Long departmentId);
    public Department findDepartmentByName(String departmentName);
}
