package com.project.services.dummy.service;

import com.project.services.dummy.model.DepartmentsRs;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentsService {

    DepartmentsRs getAllDepartments();

    DepartmentsRs getDepartmentsByID(String id);

}
