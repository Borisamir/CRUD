/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

import java.sql.*;
/**
 *
 * @author Alumno-ETI
 */
public class Conexion {
    public Connection conectar(){
        String url="jdbc:mysql://localhost:3308/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user="root";
        String password="1234";
        Connection cn=null;
        try{
            cn=DriverManager.getConnection(url, user, password);
            if (cn !=null){
                System.out.println("Conectado");
            }
        }catch(SQLException e){
            System.out.println(e);
            
        }
        

        
        
        
        
        return cn;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Conexion cn=new Conexion();
        cn.conectar();
    }
    
}
