package model;

public class Mdl_citas {
    private int idCita;
    private String titulo;
    private String descripcion;
    private String fechaCita;
    private String horaCita;

    public Mdl_citas(int idCita, String titulo, String descripcion, String fechaCita, String horaCita) {
        this.idCita = idCita;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
    }

    public Mdl_citas() {
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }
}
