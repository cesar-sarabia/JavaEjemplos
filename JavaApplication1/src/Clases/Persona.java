/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cesarsony
 */
package Clases;
public class Persona {
    private String nombre;
    private int edad;
    private String genero;
    
    public Persona(String nombre, int edad, String sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.genero=sexo;
    }
    public void print(){
        System.out.println("\t Soy "+ nombre + " tengo: " + edad + " años");
    }
    
}
