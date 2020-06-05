/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nicomichelson.cuentapersona;

/**
 *
 * @author Nicolas
 */
public class Principal {
    public static void main(String args[]) throws Exception{
        
        Cuenta cuenta1 = new Cuenta("nicolas michelson", 23);
        Cuenta cuenta2 = new Cuenta("rocio");
        
        cuenta1.addAmount(3000);
        cuenta2.addAmount(500);
               
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        
        cuenta1.retirarDinero(2500);
        cuenta2.retirarDinero(200);
        
        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}
