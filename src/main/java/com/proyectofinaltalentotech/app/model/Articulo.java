package com.proyectofinaltalentotech.app.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "articulo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Double precio;
}
