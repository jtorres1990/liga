package com.liga.liga.service;

import com.liga.liga.dto.JugadorDto;
import com.liga.liga.dto.TecnicoDto;
import com.liga.liga.entities.Jugador;
import com.liga.liga.entities.Tecnico;

import java.util.List;
import java.util.Optional;

public interface ITecnicoService {

    List<Tecnico> getTecnicos();

    void createTecnico(TecnicoDto tecnicoDto);

    Optional<Tecnico> getTecnicoById(Long id);

}
