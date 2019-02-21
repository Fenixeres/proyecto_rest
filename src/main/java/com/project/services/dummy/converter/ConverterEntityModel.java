package com.project.services.dummy.converter;

import com.project.services.dummy.entity.Departamento;
import com.project.services.dummy.entity.Distrito;
import com.project.services.dummy.entity.Provincia;
import com.project.services.dummy.model.DepartmentsModel;
import com.project.services.dummy.model.DistrictModel;
import com.project.services.dummy.model.ProvinceModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("converterEntityModel")
public class ConverterEntityModel {

    public List<DepartmentsModel> converterModelDepartments(List<Departamento> listDepartamento) {
        List<DepartmentsModel> listDepartments = new ArrayList<>();

        if (listDepartamento != null) {
            for (Departamento departamento : listDepartamento) {
                DepartmentsModel depModel = new DepartmentsModel();
                depModel.setIdDepartamento(departamento.getIdDepartamento());
                depModel.setNombDepa(departamento.getNombDepa());
                depModel.setEstado(departamento.getEstado());
                listDepartments.add(depModel);
            }
        }
        return listDepartments;

    }

    public List<ProvinceModel> converterModelProvince(List<Provincia> listProvincia) {
        List<ProvinceModel> listProvinces = new ArrayList<>();
        if (listProvincia != null) {
            for (Provincia provincia : listProvincia) {
                ProvinceModel provinceModel = new ProvinceModel();
                provinceModel.setIdProvincia(provincia.getIdProvincia());
                provinceModel.setNombProvincia(provincia.getNombProvincia());
                provinceModel.setEstado(provincia.getEstado());
                provinceModel.setIdDepartamento(provincia.getIdDepartamento());

                listProvinces.add(provinceModel);
            }
        }
        return listProvinces;
    }

    public List<DistrictModel> converterModelDistrict(List<Distrito> listDistrito) {
        List<DistrictModel> listDistricts = new ArrayList<>();

        if (listDistrito != null) {
            for (Distrito distrito : listDistrito) {
                DistrictModel districtModel = new DistrictModel();
                districtModel.setIdDistrito(distrito.getIdDistrito());
                districtModel.setNombDistrito(distrito.getNombDistrito());
                districtModel.setEstado(distrito.getEstado());
                districtModel.setIdProvincia(distrito.getIdProvincia());

                listDistricts.add(districtModel);
            }
        }
        return listDistricts;
    }
}
