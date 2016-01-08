/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package javaapplication1;

/**
 *
 * @author cesarsony
 */
import Clases.*;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejemplo de override
//        Profesor nuevo= new Profesor("cesar", 32, "masculino");
//        nuevo.print();
        
        //Ejemplo de herencia
//        Estudiante alumno= new Estudiante("lao", 12, "femenino", 4, 9);
//        alumno.print();
        
        //Ejemplo de polimorfismo
        Persona YO_SOY[]= new Persona[3];
        YO_SOY[0]= new Estudiante("cesar", 10, "masculino", 1, 10);
        YO_SOY[1]= new Estudiante("pablo", 20, "masculino", 2, 20);
        YO_SOY[2]= new Profesor("César", 35, "masculino");
        
        for (Persona alumnoRegistro: YO_SOY){
            alumnoRegistro.print();
        }
        
    }
    
}
