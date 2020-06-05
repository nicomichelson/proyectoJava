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
public class Cuenta {
    
   private String titular;
   private double amount;

  public Cuenta(String titular) throws Exception{
      this(titular, 0);//sobre carga
  } 
  
  public Cuenta(String titular, double amount)
  throws Exception{
      
      if(titular == null)
          throw new Exception("argumento no valido");
      if(titular.length() == 0)
          throw new Exception("titular vacio");
      this.titular = titular;
      this.amount = amount;
  }
    
   
//geter and seter
   public String getTitular(){
       return titular;
   }
   
   
   
   public double getAmount(){
       return amount;
   }
   
   public void setTitular(String titular) throws Exception{
       
       this.titular = titular;
   }
   
   
   
   public void setAmount(double amount){
       this.amount = amount;
   }

    @Override
    public String toString() {
        return "Cuenta{" + "Titular de la cuenta: " + titular + "tiene: " + amount + "pesos" +'}';
    }
   
   public void addAmount(double amount )throws Exception{
       if (amount < 0)
           throw new Exception("no se puede ingresar valores negativos");
       this.amount += amount;
       
   }
   
   public void retirarDinero(double amount){
       if(this.amount - amount <0){
           this.amount = 0;
       }else{
           this.amount -=amount;
       }
           
   }
    
    
}
