package com.TrungTinhFullStack.SpringBootFullCode.controller;

import com.TrungTinhFullStack.SpringBootFullCode.controller.DepartmentController;
import com.TrungTinhFullStack.SpringBootFullCode.entity.Department;
import com.TrungTinhFullStack.SpringBootFullCode.service.DepartmentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DepartmentService departmentService;

    private Department department;

    @BeforeEach
    void setUp() {
        department = Department.builder()
                .departmentAddress("Long An")
                .departmentCode("IT-01")
                .departmentName("IT")
                .departmentId(1L)
                .build();
    }

    @Test
    void saveDepartment() throws Exception {
        Department inputDepartment = Department.builder()
                .departmentAddress("Long An")
                .departmentCode("IT-01")
                .departmentName("IT")
                .build();

        Mockito.when(departmentService.saveDepartment(Mockito.any(Department.class)))
                .thenReturn(department);

        mockMvc.perform(MockMvcRequestBuilders.post("/departments")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(inputDepartment)))
                .andExpect(status().isOk());
    }

    @Test
    void getDepartmentById() throws Exception {
        Long departmentId = 1L;
        Mockito.when(departmentService.getDepartmentById(departmentId))
                .thenReturn(department);

        mockMvc.perform(MockMvcRequestBuilders.get("/departments/{id}", departmentId)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }
}
