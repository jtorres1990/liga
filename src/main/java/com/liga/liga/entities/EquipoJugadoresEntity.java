package com.liga.liga.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_eqp_jug")
public class EquipoJugadoresEntity {
    @Setter
    @Getter
    @Column(name = "IDEqp_Jug")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Setter
    @Getter
    @Column(name = "tb_equipos_IDEquipo")
    private Long idEquipo;
    @Setter
    @Getter
    @JoinColumn(name = "tb_jugador_IDJugador")
    @ManyToOne
    private Jugador idJugador;
    @Setter
    @Getter
    @Column(name = "estado")
    private boolean estado;

}
