package com.example.ParcialArquitectura.Repository;


import com.example.ParcialArquitectura.Model.EstadisticasJugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadisticasJugadorRepository {
    public interface EstadisticaJugadorRepository extends JpaRepository<EstadisticasJugador, Long>
}
