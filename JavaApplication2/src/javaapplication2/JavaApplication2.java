/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import Beans.NumBeans;
import Pojos.Numeros;



/**
 *
 * @author Josss_k4ptalp
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Numeros n = new Numeros();
         NumBeans nb = new NumBeans();
         n.setNum1("-20");
         n.setNum2("2");
         var logica = nb.PositivosYNegativos(n);
         
         if (logica>0){
         System.out.println("El numero es negativo");
        
        }else
            System.out.println("El numero es positivo");
         }
    }
    
    
    
