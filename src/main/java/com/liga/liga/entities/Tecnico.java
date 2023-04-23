package com.liga.liga.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_tecnicos")
public class Tecnico {

    @Id
    @Column(name = "IDTecnicos")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    @Getter
    private Long id;

    @Getter
    @Setter
    @Column(name = "Nombre")
    private String nombre;

    @Getter
    @Setter
    @Column(name ="Edad")
    private String edad;

}
