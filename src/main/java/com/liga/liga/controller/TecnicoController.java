package com.liga.liga.controller;

import com.liga.liga.dto.JugadorDto;
import com.liga.liga.dto.Response;
import com.liga.liga.dto.TecnicoDto;
import com.liga.liga.entities.Jugador;
import com.liga.liga.entities.Tecnico;
import com.liga.liga.service.ITecnicoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("AdministrarLiga/Tecnicos")
public class TecnicoController {

    @Autowired
    public ITecnicoService tecnicoService;
    @GetMapping("/GetTecnicos")
    @Operation(summary = "Servicio para obtener todos los Tecnicos")
    @ResponseBody
    public List<Tecnico> getTecnico() {
        return tecnicoService.getTecnicos();
    }


    @PutMapping("/PutTecnicos")
    @Operation(summary = "Servicio para agregar un tecnico")
    @ResponseBody
    public Response crearTecnico(@RequestBody TecnicoDto tecnicoDto) {
        Response response = new Response();
        try {

            tecnicoService.createTecnico(tecnicoDto);
            response.setDescripcion("OK");
            response.setCodigoRespuesta(55);
        } catch (Exception exception) {
            response.setDescripcion("FAIL");
            response.setCodigoRespuesta(56);
        }
        return response;
    }

    @GetMapping("/GetTecnicoById/{id}")
    @Operation(summary = "Servicio para obtener un tecnico")
    @ResponseBody
    public Optional<Tecnico> getTecnicoById(@PathVariable Long id){
        return tecnicoService.getTecnicoById(id);

    }


}
