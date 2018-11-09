package com.project.services.dummy.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.services.dummy.entity.Departamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartamentoModel {

    @JsonProperty("Id")
    private String idDepartamento;

    @JsonProperty("Nombre")
    private String nombDepa;

    @JsonProperty("Estado")
    private String estado;

}
