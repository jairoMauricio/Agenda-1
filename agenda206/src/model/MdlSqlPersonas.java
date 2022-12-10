package model;

import conexion.Conexion;
import static conexion.Conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Creado por:
Jhonny Castaño
Jhon Gonzalez
Nicolas Gutierrez
Juan Varela
Santiago Nieto
 */

public class MdlSqlPersonas extends Conexion{
     public boolean registrarpersonas(Mdl_Personas personas) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        String sql = "INSERT INTO() VALUES()";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, personas.getIdpersona());
            ps.setString(2, personas.getNombres());
            ps.setString(3, personas.getApellidos());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int autoIncrementoPersonas() {
        Conexion cone = new Conexion();
        String sql = "SELECT IDPERSONA  from PERSONAS";
        ResultSet rs = cone.consultar(sql);
        int idPersonas = 0;
        try {
            while (rs.next()) {
                idPersonas = rs.getInt("IDPERSONA");
            }
        } catch (Exception e) {
            System.out.println("Error al buscar el id de personas");
        }
        idPersonas++;
        return idPersonas;
    }
}
