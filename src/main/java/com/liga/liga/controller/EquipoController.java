package com.liga.liga.controller;

import com.liga.liga.dto.*;
import com.liga.liga.entities.Equipo;
import com.liga.liga.service.IEquipoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("AdministrarLiga/Equipo")
public class EquipoController {

    @Autowired
    public IEquipoService equipoService;

    @GetMapping("/GetEquipos")
    @Operation(summary = "Servicio para obtener todos los Equipos")
    @ResponseBody
    public List<Equipo> getEquipos() {
        return equipoService.getEquipos();
    }

    @PutMapping("/PutEquipos")
    @Operation(summary = "Servicio para agregar un equipo")
    @ResponseBody
    public Response crearEquipo(@RequestBody EquipoDto equipoDto) {
        Response response = new Response();
        try {

            equipoService.createEquipo(equipoDto);
            response.setDescripcion("OK");
            response.setCodigoRespuesta(55);
        } catch (Exception exception) {
            response.setDescripcion("FAIL");
            response.setCodigoRespuesta(56);
        }
        return response;
    }


    @GetMapping("/GetEquipoById/{id}")
    @Operation(summary = "Servicio para obtener un equipo")
    @ResponseBody
    public EquipoCompDto getEquipoById(@PathVariable Long id){
        return equipoService.getEquipoById(id);

    }


public Response agregarJugadores(@RequestBody JugadoresEquipoDto jugadoresEquipoDto){
        return equipoService.agregarJugadores(jugadoresEquipoDto);
}



}
