/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Daniel
 */
public class Camarero extends Persona{
    private double sueldo;
    private static int n = 0;
    
    public Camarero () {
        sueldo = 1000.00;
        n++;
    }
    
    public Camarero(double sueldo, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo = sueldo;
        n++;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public static void contadorCamareros() {
        if (n == 0) {
            System.out.println("En este restaurante no trabaja ningún camarero");
        } else if (n == 1) {
            System.out.println("En este restaurante trabaja " + n + " camarero");
        } else {
            System.out.println("En este restaurante trabajan " + n + " camareros");
        }
    }
}
