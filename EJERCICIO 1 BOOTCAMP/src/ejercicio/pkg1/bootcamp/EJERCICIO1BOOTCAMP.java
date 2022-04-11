/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1.bootcamp;

/**
 *
 * @author migue
 */
public class EJERCICIO1BOOTCAMP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 10;
        int num2 = 200;
        int num3 = 90;
        suma_de_tres(num1, num2, num3 );
        
        System.out.println(suma_de_tres(num1, num2, num3));

    }
    public static int suma_de_tres (int x, int y, int e){
        return x + y + e;
        
    }
    
}
