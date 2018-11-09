package com.project.services.dummy.service.Impl;

import com.google.gson.Gson;
import com.project.services.dummy.converter.Convertidor;
import com.project.services.dummy.model.DepartamentoRs;
import com.project.services.dummy.repository.DepartamentoRepository;
import com.project.services.dummy.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoImpl implements DepartamentoService {

    @Autowired
    @Qualifier("repositorio")
    private DepartamentoRepository depRepository;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    @Override
    public DepartamentoRs obtenerPorNombre(String name) {
        DepartamentoRs depRs = null;
        return depRs;
    }

    @Override
    public DepartamentoRs obtenerPorNombres(String nombre) {
        DepartamentoRs listaDepartamentos = new DepartamentoRs();
        listaDepartamentos.setDepartamentoModel(convertidor.convertirEntityModel(depRepository.findByNombDepa(nombre)));
        Gson gson = new Gson();
        System.out.println("RESPONSE :: LISTA DE DEPARTAMENTOS: " + gson.toJson(listaDepartamentos));
        return listaDepartamentos;
    }
}
