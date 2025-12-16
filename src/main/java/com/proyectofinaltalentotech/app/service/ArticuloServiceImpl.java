package com.proyectofinaltalentotech.app.service;

import com.proyectofinaltalentotech.app.model.Articulo;
import com.proyectofinaltalentotech.app.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticuloServiceImpl implements ArticuloService {
    private final ArticuloRepository articuloRepository;

    @Autowired
    public ArticuloServiceImpl(ArticuloRepository articuloRepository){
        this.articuloRepository = articuloRepository;
    }

    public List<Articulo> listarArticulos(){
        return articuloRepository.findAll();
    }

    public Optional<Articulo> obtenerArticuloPorId(Long id) {
        return articuloRepository.findById(id);
    }

    public Articulo guardarArticulo(Articulo articulo) {
        return articuloRepository.save(articulo);
    }

    public Articulo actualizarArticulo(Long id, Articulo articulo) {
        articulo.setId(id);
        return articuloRepository.save(articulo);
    }

    public void eliminarArticulo(Long id) {
        articuloRepository.deleteById(id);
    }
}
