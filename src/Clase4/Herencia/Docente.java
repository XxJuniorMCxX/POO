package Clase4.Herencia;

public class Docente extends Persona{
    private String codDocente;

    public Docente() {
    }

    public Docente(String nombre, String aPaterno, String aMaterno, byte edad, String codDocente) {
        super(nombre, aPaterno, aMaterno, edad);
        this.codDocente = codDocente;
    }

    public String getCodDocente() {
        return codDocente;
    }

    public void setCodDocente(String codDocente) {
        this.codDocente = codDocente;
    }
    public void muestra(){
        System.out.println("Docente.muestra Nombre: " + getNombre() + " Apellido Paterno " + getaPaterno() +
                " Apellido Materno " + getaMaterno() + " Edad " + getEdad() + "Codigo Docente " + codDocente);
    }
}
