/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author NEXO-MAX
 */

import negocio.Cliente;
import negocio.DirectorioTelefonico;


public class TP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("pepe", "perez", "valladolid", "castanas", 123456789);
        Cliente c2 = new Cliente("Chars", "lucero", "wisconsin", "25 street", 456132789);
                
        
        DirectorioTelefonico dir1 = new DirectorioTelefonico();
        
        dir1.agregarCliente(111111, c1);
        dir1.agregarCliente(222222, c2);
        dir1.agregarCliente(333333, c1);
        dir1.borrarCliente(111111);
        dir1.buscarCliente(222222);
        
        
        System.out.println("Ahora buscamos cliente");
        
        System.out.println("El cliente es: " + dir1.buscarCliente(222222));
        
        
        
        
    }
    
}
