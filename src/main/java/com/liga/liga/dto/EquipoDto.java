package com.liga.liga.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

public class EquipoDto {

    @Getter
    @Setter
    @Column(name = "Nombre")
    private String nombre;

    @Getter
    @Setter
    @Column(name = "tb_tecnicos_IDTecnicos")
    private Long idTecnico;

}
