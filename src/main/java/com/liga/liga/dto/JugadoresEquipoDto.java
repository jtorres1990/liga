package com.liga.liga.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class JugadoresEquipoDto {

    @Getter
    @Setter
    List<JugadorDto> jugadores;
    @Getter
    @Setter
    Long idEquipo;
}
