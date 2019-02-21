package com.project.services.dummy.controller;

import com.project.services.dummy.model.DepartmentsRs;
import com.project.services.dummy.model.DistrictRs;
import com.project.services.dummy.model.ProvinceRs;
import com.project.services.dummy.service.DepartmentsService;
import com.project.services.dummy.service.DistrictService;
import com.project.services.dummy.service.ProvinceService;
import com.project.services.dummy.util.GenericMethods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address-services/v1")
@Slf4j
public class ControllerGeneral {

    @Autowired
    DepartmentsService depService;

    @Autowired
    ProvinceService provService;

    @Autowired
    DistrictService distService;

    @Autowired
    GenericMethods printLog;


    @GetMapping(value = "/departmentsAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public DepartmentsRs getAllDepartments() {
        printLog.getLogRequest(null);
        return depService.getAllDepartments();
    }

    @GetMapping(value = "/departments", produces = MediaType.APPLICATION_JSON_VALUE)
    public DepartmentsRs getDepartments(@RequestParam("id") String id) {
        printLog.getLogRequest(id);
        return depService.getDepartmentsByID(id);
    }

    @GetMapping(value = "/provinces", produces = MediaType.APPLICATION_JSON_VALUE)
    public ProvinceRs getProvinces(@RequestParam("id") String id) {
        printLog.getLogRequest(id);
        return provService.getByID(id);
    }

    @GetMapping(value = "/districts", produces = MediaType.APPLICATION_JSON_VALUE)
    public DistrictRs getDistricts(@RequestParam("id") String id) {
        printLog.getLogRequest(id);
        return distService.getByID(id);
    }
}
