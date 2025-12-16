package com.proyectofinaltalentotech.app.service;

import com.proyectofinaltalentotech.app.model.Articulo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ArticuloService {
    List<Articulo> listarArticulos();
    Optional<Articulo> obtenerArticuloPorId(Long id);
    Articulo guardarArticulo(Articulo articulo);
    Articulo actualizarArticulo(Long id, Articulo articulo);
    void eliminarArticulo(Long id);
}
