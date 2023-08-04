package net.josthin.lambdacrud.repositories;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import net.josthin.lambdacrud.models.Producto;

@EnableScan
@Repository
public interface ProductoRepository extends PagingAndSortingRepository<Producto, String>{
    
}