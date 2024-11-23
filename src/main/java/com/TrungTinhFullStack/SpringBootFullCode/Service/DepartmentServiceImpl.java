package com.TrungTinhFullStack.SpringBootFullCode.Service;

import com.TrungTinhFullStack.SpringBootFullCode.Entity.Department;
import com.TrungTinhFullStack.SpringBootFullCode.Error.DepartmentNotFoundException;
import com.TrungTinhFullStack.SpringBootFullCode.Repository.DepartmentRepository;
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
    public Department getDepartmentByID(Long id) {
        Department department = departmentRepository.findById(id).orElseThrow(() -> new DepartmentNotFoundException("Department not avalid"));
         return department;
    }

    @Override
    public String deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
        return "Delete success !";
    }

    @Override
    public Department updateDepartment(Long id, Department department) {
        Department department1 = getDepartmentByID(id);
        department1.setDepartmentAddress(department.getDepartmentAddress());
        department1.setDepartmentName(department.getDepartmentName());
        department1.setDepartmentCode(department.getDepartmentCode());

        departmentRepository.save(department1);
        return department1;
    }

    @Override
    public Department getDepartmentByName(String name) {
        return departmentRepository.findByDepartmentNameIgnoreCase(name);
    }
}
