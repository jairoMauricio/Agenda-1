package model;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
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
}
