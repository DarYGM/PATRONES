/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonn;

/**
 *
 * @author daria
 */
public class EscenaGame {
    public static void main(String[] args) {
        
        Singleton escenaprincipal = Singleton.getInstance();
        
        
        System.out.println("This is de hashcode1: "+escenaprincipal.hashCode());
      
        escenaprincipal.opensesion();
        escenaprincipal.closesesion();
        
        System.out.println("--------------------------------\n");
        System.out.println("Prueba realizada con una segunda instancia.");
        Singleton escenaprincipal2 = Singleton.getInstance();
        System.out.println("This is de hashcode1: "+escenaprincipal2.hashCode());
        
        if (escenaprincipal.hashCode() == escenaprincipal2.hashCode()){
            System.out.println("Se intentó crear una misma instancia.");
        }
        
    }
    
}
