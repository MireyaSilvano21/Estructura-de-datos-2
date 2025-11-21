package com.example.demo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.demo.dto.RequestCadena;
import com.example.demo.demo.service.SortService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController //Configuracion del controlador (por tag)
@RequestMapping("/api/sort")//configuracion del endpoint de la API
public class SortController {
      @Autowired
        SortService service;

     @PostMapping("/burbuja")
     public int [] bubbleSort(@RequestBody RequestCadena request) {
        String [] partes = request.getCadena().split(",");//recibimos el string y lo convertimos en 
        int [] numeros = new int [partes.length];//declaracion de el arreglo numeros
        for (int i = 0; i < partes.length; i++) {
           try{
            numeros[i] = Integer.parseInt(partes[i]);

           }catch(Exception e){
                numeros[i] = 0;
           }
            
        }

        return service.sort(numeros);
        
    }
    
    
}
