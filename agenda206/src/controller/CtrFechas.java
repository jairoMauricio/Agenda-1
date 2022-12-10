package controller;

/*
Creado por:
Jhonny Castaño
Jhon Gonzalez
Nicolas Gutierrez
Juan Varela
Santiago Nieto
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CtrFechas {
     private int dia;
    private int mes;
    private int anio;

    public String fechaHoy() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return dateFormat.format(date);
    }
    
    public String horaHoy() {
        Date date = new Date();
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        return hourFormat.format(date);
    }

    public Date fecha() {
        Date date =null;
         SimpleDateFormat formato= new SimpleDateFormat("yyyy/MM/dd");
        try {
            date = formato.parse(formato.format(new Date()));
        } catch (ParseException ex) {
            Logger.getLogger(CtrFechas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
    }

    public boolean validaFecha(Date fecha) {
        Date date = new Date();
        String e, h, eDia, eMes, eAnio, hDia, hMes, hAnio;
        boolean sw = false;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        e = dateFormat.format(fecha);
        h = dateFormat.format(date);
        int pos1 = e.indexOf('/');
        int pos2 = e.lastIndexOf('/');

        eDia = e.substring(0, pos1);
        hDia = h.substring(0, pos1);
        
        eMes = e.substring(pos1 + 1, pos2);
        hMes = h.substring(pos1 + 1, pos2);
        
        eAnio = e.substring(pos2 + 1);
        hAnio = h.substring(pos2 + 1);

        if (Integer.parseInt(eAnio) > (Integer.parseInt(hAnio) - 18)) {
            sw= false;
        }else{
            sw= true;
        }
        return sw;
    }
    
    public boolean validaFechaActual(Date fecha) {
        Date date = new Date();
        String e, h, eDia, eMes, eAnio, hDia, hMes, hAnio;
        boolean sw = false;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        e = dateFormat.format(fecha);
        h = dateFormat.format(date);
        
        int pos1 = e.indexOf('/');
        
        int pos2 = e.lastIndexOf('/');

        eDia = e.substring(0, pos1);
        hDia = h.substring(0, pos1);
        
        eMes = e.substring(pos1 + 1, pos2);
        hMes = h.substring(pos1 + 1, pos2);
        
        eAnio = e.substring(pos2 + 1);
        hAnio = h.substring(pos2 + 1);

        if (Integer.parseInt(eAnio) == Integer.parseInt(hAnio) && Integer.parseInt(eMes) == Integer.parseInt(hMes) && Integer.parseInt(eDia) >= Integer.parseInt(hDia)) {
            sw= true;
        }else{
            sw= false;
        }
        return sw;
    }
    public boolean validaFechaActual(Date actual,Date futura) {        
        String a, f, aDia, aMes, aAnio, fDia, fMes, fAnio;
        boolean sw = false;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        a = dateFormat.format(actual);
        f = dateFormat.format(futura);
        
        
        int pos1 = a.indexOf('/');
        
        int pos2 = a.lastIndexOf('/');

        
        aDia = a.substring(0, pos1);
        fDia = f.substring(0, pos1);
        
        aMes = a.substring(pos1 + 1, pos2);
        fMes = f.substring(pos1 + 1, pos2);
        
        aAnio = a.substring(pos2 + 1);
        fAnio = f.substring(pos2 + 1);

        if (Integer.parseInt(aAnio) == Integer.parseInt(fAnio) && Integer.parseInt(aMes) <= Integer.parseInt(fMes) && Integer.parseInt(aDia) <= Integer.parseInt(fDia)) {
            sw= true;            
        }else{
            sw= false;
        }
        return sw;
    }
    

    
    public String devuelveFecha(Date fecha){
        String formato="yyyy/MM/dd";
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        
        return sdf.format(fecha);
    }
    
    public Date devuelveFecha(String fecha){
        SimpleDateFormat formato= new SimpleDateFormat("yyyy/MM/dd");
        Date fechaParseada=null;
        try {
            fechaParseada = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(CtrFechas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fechaParseada;
    }
    
    public int comparaFechas(Date fecha){
        int sw;
        String formato="yyyy-LL-dd";
        Date fechasistema =new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(formato);     
        sw=sdf.format(fecha).compareTo(sdf.format(fechasistema));
        return sw;
    }
    
    public boolean fechaVacia(Date fecha){
        boolean sw=false; 
        String formato="yyyy-LL-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(formato); 
        try {
             sdf.format(fecha);
        } catch (NullPointerException e) {
            sw=true;
        }       
        return sw;
    }    
}
