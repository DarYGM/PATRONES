/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory_method;

/**
 *
 * @author OMAR HC
 */
public class bdfail extends DBoperation {
     public bdfail(){

    }
    @Override
    public String getconect(){
        return "Sin Conexión ....";
    }
    @Override
    public String getdisconect(){
        return "no existe .. .. .";
    }
    

    
}
