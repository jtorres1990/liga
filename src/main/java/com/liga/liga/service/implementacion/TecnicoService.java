package com.liga.liga.service.implementacion;

import com.liga.liga.dto.TecnicoDto;
import com.liga.liga.entities.Jugador;
import com.liga.liga.entities.Tecnico;
import com.liga.liga.repositories.TecnicoRepository;
import com.liga.liga.service.ITecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TecnicoService implements ITecnicoService {
    @Autowired
    private TecnicoRepository tecnicoRepository;

    @Override
    public List<Tecnico> getTecnicos() {
        return tecnicoRepository.findAll();
    }

    @Override
    public void createTecnico(TecnicoDto tecnicoDto) {
        Tecnico tecnico = new Tecnico();
        tecnico.setNombre(tecnicoDto.getNombre());
        tecnico.setEdad(tecnicoDto.getEdad());
        tecnicoRepository.save(tecnico);
    }

    @Override
    public Optional<Tecnico> getTecnicoById(Long id) {
        return tecnicoRepository.findById(id);
    }
}
