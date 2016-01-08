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
public class Profesor extends Persona {
    public Profesor (String nombre, int edad, String sexo){
        super(nombre, edad, sexo);
    }
    
    public void print(){
        System.out.println("Detalles de Profesor: ");
        super.print();
    }
}
