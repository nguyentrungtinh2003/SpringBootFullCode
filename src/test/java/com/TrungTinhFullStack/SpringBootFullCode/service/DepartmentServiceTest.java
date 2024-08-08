//package com.TrungTinhFullStack.SpringBootFullCode.service;
//
//import com.TrungTinhFullStack.SpringBootFullCode.entity.Department;
//import com.TrungTinhFullStack.SpringBootFullCode.repository.DepartmentRepository;
//import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//class DepartmentServiceTest {
//
//    @Autowired
//    private DepartmentService departmentService;
//
//    @MockBean
//    private DepartmentRepository departmentRepository;
//
//    @BeforeEach
//    void setUp() {
//        Department department = Department.builder()
//                .departmentId(1L)
//                .departmentName("IT")
//                .departmentAddress("Long An")
//                .departmentCode("IT-01")
//                .build();
//
//        Mockito.when(departmentRepository.findByDepartmentName("IT"))
//                .thenReturn(department);
//    }
//
//    @Test
//    @DisplayName("Get Data Valida Department Name")
//    public void TestFoundDepartment() {
//
//        String departmentName = "IT";
//        Department found = departmentRepository.findByDepartmentName(departmentName);
//
//        assertEquals(departmentName,found.getDepartmentName());
//    }
//}