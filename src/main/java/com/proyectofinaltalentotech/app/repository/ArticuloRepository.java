package com.proyectofinaltalentotech.app.repository;

import com.proyectofinaltalentotech.app.model.Articulo;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Long>{}
