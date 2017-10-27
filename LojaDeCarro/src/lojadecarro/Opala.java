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
public class Opala extends Carro{
    public Opala(){
       this.modelo = "Opala";
       this.marca = "Chevrolet";
       this.cor = "Preto";
       this.valor = 100000.00;
   }
   public void aumento(){
       this.valor = this.valor +((this.valor*5)/100);
       System.out.println("O veiculo: "+ this.modelo 
       + " de marca: " + this.marca + "e cor " + this.cor + ", agora custa: "+ this.valor);
   }
   
    
    
}
