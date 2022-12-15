package controller;

import conexion.Conexion;
import static conexion.Conexion.getConnection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.util.Objects.hash;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Mdl_Personas;
import model.Mdl_Users;
import model.hash;
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
    //private MdlSqlUsuarios sqlUsuers;
    //private MdlSqlPersonas sqlPerson;
    private CtrFechas fecha;
    private Mdl_Personas personas;

    public CtrRegistrar(VwRegistrar vista, Mdl_Users modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnRegistrar.addActionListener(this);
    }

    public boolean registrarpersonas(Mdl_Personas personas) {
        CtrFechas fecha = new CtrFechas();
        PreparedStatement ps = null;
        Connection con = getConnection();
        String sql = "INSERT INTO PERSONAS(IDPERSONA,NOMBRES,APELLIDOS,ESTADO,FECHA_REGISTRO,FECHA_MODIFICACION)VALUES(?,?,?,?,?,?)";
        System.out.println("datos Personas: " + sql);
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, personas.getIdpersona());
            ps.setString(2, personas.getNombres());
            ps.setString(3, personas.getApellidos());
            ps.setString(4, personas.getEstado());
            ps.setString(5, personas.getFecharegistro());
            ps.setString(6, personas.getFechamodificacion());

            ps.execute();
            //registrarUsuarios(modelo);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean registrarUsuarios(Mdl_Users usuarios) {
        PreparedStatement ps = null;
        CtrFechas fecha = new CtrFechas();
        Connection con = getConnection();
        String sql = "INSERT INTO USERS(IDUSER,CLAVE,TIPO_USER,NOMBRE_USER,FECHA_REGISTRO,FECHA_MODIFICACION,ESTADO,PERSONA) VALUES(?,?,?,?,?,?,?,?)";
        System.out.println("Datos Users: " + sql);
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, usuarios.getIduser());
            ps.setString(2, usuarios.getClave());
            ps.setString(3, usuarios.getTipouser());
            ps.setString(4, usuarios.getNombreuser());
            ps.setString(5, usuarios.getUfecharegistro());
            ps.setString(6, usuarios.getUfechamodificacion());
            ps.setString(7, usuarios.getUestado());
            //registrarpersonas(personas);
            ps.setInt(8, usuarios.getIdpersona());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean registroCompleto() {
        registrarpersonas(modelo);
        registrarUsuarios(modelo);

        return true;
    }

    public String estadoPersona() {

        Conexion cone = new Conexion();
        String sql = "SELECT ESTADO FROM PERSONAS";
        ResultSet rs = cone.consultar(sql);
        String sql2 = "";

        try {
            if (modelo.getEstado() == "Privado") {
                sql2 = "INSERT INTO PERSONAS(ESTADO)VALUES(P)";
                
            } if(modelo.getEstado() == "Publico") {
                sql2 = "INSERT INTO PERSONAS(ESTADO)VALUES(B)";
            }

        } catch (Exception e) {
            System.out.println("Error con estado del usuario");
        }
        return sql2;
    }
    
    
        public String estadoUsuario() {

        Conexion cone = new Conexion();
        String sql = "SELECT ESTADO FROM USERS";
        ResultSet rs = cone.consultar(sql);
        String sql2 = "";

        try {
            if (modelo.getUestado()== "Privado") {
                sql2 = "INSERT INTO USERS(ESTADO)VALUES(P)";
                
            } if(modelo.getUestado()== "Publico") {
                sql2 = "INSERT INTO USERS(ESTADO)VALUES(B)";
            }

        } catch (Exception e) {
            System.out.println("Error con estado del usuario");
        }
        return sql2;
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

    public void cifrar() {

        String pass = new String(vista.pwdClave.getPassword());

        String pasCon = new String(vista.pwdConfirmarClave.getPassword());

        if (pass.equals(pasCon)) {

            String nuevoPass = hash.sha1(pass);

            modelo.setClave(nuevoPass);
            modelo.setTipouser(vista.cbxTipoUsuario.getSelectedItem().toString());
            modelo.setNombreuser(vista.txtNombreUsuario.getText());
            if (registrarUsuarios(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro guardo");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña coinciden");
        }
    }

    public void registrar() {
        modelo.setNombres(vista.txtNombres.getText());
        modelo.setApellidos(vista.txtApellidos.getText());
        modelo.setTipouser(vista.cbxTipoUsuario.getSelectedItem().toString());
        modelo.setNombreuser(vista.txtNombreUsuario.getText());
        modelo.setClave(vista.pwdClave.getText());
        modelo.setConfirmarClave(vista.pwdConfirmarClave.getText());
        System.out.println("datosmodelo: " + modelo.getNombreuser());
        if (registroCompleto()) {
            JOptionPane.showMessageDialog(null, "Registro guardado.", "", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar registro.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void guardarDatos() {
        Mdl_Users modelo_user;
        Conexion conectar = new Conexion();
        String sql = "SELECT IDUSER,CLAVE,TIPO_USER,NOMBRE_USER,FECHA_REGISTRO,FECHA_MODIFICACION,ESTADO,PERSONA FROM  ADSI206.USERS";
        //String sql = "INSERT INTO USERS(IDUSER,CLAVE,TIPO_USER,NOMBRE_USER,FECHA_REGISTRO,FECHA_MODIFICACION,ESTADO,PERSONA)VALUES(" + sqlUsuers.autoIncrementoUsuarios() + ",'" + modelo.getClave() + "','" + modelo.getTipouser() + "','" + modelo.getNombreuser() + "','" + fecha.fechaHoy() + "','" + null + "','" + modelo.getUestado() + "'," + sqlUsuers.autoIncrementoUsuarios() + ")";
        conectar.ejecutar(sql);
    }

    public void guardarPersonas() {
        Conexion conectar = new Conexion();
        String sql = "SELECT IDPERSONA,NOMBRES,APELLIDOS,FECHA_REGISTRO,FECHA_MODIFICACION,ESTADO  FROM  ADSI206.PERSONAS";
        //String sql = "INSERT INTO PERSONAS(IDPERSONA,NOMBRES,APELLIDOS,FECHA_REGISTRO,FECHA_MODIFICACION,ESTADO)VALUES(" + sqlPerson.autoIncrementoPersonas() + ",'" + modelo.getNombres() + "','" + modelo.getApellidos() + "','" + modelo.getEstado() + "','" + fecha.fechaHoy() + "','" + null + "')";
        conectar.ejecutar(sql);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == vista.btnRegistrar) {
            System.out.println("hola");

            if (vista.txtNombres.getText().isEmpty() || vista.txtApellidos.getText().isEmpty()
                    || vista.cbxTipoUsuario.getSelectedItem().toString().isEmpty() || vista.txtNombreUsuario.getText().isEmpty()
                    || vista.pwdClave.getText().isEmpty() || vista.pwdConfirmarClave.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No dejar campos vacios.", "Error", JOptionPane.ERROR_MESSAGE);;

            } else {
                guardarPersonas();
                guardarDatos();
                registrar();
                //registrarUsuarios(modelo);
            }

            System.out.println("a");

        }

    }

}

//        if (evt.getSource() == vista.btnRegistrar) {
//            if (ventanRegistrar.txtNombres.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "No dejar campos vacios.", "Error", JOptionPane.ERROR_MESSAGE);
//            } else {
//            }
//        }

