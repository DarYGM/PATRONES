/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory_method;

/**
 *
 * @author OMAR HC
 */
public class Client {
        public static void main(String []args){
        DBoperation mysql=factory.getDBoperation("mysql");
        System.out.println(mysql.getconect());
        System.out.println(mysql.getdisconect());
        System.out.println();
        
                
        DBoperation oracle=factory.getDBoperation("oracle");
        System.out.println(oracle.getconect());
        System.out.println(oracle.getdisconect());
        System.out.println();
        
        DBoperation postgres=factory.getDBoperation("postgres");
        System.out.println(postgres.getconect());
        System.out.println(postgres.getdisconect());
        System.out.println();
        
        


    }
    
}
