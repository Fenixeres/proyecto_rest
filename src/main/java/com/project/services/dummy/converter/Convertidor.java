package com.project.services.dummy.converter;

import com.project.services.dummy.entity.Departamento;
import com.project.services.dummy.model.DepartamentoModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("convertidor")
public class Convertidor {
    public List<DepartamentoModel> convertirEntityModel(List<Departamento> listDepartamento) {
        List<DepartamentoModel> listDep = new ArrayList<>();

        for (Departamento dep : listDepartamento) {
            DepartamentoModel depModel = new DepartamentoModel();
            depModel.setIdDepartamento(dep.getIdDepartamento());
            depModel.setNombDepa(dep.getNombDepa());
            depModel.setEstado(dep.getEstado());
            listDep.add(depModel);
        }
        return  listDep;
    }
}
