package com.liga.liga.service;

import com.liga.liga.dto.*;
import com.liga.liga.entities.Equipo;

import java.util.List;

public interface IEquipoService {

    List<Equipo> getEquipos();

    void createEquipo(EquipoDto equipoDto);

    EquipoCompDto getEquipoById(Long id);

    Response agregarJugadores(JugadoresEquipoDto jugadoresEquipoDto);


}
