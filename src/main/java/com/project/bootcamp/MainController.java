/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mario
 */
@RestController
public class MainController {
    @GetMapping("/prueba")
    public String test(){
        return "Hola Mundo";
    }
    
    @GetMapping("/TransformarACodMorse/{texto}")
    public String Transformar(@PathVariable String texto){
        //String texto = "ABACABB";
        String codigoTransformado = "";
        String[] TablaAbc = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        String[] TablaCodigoMorse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        
        for(int i = 0; i < texto.length(); i++){
            String letraTexto = "" + texto.charAt(i);
            for(int j = 0; j < TablaAbc.length; j++){
                String letraTablaAbc = TablaAbc[j];
                if(letraTablaAbc.equalsIgnoreCase(letraTexto)){
                    String caracterEnCodigoMorse = TablaCodigoMorse[j];
                    codigoTransformado +=  " " + caracterEnCodigoMorse;
                }
            }
        }
        
        return codigoTransformado;
    }
}
