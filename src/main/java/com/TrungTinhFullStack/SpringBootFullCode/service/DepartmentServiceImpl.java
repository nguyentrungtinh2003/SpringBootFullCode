package com.TrungTinhFullStack.SpringBootFullCode.service;

import com.TrungTinhFullStack.SpringBootFullCode.entity.Department;
import com.TrungTinhFullStack.SpringBootFullCode.error.DepartmentNotFoundException;
import com.TrungTinhFullStack.SpringBootFullCode.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
       return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }


    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).orElse(null);

    }

    @Override
    public Department updateDepartment(Long departmentId, Department department)  {
        Department dep = departmentRepository.findById(departmentId).orElse(null);
        dep.setDepartmentName(department.getDepartmentName());
        dep.setDepartmentAddress(department.getDepartmentAddress());
        dep.setDepartmentCode(department.getDepartmentCode());

        departmentRepository.save(dep);
        return dep;
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department findDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }
}
