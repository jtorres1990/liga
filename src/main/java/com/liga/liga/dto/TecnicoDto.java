package com.liga.liga.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

public class TecnicoDto {

    @Getter
    @Setter
    @Column(name = "Nombre")
    private String nombre;

    @Getter
    @Setter
    @Column(name ="Edad")
    private String edad;

}
