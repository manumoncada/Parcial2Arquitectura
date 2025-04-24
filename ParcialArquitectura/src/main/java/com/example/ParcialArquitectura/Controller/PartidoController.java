package com.example.ParcialArquitectura.Controller;



import com.example.ParcialArquitectura.Model.Partido;
import com.example.ParcialArquitectura.Service.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/partidos")
public class PartidoController {
    @Autowired
    private PartidoService partidoService;

    @GetMapping
    public List<Partido> getAll() {
        return partidoService.findAll();
    }

    @GetMapping("/{id}")
    public Partido getById(@PathVariable Long id) {
        return partidoService.findById(id);
    }

    @PostMapping
    public Partido create(@RequestBody Partido partido) {
        return partidoService.save(partido);
    }

    @PutMapping("/{id}")
    public Partido update(@PathVariable Long id, @RequestBody Partido partido) {
        partido.setIdPartido(id);
        return partidoService.save(partido);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        partidoService.delete(id);
    }
    @GetMapping("/resultados")
    public List<Object[]> getResultadosConNombres() {
        return partidoService.resultadosConNombres();
    }
    @GetMapping("/goles/{idEquipo}")
    public int getTotalGolesEquipo(@PathVariable Long idEquipo) {
        return partidoService.totalGolesPorEquipo(idEquipo);
    }
}
