/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.miranda.torres;
import Clases.*;
/**
 *
 * @author Daniel
 */
public class DanielMirandaTorres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona sujeto1 = new Persona("Oracio", 23);
        System.out.println("El nombre del sujeto1 es " + sujeto1.getNombre() + " y tiene " + sujeto1.getEdad() + " años.");
        
        Camarero camarero1 = new Camarero(1234.65, "Jose", 46);
        System.out.println("El nombre del camarero1 es " + camarero1.getNombre() + ", tiene " + camarero1.getEdad() + " años y cobra " + camarero1.getSueldo() + " euros.");
        
        Camarero camarero2 = new Camarero(1553.97, "Jacinto", 59);
        System.out.println("El nombre del camarero2 es " + camarero2.getNombre() + ", tiene " + camarero2.getEdad() + " años y cobra " + camarero2.getSueldo() + " euros.");
        
        Camarero camarero3 = new Camarero();
        System.out.println("El nombre del camarero3 es " + camarero3.getNombre() + ", tiene " + camarero3.getEdad() + " años y cobra " + camarero3.getSueldo() + " euros.");
        
        Camarero.contadorCamareros();
        
    }
    
}
