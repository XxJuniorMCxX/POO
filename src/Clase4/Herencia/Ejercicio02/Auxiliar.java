package Clase4.Herencia.Ejercicio02;

public class Auxiliar extends Trabajador{
    private double bonoEspecial;

    public Auxiliar() {
    }

    public Auxiliar(String codigo, String nombre, String apellido, String tipo, double sueldoBase, double bonificacion, double descuento, double bonoEspecial) {
        super(codigo, nombre, apellido, tipo, sueldoBase, bonificacion, descuento);
        this.bonoEspecial = bonoEspecial;
    }

    public double getBonoEspecial() {
        return bonoEspecial;
    }

    public void setBonoEspecial(double bonoEspecial) {
        this.bonoEspecial = bonoEspecial;
    }
    public double neto(){
        return (getSueldoBase()+getBonificacion()-getDescuento())+this.bonoEspecial;
    }
    public void muestra(){
        System.out.println("Trabajador: " + getNombre() + " " + getApellido() +" Con Codigo " + getCodigo() +
                " Gana: " + getSueldoBase() + " Soles Recibe de Bonificacion : " + getBonificacion() +
                " Le Hacen Descuento de: " + getDescuento() + " Recibe de Bonificación Especial: " + bonoEspecial +
                " Cobrando En Total Un Neto De: " + this.neto());
    }
}
