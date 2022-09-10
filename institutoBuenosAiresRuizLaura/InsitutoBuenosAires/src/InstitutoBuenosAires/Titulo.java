package InstitutoBuenosAires;

public abstract class Titulo {
    private int cantidadMaterias;
    private String fechaInicio;
    private String fechaFin;
    private boolean selloMinisterio;
    private boolean selloInstitucion;
    private Persona persona;

    public boolean puedeEjercer(){
        if(isSelloInstitucion() && isSelloInstitucion()){
            return true;
        }
        return false;
    }

    public Titulo(boolean selloMinisterio, boolean selloInstitucion) {
        this.selloMinisterio = selloMinisterio;
        this.selloInstitucion = selloInstitucion;
    }

    public int getCantidadMaterias() {
        return cantidadMaterias;
    }

    public void setCantidadMaterias(int cantidadMaterias) {
        this.cantidadMaterias = cantidadMaterias;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isSelloMinisterio() {
        return selloMinisterio;
    }

    public void setSelloMinisterio(boolean selloMinisterio) {
        this.selloMinisterio = selloMinisterio;
    }

    public boolean isSelloInstitucion() {
        return selloInstitucion;
    }

    public void setSelloInstitucion(boolean selloInstitucion) {
        this.selloInstitucion = selloInstitucion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
