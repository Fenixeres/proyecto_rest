package com.project.services.dummy.service.Impl;

import com.project.services.dummy.converter.ConverterEntityModel;
import com.project.services.dummy.model.DepartmentsRs;
import com.project.services.dummy.repository.DepartmentsRepository;
import com.project.services.dummy.service.DepartmentsService;
import com.project.services.dummy.util.GenericMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DepartmentsImpl implements DepartmentsService {

    @Autowired
    @Qualifier("repositoryDepartments")
    private DepartmentsRepository repositoryDepartments;

    @Autowired
    @Qualifier("converterEntityModel")
    private ConverterEntityModel converterModel;

    @Autowired
    private GenericMethods printLogResponse;

    @Override
    public DepartmentsRs getAllDepartments() {
        DepartmentsRs listDepartments = new DepartmentsRs();
        listDepartments.setDepartmentsModel(converterModel.converterModelDepartments(repositoryDepartments.findAll()));
        printLogResponse.getLogResponse(listDepartments);
        return listDepartments;
    }

    @Override
    public DepartmentsRs getDepartmentsByID(String id) {
        DepartmentsRs listDepartments = new DepartmentsRs();
        listDepartments.setDepartmentsModel(converterModel.converterModelDepartments(repositoryDepartments.findByIdDepartamento(id)));
        printLogResponse.getLogResponse(listDepartments);
        return listDepartments;
    }
}
