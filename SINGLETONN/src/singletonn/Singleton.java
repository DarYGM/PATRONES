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
public class Singleton {
    //Declaración del objeto llamado pSingleton de la clase Singleton
    private static Singleton iSingleton;  //null
    
    //Para evitar instancia mediante operador "new"
    //constructor
    private Singleton(){
    
    }
    //Para obtener la instancia unicamente por este metodo
    //Notese la palabra reservada "static" hace posible el acceso mediante Clase.metodo
    public static Singleton getInstance(){
        if (iSingleton==null){
            iSingleton = new Singleton();
            System.out.println("Creando una nueva instancia de  Escena Game...");
        }else{
            System.out.println(iSingleton.hashCode()+ " La instancia ya existe, no puedes crear una nueva instancia");
        }
        return iSingleton;
    }

	//Método de prueba
	public void opensesion() {
		System.out.println("Escena de Principal en funcionamiento.");
	}
	
	//Método de prueba
	public void closesesion() {
		System.out.println("Se ha cerrado la seción en Escena Principal. ");
	}

}
