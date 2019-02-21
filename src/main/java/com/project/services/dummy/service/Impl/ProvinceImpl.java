package com.project.services.dummy.service.Impl;

import com.project.services.dummy.converter.ConverterEntityModel;
import com.project.services.dummy.model.ProvinceRs;
import com.project.services.dummy.repository.ProvinceRepository;
import com.project.services.dummy.service.ProvinceService;
import com.project.services.dummy.util.GenericMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProvinceImpl implements ProvinceService {

    @Autowired
    @Qualifier("repositoryProvince")
    private ProvinceRepository repositoryProvince;

    @Autowired
    @Qualifier("converterEntityModel")
    private ConverterEntityModel converterEntityModel;

    @Autowired
    private GenericMethods printLogResponse;

    @Override
    public ProvinceRs getByID(String id) {
        ProvinceRs provinceRs = new ProvinceRs();
        provinceRs.setProvinceModel(converterEntityModel.converterModelProvince(repositoryProvince.findByIdDepartamento(id)));
        printLogResponse.getLogResponse(provinceRs);
        return provinceRs;
    }
}
