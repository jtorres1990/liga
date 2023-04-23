package com.liga.liga.entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_jugador")

public class Jugador {
    @Id
    @Column(name = "IDJugador")
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
    @Column(name ="Edad")
    private String edad;


}
