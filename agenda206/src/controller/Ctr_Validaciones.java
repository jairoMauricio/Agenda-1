package controller;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Ctr_Validaciones {
    public void valNumeros(java.awt.event.KeyEvent e){
        int key = (int) e.getKeyChar();
        if(key >= 33 && key < 48 || key >= 91 && key < 128 || key >= 65){
            e.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar caracteres especiales ni letras\n", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
    }
}
