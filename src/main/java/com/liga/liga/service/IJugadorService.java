package com.liga.liga.service;

import com.liga.liga.dto.JugadorDto;
import com.liga.liga.entities.Jugador;

import java.util.List;
import java.util.Optional;


public interface IJugadorService {

    List<Jugador> getJugadores();

    void createJugador(JugadorDto jugadorDto);

    Optional<Jugador> getJugadorById(Long id);

}
