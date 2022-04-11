/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg1.bootcamp;

/**
 *
 * @author migue
 */
public class coche {
    int puertas= 4 ;
    String color;
    
    public coche(){
        this.puertas =0;
    }
    
    
    public void anadirPuerta(){
        this.puertas++;
        
    }
    
    public String toString(){
        return "El numero de puertas del coche es "+this.puertas;
    }
    
    
}