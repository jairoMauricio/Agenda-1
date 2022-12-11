package controller;

import conexion.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.MdlSqlPersonas;
import model.MdlSqlUsuarios;
import model.Mdl_Users;
import view.VwRegistrar;

/*
Creado por:
Jhonny Castaño
Jhon Gonzalez
Nicolas Gutierrez
Juan Varela
Santiago Nieto
 */
public class CtrRegistrar implements ActionListener {

    private VwRegistrar vista;
    private Mdl_Users modelo;
    private MdlSqlUsuarios sqlUsuers;
    private MdlSqlPersonas sqlPerson;
    private CtrFechas fecha;

    public CtrRegistrar(VwRegistrar vista, Mdl_Users modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnRegistrar.addActionListener(this);
    }

    public void registrar() {
        modelo.setNombres(vista.txtNombres.getText());
        modelo.setApellidos(vista.txtApellidos.getText());
        modelo.setTipouser(vista.cbxTipoUsuario.getSelectedItem().toString());
        modelo.setNombreuser(vista.txtNombreUsuario.getText());
        modelo.setClave(vista.pwdClave.getText());
        modelo.setConfirmarClave(vista.pwdConfirmarClave.getText());
    }

    public void guardarDatos(Mdl_Users modelo_user) {
        Conexion conectar = new Conexion();
        String sql = "INSERT INTO USERS(IDUSER,CLAVE,TIPO_USER,NOMBRE_USER,FECHA_REGISTRO,FECHA_MODIFICACION,ESTADO,PERSONA)VALUES(" + sqlUsuers.autoIncrementoUsuarios() + ",'" + modelo.getClave() + "','" + modelo.getTipouser() + "','" + modelo.getNombreuser() + "','" + fecha.fechaHoy() + "','" + null + "','" + modelo.getUestado() + "'," + sqlUsuers.autoIncrementoUsuarios() + ")";
        conectar.ejecutar(sql);
    }

    public void guardarPersonas(MdlSqlPersonas modelo_person) {
        Conexion conectar = new Conexion();
        String sql = "INSERT INTO PERSONAS(IDPERSONA,NOMBRES,APELLIDOS,FECHA_REGISTRO,FECHA_MODIFICACION,ESTADO)VALUES(" + sqlPerson.autoIncrementoPersonas() + ",'" + modelo.getNombres() + "','" + modelo.getApellidos() + "','" + modelo.getEstado() + "','" + fecha.fechaHoy() + "','" + null + "')";
        conectar.ejecutar(sql);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == vista.btnRegistrar) {
            System.out.println("hola");
        }

//        if (evt.getSource() == vista.btnRegistrar) {
//            if (ventanRegistrar.txtNombres.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "No dejar campos vacios.", "Error", JOptionPane.ERROR_MESSAGE);
//            } else {
//            }
//        }
    }
}
