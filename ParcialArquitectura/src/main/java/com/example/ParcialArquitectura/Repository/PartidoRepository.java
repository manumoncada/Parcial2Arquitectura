package com.example.ParcialArquitectura.Repository;


import com.example.ParcialArquitectura.Model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartidoRepository extends JpaRepository<Partido, Long> {
    @Query(value = "SELECT SUM(CASE WHEN p.equipo_local = :id THEN p.goles_local ELSE 0 END + CASE WHEN p.equipo_visita = :id THEN p.goles_visita ELSE 0 END) FROM partido p", nativeQuery = true)
    int obtenerTotalGolesEquipo(@Param("id") Long equipoId);

    @Query(value = "SELECT pl.nombre AS equipo_local, pv.nombre AS equipo_visita, p.goles_local, p.goles_visita FROM partido p JOIN equipo pl ON p.equipo_local = pl.id_equipo JOIN equipo pv ON p.equipo_visita = pv.id_equipo", nativeQuery = true)
    List<Object[]> obtenerResultadosConNombres();
}
