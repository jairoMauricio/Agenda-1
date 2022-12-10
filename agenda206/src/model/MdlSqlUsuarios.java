package model;

import conexion.Conexion;
import static conexion.Conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
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
        Date fecha = new Date();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, usuarios.getIduser());
            ps.setString(2, usuarios.getClave());
            ps.setString(3, usuarios.getTipouser());
            ps.setString(4, usuarios.getNombreuser());
            ps.setString(5, usuarios.getUfecharegistro());
            ps.setString(6, usuarios.getUfechamodificacion());
            ps.setString(7, usuarios.getUestado());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int autoIncrementoUsuarios() {
        Conexion cone = new Conexion();
        String sql = "SELECT IDUSER  from USERS";
        ResultSet rs = cone.consultar(sql);
        int idUsuarios = 0;
        try {
            while (rs.next()) {
                idUsuarios = rs.getInt("IDUSER");
            }
        } catch (Exception e) {
            System.out.println("Error al buscar el id de user");
        }
        idUsuarios++;
        return idUsuarios;
    }
}
