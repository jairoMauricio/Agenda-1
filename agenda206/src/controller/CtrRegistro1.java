
package controller;
import view.VwRegistro2;
import conexion.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import model.MdlCitas1;
import view.VwCitas;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * Julio Quintero
 * Jhenifer Plata 
 * Juan pinchao
 * Luis Torres
 * Sebastian Jimenez
 */
public class CtrRegistro1  implements ActionListener {
    
    private VwRegistro2 view;
    private MdlCitas1 model;
    
       public CtrRegistro1 (MdlCitas1 model, VwRegistro2 view) {
        this.view = view;
        this.model = model;
        this.view.BtnEnviar.addActionListener(this);

    }
       
       {
           
      
        try {
            Properties props = new Properties();
            props.setProperty("mail.smtp.host","smtp,gmail.com");
            props.setProperty("mail.smtp.starttls.enable","true");
            props.setProperty("mail.smtp.ports","587");
            props.setProperty("mail.smtp.auth","true");
            
            
            Session session = Session.getInstance(props);
            
            String CorreoRemitente = "julioarcos3122@gmail.com";
            String passWordRemitente = "";
            String correoReceptor = view.txtcorreo.getText();
            String asunto = "TIENES UNA CITA" + view.txtTipoCita.getText() ;
            String mensaje = view.txtDescripcion.getText();
            
            
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(CorreoRemitente));
            
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);
            message.setText(mensaje);
            
            
            Transport t = session.getTransport("smtp");
            t.connect(CorreoRemitente,passWordRemitente);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();
            
            JOptionPane.showMessageDialog(null, "Su mensaje ha sido enviado");
            
          
        } catch (AddressException ex) {
            Logger.getLogger(CtrRegistro1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(CtrRegistro1.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        
      }  
    

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.BtnEnviar) {
        }

    }
}
