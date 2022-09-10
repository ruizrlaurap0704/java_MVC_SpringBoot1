package InstitutoBuenosAires;

public class Terciario extends Titulo{
    private String tipoDeValidacion;

     public void validacionNacional(){
        if (tipoDeValidacion == "NACIONAL"){
            System.out.println("El Titulo cuenta con validacion Nacional");
        } else
            System.out.println("El Titulo NO cuenta con validacion Nacional");
    }

    public String getTipoDeValidacion() {
        return tipoDeValidacion;
    }

    public void setTipoDeValidacion(String tipoDeValidacion) {
        this.tipoDeValidacion = tipoDeValidacion;
    }

    public Terciario(boolean selloMinisterio, boolean selloInstitucion) {
        super(selloMinisterio, selloInstitucion);
    }
}
