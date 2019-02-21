package com.project.services.dummy.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Distrito")
@Entity
public class Distrito implements Serializable {

    private static final long serialVersionUID = 3L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idDistrito;

    private String estado;

    private String nombDistrito;

    private String idProvincia;
}
