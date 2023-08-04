package net.josthin.lambdacrud.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import net.josthin.lambdacrud.models.Producto;
import net.josthin.lambdacrud.services.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    private ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public ResponseEntity<?> getAll(@PathVariable String id) {
        return productoService.traerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getEntidad(@PathVariable String id) {
        return productoService.traerPorId(id);
    }

    @PostMapping
    public ResponseEntity<?> saveEntidad(@Valid @RequestBody Producto producto) {
        return productoService.guardar(producto);
    }
}
