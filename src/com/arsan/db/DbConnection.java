/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arsan.db;

import com.arsan.model.Genero;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arsan
 */
public class DbConnection {

    private Properties prop = new Properties();

    public DbConnection() throws IOException {
        //try con recursos, no evita colocar cath o finaly que no haría desarrollar mucho código
        try ( FileInputStream fis = new FileInputStream(new File("C:\\Users\\arsan\\OneDrive\\Documentos\\NetBeansProjects\\VideogamesManager\\src\\com\\arsan\\model\\credentials.properties"))) {
            prop.load(fis);
            
        }//llama a close() para liberar espacio en memoria
    }

    //método para implementar las constatntes en la base de datos
    public boolean createVideogame(String nombre, Genero genero, double valoracion, boolean jugado) throws SQLException {
            String sql = "INSERT INTO VIDEOGAMES (id, nombre, genero, valoracion, jugado) VALUES (next value for pid_seq,?,?,?,?)";        
        //try para la conexión a la base de datos, se realiza siempre con DriverManager
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/videogamedb;create=true")) {
            PreparedStatement stm = conn.prepareStatement(sql);
            
            stm.setString(1,nombre);
            stm.setString(2,genero.name());
            stm.setDouble(3,valoracion);
            stm.setBoolean(4,jugado);            
            return stm.execute();
         
            
        }
    }
    
    
    
    
    
}
