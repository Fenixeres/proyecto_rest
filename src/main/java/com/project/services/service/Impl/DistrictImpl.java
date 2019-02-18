package com.project.services.dummy.service.Impl;

import com.project.services.dummy.converter.ConverterEntityModel;
import com.project.services.dummy.model.DistrictRs;
import com.project.services.dummy.repository.DistrictRepository;
import com.project.services.dummy.service.DistrictService;
import com.project.services.dummy.util.GenericMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DistrictImpl implements DistrictService {

    @Autowired
    @Qualifier("repositoryDistrict")
    private DistrictRepository districtRepository;

    @Autowired
    @Qualifier("converterEntityModel")
    private ConverterEntityModel converterEntityModel;

    @Autowired
    private GenericMethods printLogResponse;
    @Override
    public DistrictRs getByID(String id) {
        DistrictRs districtRs = new DistrictRs();
        districtRs.setDistrictModel(converterEntityModel.converterModelDistrict(districtRepository.findByIdProvincia(id)));
        printLogResponse.getLogResponse(districtRs);
        return districtRs;
    }
}
