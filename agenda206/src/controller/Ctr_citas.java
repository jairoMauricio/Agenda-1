package controller;

import conexion.Conexion;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Mdl_citas;
import view.VwAlerta;
import view.VwMenu;

public class Ctr_citas {
    public Mdl_citas objCita = new Mdl_citas();
    
    public Mdl_citas consultarCita(String hora, String fecha){
        Conexion conectar = new Conexion();
        String sql = "SELECT IDCITA, TITULO, DESCRIPCION, FECHA_CITA, HORA_CITA FROM CITAS WHERE FECHA_CITA = '"
                + fecha +"' AND HORA_CITA = '" + hora +"'";
        ResultSet busqueda;
        try {
            busqueda = conectar.consultar(sql);
            if(busqueda.next()){
                objCita.setIdCita(busqueda.getInt("IDCITA"));
                objCita.setTitulo(busqueda.getString("TITULO"));
                objCita.setDescripcion(busqueda.getString("DESCRIPCION"));
                objCita.setFechaCita(busqueda.getString("FECHA_CITA"));
                objCita.setHoraCita(busqueda.getString("HORA_CITA"));
            }
        } catch (Exception error) {
            System.out.println("Error en la consulta de la cita :" + error);
            JOptionPane.showMessageDialog(null,"Error en la consulta de la cita");
        }
        return objCita;
    }
}
