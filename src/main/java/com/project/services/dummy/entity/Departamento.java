package com.project.services.dummy.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DEPARTAMENTO")
@Entity
public class Departamento implements Serializable {

    private static final long serialVersionUID = 3L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departamento")
    private String idDepartamento;

    @Column(name = "nombre")
    private String nombDepa;

    @Column(name = "estado")
    private String estado;

}
