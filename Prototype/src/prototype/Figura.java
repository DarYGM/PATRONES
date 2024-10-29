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
public interface Figura {
    public void setNombre(String n);
    public String getNombre();
    public void setColor(String c);
    public String getColor();
    public Figura clonar();
}
