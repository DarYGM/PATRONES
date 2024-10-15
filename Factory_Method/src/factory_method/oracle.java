/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory_method;

/**
 *
 * @author OMAR HC
 */
public class oracle extends DBoperation {
     public oracle(){

    }
    @Override
    public String getconect(){
        return "Conexión a oracle ....";
    }
    @Override
    public String getdisconect(){
        return "Cerrando oracle .. .. .";
    }

    
}
