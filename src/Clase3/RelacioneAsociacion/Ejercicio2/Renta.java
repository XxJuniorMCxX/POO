package Clase3.RelacioneAsociacion.Ejercicio2;

public class Renta {
    private double costo;
    private double duracion;
    private Inquilino miInquilino;
    private Inmueble miInmueble;

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Inquilino getMiInquilino() {
        return miInquilino;
    }

    public void setMiInquilino(Inquilino miInquilino) {
        this.miInquilino = miInquilino;
    }

    public Inmueble getMiInmueble() {
        return miInmueble;
    }

    public void setMiInmueble(Inmueble miInmueble) {
        this.miInmueble = miInmueble;
    }

    public void mostrar(){
        System.out.println("Mi Inquilino: " + miInquilino.getNombre() + " Alquilo Mi Inmueble en la Calle: " +
                miInmueble.getCalle() + " Con Número: "  + miInmueble.getNumeroCalle() + " Estuvo Cerca De: " +
                this.duracion + " días Se Le Ixo Un Costo De: " + this.costo);
    }
}
