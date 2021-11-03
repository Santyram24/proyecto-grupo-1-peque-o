/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parqueadero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author santy
 */
public class Conexion {
    Connection con;
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parqueadero","root","");
            
        }catch(Exception e){
            System.err.println("No se conecto");
        }
    }
    //Este public static void solo es de prueba
    public static void main(String[] args) {
        Conexion cn= new Conexion();
        Statement st;
        ResultSet rs;
        try {
            st=cn.con.createStatement();
            rs=st.executeQuery("SELECT * from registrodia");
            while(rs.next()){
                System.out.println(rs.getString("nombre")+" "
                        +rs.getString("placa")+" "+
                        rs.getTime("horaentrada")+" "+rs.getTime("horasalida"));
            }
            cn.con.close();
        } catch (Exception e) {
        }
    }
}
