package com.example.ParcialArquitectura.Controller;



import com.example.ParcialArquitectura.Model.Jugador;
import com.example.ParcialArquitectura.Service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jugadores")
public class JugadorController {
    @Autowired
    private JugadorService jugadorService;

    @GetMapping
    public List<Jugador> getAll() {
        return jugadorService.findAll();
    }

    @GetMapping("/{id}")
    public Jugador getById(@PathVariable Long id) {
        return jugadorService.findById(id);
    }

    @PostMapping
    public Jugador create(@RequestBody Jugador jugador) {
        return jugadorService.save(jugador);
    }

    @PutMapping("/{id}")
    public Jugador update(@PathVariable Long id, @RequestBody Jugador jugador) {
        jugador.setIdJugador(id);
        return jugadorService.save(jugador);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        jugadorService.delete(id);
    }
    @GetMapping("/equipo/{idEquipo}")
    public List<Jugador> getByEquipo(@PathVariable Long idEquipo) {
        return jugadorService.findByEquipoId(idEquipo);
    }
    @GetMapping("/goles-mayor/{goles}")
    public List<Jugador> getByGoles(@PathVariable int goles) {
        return jugadorService.findByGolesGreaterThan(goles);
    }
}
