/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.producto.repository;

import com.producto.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Esteban P
 */
public interface ProductoRepository extends CrudRepository<Producto, Integer>{

    @Query(value = "SELECT producto,cantidad from producto where cantidad>=15 "
            , nativeQuery=false)
	public List<Producto> getProducto(int productoid, int cantidad);
    
}
