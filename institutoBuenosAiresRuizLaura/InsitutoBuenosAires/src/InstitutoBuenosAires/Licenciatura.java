package InstitutoBuenosAires;

public class Licenciatura extends Titulo implements Comparable {
    private String temaDeTesis;
    private String fechEntregaTesis;
    private int cantidadTrabajosInvestigacion;

    @Override
    public int compareTo(Object o) {
        Licenciatura licenciatura =((Licenciatura)o);
        if(this.cantidadTrabajosInvestigacion > licenciatura.cantidadTrabajosInvestigacion){
            return +1;
        } else if (this.cantidadTrabajosInvestigacion < licenciatura.cantidadTrabajosInvestigacion){
            return -1;
        }
            return 0;
    }

    public String getTemaDeTesis() {
        return temaDeTesis;
    }

    public void setTemaDeTesis(String temaDeTesis) {
        this.temaDeTesis = temaDeTesis;
    }

    public String getFechEntregaTesis() {
        return fechEntregaTesis;
    }

    public void setFechEntregaTesis(String fechEntregaTesis) {
        this.fechEntregaTesis = fechEntregaTesis;
    }

    public int getCantidadTrabajosInvestigacion() {
        return cantidadTrabajosInvestigacion;
    }

    public void setCantidadTrabajosInvestigacion(int cantidadTrabajosInvestigacion) {
        this.cantidadTrabajosInvestigacion = cantidadTrabajosInvestigacion;
    }
    public Licenciatura(boolean selloMinisterio, boolean selloInstitucion) {
        super(selloMinisterio, selloInstitucion);
    }
}
