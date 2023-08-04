package net.josthin.lambdacrud.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDto {
    private String id;
    private String nombre;
    private String descripcion;
    private double precio;
}
