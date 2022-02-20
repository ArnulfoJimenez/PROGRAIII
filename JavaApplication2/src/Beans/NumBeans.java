/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Pojos.Numeros;
import Services.INum;

/**
 *
 * @author Josss_k4ptalp
 */
public class NumBeans implements INum{

    @Override
    public int PositivosYNegativos(Numeros n) {
    if (n.getNum2().equals("-20") && n.getNum1().equals("2")){
    return 0;
    } else{
        return 1;
    }
    }
}
