/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author cesarsony
 */
public class Estudiante extends Persona{
    int curso;
    float notafinal;
    public Estudiante(String nombre, int edad, String sexo, int curso, float nota){
        super(nombre, edad, sexo);
        this.curso=curso;
        this.notafinal=nota;
    }
    
    public void print(){
        System.out.println("Detalles del estudiante");
        super.print();
        System.out.println("\t estoy en el curso: " + curso);
        System.out.println("\t mi nota promedio es: " + notafinal);
        
    }
}
