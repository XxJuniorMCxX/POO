package Clase3.RelacioneAsociacion;

public class Persona {
    private String nombre;
    private Mascota miMascota;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mascota getMiMascota() {
        return miMascota;
    }

    public void setMiMascota(Mascota miMascota) {
        this.miMascota = miMascota;
    }

    public void mostrar() {
        System.out.println("Mi Nombre Es: " + nombre +
                " Tengo Una Mascota Que Se Llama: " + miMascota.getNombre() +
                " Es De Tipo: " + miMascota.getTipo());
    }
}
