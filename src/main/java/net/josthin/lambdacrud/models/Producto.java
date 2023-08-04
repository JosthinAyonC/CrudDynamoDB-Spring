package net.josthin.lambdacrud.models;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

import lombok.*;

import javax.validation.constraints.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@DynamoDBTable(tableName = "Producto")
public class Producto {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String id;

    @NotBlank(message = "El nombre es requerido")
    @NotNull(message = "El nombre es requerido")
    private String nombre;

    private String descripcion;

    @NotNull(message = "El precio es requerido")
    @DecimalMin(value = "0.01", message = "El precio debe ser mayor o igual a 0.01")
    @Digits(integer = 10, fraction = 2, message = "El precio debe tener un máximo de 10 dígitos en total, con 2 decimales como máximo")
    private double precio;
}
