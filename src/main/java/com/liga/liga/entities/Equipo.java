package com.liga.liga.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_equipos")
public class Equipo {
    @Id
    @Column(name = "IDEquipo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    @Column(name = "Nombre")
    private String nombre;
    @Getter
    @Setter
    @Column(name = "tb_tecnicos_IDTecnicos")
    private Long idTecnico;
    @Getter
    @Setter
    @OneToMany(mappedBy = "idEquipo")
    private List<EquipoJugadoresEntity> eqpJug;

}
