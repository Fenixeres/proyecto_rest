package com.project.services.dummy.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Departamento")
@Entity
public class Departamento implements Serializable {

    private static final long serialVersionUID = 3L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDepartamento")
    private String idDepartamento;

    @Column(name = "NombDepa")
    private String nombDepa;

    @Column(name = "Estado")
    private String estado;

}
