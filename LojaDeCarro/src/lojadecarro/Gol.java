/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadecarro;

/**
 *
 * @author taina-santos
 */
public class Gol extends Carro {
   public Gol (){
       this.modelo = "Gol";
       this.marca = "Volkswagen";
       this.cor = "Branco";
       this.valor = 12000.00;
   }
   public void aumento(){
       this.valor = this.valor +((this.valor*3)/100);
       System.out.println("O veiculo: "+ this.modelo 
       + " de marca: " + this.marca + "e cor " + this.cor + ", agora custa: "+ this.valor);
   }
   
    
    
    
}
