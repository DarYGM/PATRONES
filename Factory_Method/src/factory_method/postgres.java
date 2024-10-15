/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_method;

/**
 *
 * @author daria
 */
public class postgres extends DBoperation {
     public postgres(){

    }
    @Override
    public String getconect(){
        return "Conexión a postgres ....";
    }
    @Override
    public String getdisconect(){
        return "Cerrando postgres .. .. .";
    }

    
}