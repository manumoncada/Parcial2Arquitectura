package com.example.ParcialArquitectura.Repository;


import com.example.ParcialArquitectura.Model.Equipo;
import com.example.ParcialArquitectura.Model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long> {
    @Query(value = "SELECT * FROM jugador WHERE id_equipo = :idEquipo", nativeQuery = true)
    List<Jugador> findJugadoresByEquipo(@Param("idEquipo") Long idEquipo);
    @Query(value = "SELECT COALESCE(SUM(goles_local), 0) + COALESCE(SUM(goles_visita), 0) " +
            "FROM partido WHERE equipo_local = :idEquipo OR equipo_visita = :idEquipo", nativeQuery = true)
    Integer totalGolesPorEquipo(@Param("idEquipo") Long idEquipo);
}
