package com.project.services.dummy.service;

import com.project.services.dummy.model.DistrictRs;
import org.springframework.stereotype.Service;

@Service
public interface DistrictService {

    DistrictRs getByID (String id);
}
