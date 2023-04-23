package com.liga.liga.controller;

import com.liga.liga.dto.JugadorDto;
import com.liga.liga.dto.Response;
import com.liga.liga.entities.Jugador;
import com.liga.liga.service.IJugadorService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("AdministrarLiga/Jugadores")
public class JugadorController {

    @Autowired
    public IJugadorService service;

    @GetMapping("/GetJugadores")
    @Operation(summary = "Servicio para obtener todos los Jugadores")
    @ResponseBody
    public List<Jugador> getJugadores() {
        return service.getJugadores();
    }

    @PutMapping("/PutJugadores")
    @Operation(summary = "Servicio para agregar un jugador")
    @ResponseBody
    public Response crearJugador(@RequestBody JugadorDto jugadorDto) {
        Response response = new Response();
        try {

            service.createJugador(jugadorDto);
            response.setDescripcion("OK");
            response.setCodigoRespuesta(55);
        } catch (Exception exception) {
            response.setDescripcion("FAIL");
            response.setCodigoRespuesta(56);
        }
        return response;
    }

    @GetMapping("/GetJugadorById/{id}")
    @Operation(summary = "Servicio para obtener un jugador")
    @ResponseBody
    public Optional<Jugador> getJugadorById(@PathVariable Long id){
        return service.getJugadorById(id);

    }

}
