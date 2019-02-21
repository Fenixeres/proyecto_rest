package com.project.services.dummy.service;

import com.project.services.dummy.model.ProvinceRs;
import org.springframework.stereotype.Service;

@Service
public interface ProvinceService {

    ProvinceRs getByID(String nombProvincia);
}
