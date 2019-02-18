package com.project.services.dummy.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Provincia")
@Entity
public class Provincia implements Serializable {

    private static final long serialVersionUID = 3L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idProvincia;

    private String estado;

    private String nombProvincia;

    private String idDepartamento;
}
