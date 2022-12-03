/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import conexion.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Mdl_Personas;

/**
 *
 * @author scorpion
 */
public class Ctr_Personas {
    public Mdl_Personas consultar(int id) {
        Conexion conectar = new Conexion();
        Mdl_Personas persona = new Mdl_Personas();
        String sql = "SELECT * FROM personas WHERE idpersona = "+id;
        ResultSet rs;
        try {
            rs = conectar.consultar(sql);
            if(rs.next()){                
                persona.setIdpersona(rs.getInt("IDPERSONA"));
                persona.setNombres(rs.getString("NOMBRES"));
                persona.setApellidos(rs.getString("APELLIDOS"));
                persona.setEstado(rs.getString("ESTADO"));
                persona.setFechamodificacion(rs.getString("FECHA_MODIFICACION"));
                persona.setFecharegistro(rs.getString("FECHA_REGISTRO"));                
            }
        } catch (Exception error) {
            System.out.println("Error en la consulta de usuario :"+error);
            JOptionPane.showMessageDialog(null,"Error en la consulta de usuario");
        }
        return persona;
    }
}
