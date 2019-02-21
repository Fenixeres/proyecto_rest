package com.project.services.dummy.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DISTRITO")
@Entity
public class Distrito implements Serializable {

    private static final long serialVersionUID = 3L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_distrito")
    private String idDistrito;

    private String estado;

    @Column(name = "nombre")
    private String nombDistrito;

    @Column(name = "id_provincia")
    private String idProvincia;
}
