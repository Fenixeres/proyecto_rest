package com.project.services.dummy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
public class DistrictModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("Id")
    private String idDistrito;

    @JsonProperty("Estado")
    private String estado;

    @JsonProperty("Distrito")
    private String nombDistrito;

    @JsonIgnore
    private String idProvincia;

}
