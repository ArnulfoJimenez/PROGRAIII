/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Services.IEstudiante;
import pojos.Estudiante;
/**
 *
 * @author Josss_k4ptalp
 */
public class Acceso implements IEstudiante{

    @Override
    public int Acess(Estudiante es) {
    if (es.getUser().equals("Josue") && es.getPassword().equals("123") ){
    return 0;
    } else{
        return 1;
    }
    }
}


           
    
  

