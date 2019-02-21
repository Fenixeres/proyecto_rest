package com.project.services.dummy.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PROVINCIA")
@Entity
public class Provincia implements Serializable {

    private static final long serialVersionUID = 3L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_provincia")
    private String idProvincia;

    private String estado;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "id_departamento")
    private String idDepartamento;
}
