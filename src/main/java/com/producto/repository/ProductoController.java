/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.producto.repository;

import com.producto.domain.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Esteban P
 */
@RestController
public class ProductoController {
    @Autowired
    private ProductoRepository productoRepository;
    
    @RequestMapping (value= "/producto",method = RequestMethod.POST)
    public ResponseEntity<?> crearProducto(@RequestBody Producto producto){
        productoRepository.save(producto);
        return new ResponseEntity<>(producto,HttpStatus.CREATED);
    }
     @RequestMapping (value= "/producto",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarProducto(){
        Iterable<Producto> encuesta= productoRepository.findAll();
        return new ResponseEntity<>(encuesta,HttpStatus.OK);
    }
    
}
