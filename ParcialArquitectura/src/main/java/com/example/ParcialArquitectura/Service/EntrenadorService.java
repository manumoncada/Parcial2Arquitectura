package com.example.ParcialArquitectura.Service;

import com.example.ParcialArquitectura.Model.Entrenador;
import com.example.ParcialArquitectura.Repository.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrenadorService {
    @Autowired
    private EntrenadorRepository repository;

    public List<Entrenador> findAll() { return repository.findAll(); }
    public Entrenador findById(Long id) { return repository.findById(id).orElse(null); }
    public Entrenador save(Entrenador entrenador) { return repository.save(entrenador); }
    public void delete(Long id) { repository.deleteById(id); }
}
