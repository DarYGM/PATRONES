/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author daria
 */
public class Circulo implements Figura {
    private String nombre;
    private String color;
    private Integer radio;

    public Circulo (){}
   
//nombre
    @Override
    public void setNombre (String n){
        this.nombre = n;
    }

    @Override
    public String getNombre() {
    return this.nombre;        
    }
//color
    @Override
       public void setColor (String c){
        this.color = c;
    }
       
    @Override
      public String getColor(){
      return this.color;
      }
       

     
    @Override
    public Figura clonar() {
     Figura figura = new Circulo();  
     figura.setNombre(this.nombre);
     figura.setColor(this.color);
     return figura;
    }
    
 
}