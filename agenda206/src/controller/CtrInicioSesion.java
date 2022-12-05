package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.MdlSqlUsuarios;
import model.Mdl_Users;
import view.VwInicioSesion;
import view.VwRegistrar;

/*
Creado por:
Jhonny Castaño
Jhon Gonzalez
Nicolas Gutierrez
Juan Varela
Santiago Nieto
 */

public class CtrInicioSesion implements ActionListener {

    private VwInicioSesion vista;
    private Mdl_Users modelo;

    public CtrInicioSesion(VwInicioSesion vista, Mdl_Users modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnAcceder.addActionListener(this);
        this.vista.btnRegistrar.addActionListener(this);
    }

    public void registrar() {
        VwRegistrar ventanaRegistrar = new VwRegistrar();
        MdlSqlUsuarios mdlSqlRegistrar = new MdlSqlUsuarios();

        ventanaRegistrar.setVisible(true);
        vista.setVisible(false);

        modelo.setNombres(ventanaRegistrar.txtNombres.getText());
        modelo.setApellidos(ventanaRegistrar.txtApellidos.getText());
        modelo.setTipouser(ventanaRegistrar.cbxTipoUsuario.getSelectedItem().toString());
        modelo.setNombreuser(ventanaRegistrar.txtNombreUsuario.getText());
        modelo.setClave(ventanaRegistrar.pwdClave.getText());
        modelo.setConfirmarClave(ventanaRegistrar.pwdConfirmarClave.getText());
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == vista.btnAcceder) {

        }

        if (evt.getSource() == vista.btnRegistrar) {
            registrar();
        }
    }
}
