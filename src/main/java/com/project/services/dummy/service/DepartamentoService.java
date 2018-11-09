package com.project.services.dummy.service;

import com.project.services.dummy.model.DepartamentoRs;
import org.springframework.stereotype.Service;

@Service
public interface DepartamentoService {

    DepartamentoRs obtenerPorNombre(String nombre);

    DepartamentoRs obtenerPorNombres(String nombre);

}
