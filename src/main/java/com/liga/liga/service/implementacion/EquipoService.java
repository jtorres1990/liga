package com.liga.liga.service.implementacion;

import com.liga.liga.dto.*;
import com.liga.liga.entities.Equipo;
import com.liga.liga.entities.EquipoJugadoresEntity;
import com.liga.liga.repositories.EquipoRepository;
import com.liga.liga.service.IEquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EquipoService implements IEquipoService {
    @Autowired
    private EquipoRepository equipoRepository;

    @Override
    public List<Equipo> getEquipos() {
        return equipoRepository.findAll();
    }

    @Override
    public void createEquipo(EquipoDto equipoDto) {
        Equipo equipo = new Equipo();
        equipo.setNombre(equipoDto.getNombre());
        equipo.setIdTecnico(equipoDto.getIdTecnico());
        equipoRepository.save(equipo);
    }

    @Override
    public EquipoCompDto getEquipoById(Long id) {
        Optional<Equipo> equipo = equipoRepository.findById(id);
        EquipoCompDto equipoCompDto = new EquipoCompDto();

        if (equipo.isPresent()) {
            Equipo equipo1 = equipo.get();
            equipoCompDto.setNombre(equipo1.getNombre());
            equipoCompDto.setIdTecnico(equipo1.getIdTecnico());

            List<String> test = new ArrayList<>();

            for (EquipoJugadoresEntity eqpJug : equipo1.getEqpJug()) {
                test.add(eqpJug.getIdJugador().getNombre());
            }
            equipoCompDto.setNombreJugadores(test);

            return equipoCompDto;
        } else {
            return null;
        }

    }

    @Override
    public Response agregarJugadores(JugadoresEquipoDto jugadoresEquipoDto) {
        EquipoJugadoresEntity equipoJugadoresEntity = new EquipoJugadoresEntity();
        equipoJugadoresEntity.setIdEquipo(jugadoresEquipoDto.getIdEquipo());
        equipoJugadoresEntity.setIdJugador(jugadoresEquipoDto.ge);
        for (JugadorDto j : jugadoresEquipoDto.getJugadores()) {


        }
        return null;
    }
}
