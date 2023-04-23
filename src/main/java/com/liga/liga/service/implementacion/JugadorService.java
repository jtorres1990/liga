package com.liga.liga.service.implementacion;

import com.liga.liga.dto.JugadorDto;
import com.liga.liga.entities.Jugador;
import com.liga.liga.repositories.JugadorRepository;
import com.liga.liga.service.IJugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JugadorService implements IJugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;
    @Override
    public List<Jugador> getJugadores() {
        return jugadorRepository.findAll();
    }

    @Override
    public void createJugador(JugadorDto jugadorDto) {
        Jugador jugador = new Jugador();
        jugador.setNombre(jugadorDto.getNombre());
        jugador.setEdad(jugadorDto.getEdad());
        jugadorRepository.save(jugador);
    }

    @Override
    public Optional<Jugador> getJugadorById(Long id) {
        return jugadorRepository.findById(id);
    }


}
