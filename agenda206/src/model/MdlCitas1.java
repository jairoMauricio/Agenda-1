/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import  view.VwRegistro2;

/**
 *
 * Julio Quintero
 * Jhenifer Plata 
 * Juan pinchao
 * Luis Torres
 * Sebastian Jimenez
 */
public class MdlCitas1 {
    
    String Nombre;
    String Direccion;
    int    Telefono;
    int    Id ;
    String correo;
    String Descripcion;

    public MdlCitas1() {
    }

    public MdlCitas1(String Nombre, String Direccion, int Telefono, int Id,String correo,String Descripcion) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Id = Id;
        this.correo = correo;
        this.Descripcion = Descripcion;
    }
    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
     
    
    
}
