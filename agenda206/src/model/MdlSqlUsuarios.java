package model;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

public class MdlSqlUsuarios extends Conexion {
    public boolean registrarUsuarios(Mdl_Users usuarios) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        String sql = "INSERT INTO() VALUES()";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, usuarios.getIduser());
            ps.setString(2, usuarios.getClave());
            ps.setString(3, usuarios.getTipouser());
            ps.setString(4, usuarios.getNombreuser());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
