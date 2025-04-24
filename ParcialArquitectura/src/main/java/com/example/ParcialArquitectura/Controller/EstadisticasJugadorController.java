package com.example.ParcialArquitectura.Controller;

import com.example.ParcialArquitectura.Model.EstadisticasJugador;
import com.example.ParcialArquitectura.Service.EstadisticaJugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estadisticajugador")
public class EstadisticasJugadorController {
    @Autowired
    private EstadisticaJugadorService estadisticaService;

    @GetMapping
    public List<EstadisticasJugador> getAll() {
        return estadisticaService.findAll();
    }

    @GetMapping("/{id}")
    public EstadisticasJugador getById(@PathVariable Long id) {
        return estadisticaService.findById(id);
    }

    @PostMapping
    public EstadisticasJugador create(@RequestBody EstadisticasJugador estadistica) {
        return estadisticaService.save(estadistica);
    }

    @PutMapping("/{id}")
    public EstadisticasJugador update(@PathVariable Long id, @RequestBody EstadisticasJugador estadistica) {
        estadistica.setIdEstadistica(id);
        return estadisticaService.save(estadistica);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        estadisticaService.delete(id);
    }

}
