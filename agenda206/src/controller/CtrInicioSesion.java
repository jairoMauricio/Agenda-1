package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        CtrRegistrar a = new CtrRegistrar(ventanaRegistrar, modelo);

        vista.dispose();
        ventanaRegistrar.show();
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == vista.btnAcceder) {

        }

        if (evt.getSource() == vista.btnRegistrar) {
            registrar();
        }
    }
}
