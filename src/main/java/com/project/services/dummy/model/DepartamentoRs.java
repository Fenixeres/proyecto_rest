package com.project.services.dummy.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DepartamentoRs {

    @JsonProperty("Departamento")
    List<DepartamentoModel> departamentoModel;
}
