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
public class Cuadrado implements Figura {
    private String nombre;
    private String color;
    
    
    public Cuadrado(Cuadrado cuadrado){
        
        this.nombre=nombre;
        this.color=color;
    }
    
    public Cuadrado(){}
    
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    
    
    @Override
    public Figura clonar(){
    Figura figura = new Cuadrado();
    figura.setNombre(this.nombre);
    figura.setColor(this.color);
    
    return figura;
    }
    
    
    
    
    
    
}
