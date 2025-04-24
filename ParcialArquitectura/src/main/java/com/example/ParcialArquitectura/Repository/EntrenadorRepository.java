package com.example.ParcialArquitectura.Repository;


import com.example.ParcialArquitectura.Model.Entrenador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EntrenadorRepository extends JpaRepository<Entrenador, Long> {

}
