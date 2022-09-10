package InstitutoBuenosAires;

public class Main {

    public static void main(String[] args) {
    Persona persona1 = new Persona("Laura","Ruiz","99.999.999",34);

    Terciario terciario1 = new Terciario(true,true);
    terciario1.setPersona(persona1);
    terciario1.setTipoDeValidacion("NACIONAL");
    terciario1.validacionNacional();
    ((Titulo)terciario1).setSelloInstitucion(true);
    ((Titulo)terciario1).setSelloMinisterio(true);
    System.out.println(persona1.getNombre()+"  "+persona1.getApellido()
            +" ¿Puede Ejercer?: "+((Titulo)terciario1).puedeEjercer());

    Licenciatura licenciatura1 = new Licenciatura(true,true);
    Licenciatura licenciatura2 = new Licenciatura(true,true);
    licenciatura1.setCantidadTrabajosInvestigacion(1);
    licenciatura2.setCantidadTrabajosInvestigacion(2);

    System.out.println(licenciatura1.compareTo(licenciatura2));






    }

}
