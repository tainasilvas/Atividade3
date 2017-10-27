/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fazenda;

/**
 *
 * @author taina-santos
 */
public class Galinha extends Animais {
    public Galinha(){
        this.nome = "Galinha";
        this.especie = "Ave";
        this.peso = 10.00;
    }
    @Override
    public void som(){
        System.out.println("A" + this.nome + "é" + this.especie + ", pesa:"+ this.peso + "E faz cócó!");
    }
    
}
