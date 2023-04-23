package com.liga.liga.dto;

import com.liga.liga.entities.EquipoJugadoresEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

public class EquipoCompDto {

    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private Long idTecnico;
    @Getter
    @Setter
    private List<String> nombreJugadores;

}
