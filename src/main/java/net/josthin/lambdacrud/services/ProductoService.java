package net.josthin.lambdacrud.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import net.josthin.lambdacrud.models.Producto;
import net.josthin.lambdacrud.repositories.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;


    public ResponseEntity<?> traerTodos() {
        try {
            return ResponseEntity.ok(productoRepository.findAll());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e);
        }
    }

    public ResponseEntity<?> traerPorId(String id) {
        try {
            Producto producto = productoRepository.findById(id).orElse(null);
            if (producto == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(producto);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    public ResponseEntity<?> guardar(@Valid Producto producto) {
        try {
            return ResponseEntity.ok(productoRepository.save(producto));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
