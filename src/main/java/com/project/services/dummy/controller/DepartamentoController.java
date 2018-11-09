package com.project.services.dummy.controller;

import com.google.gson.Gson;
import com.project.services.dummy.model.DepartamentoModel;
import com.project.services.dummy.model.DepartamentoRs;
import com.project.services.dummy.service.DepartamentoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/customer-manager/v1")
@Slf4j
public class DepartamentoController {

    @Autowired
    DepartamentoService depService;

    @GetMapping(value = "/departamento", produces = MediaType.APPLICATION_JSON_VALUE)
    public DepartamentoRs obtenerDepartamento(@RequestParam("nombre") String nombre) {
        return depService.obtenerPorNombre(nombre);
    }

    @GetMapping(value = "/departamentos", produces = MediaType.APPLICATION_JSON_VALUE)
    public DepartamentoRs obtenerDepartamentos(@RequestParam("nombre") String nombre) {
        Gson gson = new Gson();
        System.out.println("REQUEST :: HEADERS: " + gson.toJson(nombre));
        return depService.obtenerPorNombres(nombre);
    }
}
