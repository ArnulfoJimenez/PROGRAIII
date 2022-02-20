/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import Beans.Acceso;
import java.util.Scanner;
import pojos.Estudiante;

/**
 *
 * @author Josss_k4ptalp
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante es = new Estudiante();
        Acceso ac = new Acceso();
        Scanner sc = new Scanner(System.in);
        es.setUser("Josue");
        es.setPassword("123");
        var logica = ac.Acess(es);
        
        if (logica==0){
            
        System.out.println("Inicio perfecto");
        
        }else
            System.out.println("Incorrecto");
    }
    
}
