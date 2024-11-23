package com.TrungTinhFullStack.SpringBootFullCode.Service;

import com.TrungTinhFullStack.SpringBootFullCode.Entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> getAllDepartment();

    public Department getDepartmentByID(Long id);

    public String deleteDepartment(Long id);

    public Department updateDepartment(Long id, Department department);

    public Department getDepartmentByName(String name);
}
