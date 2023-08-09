package Clase4.Herencia.Ejercicio02;

public class Tecnico extends  Trabajador{
    double bonificacionEspecial;

    public Tecnico() {
    }

    public Tecnico(String codigo, String nombre, String apellido, String tipo, double sueldoBase, double bonificacion, double descuento, double bonificacionEspecial) {
        super(codigo, nombre, apellido, tipo, sueldoBase, bonificacion, descuento);
        this.bonificacionEspecial = bonificacionEspecial;
    }

    public double getBonificacionEspecial() {
        return bonificacionEspecial;
    }

    public void setBonificacionEspecial(double bonificacionEspecial) {
        this.bonificacionEspecial = bonificacionEspecial;
    }

    public double neto(){
        return (getSueldoBase()+getBonificacion()-getDescuento())+this.bonificacionEspecial;
    }
    public void muestra(){
        System.out.println("Trabajador: " + getNombre() + " " + getApellido() +" Con Codigo " + getCodigo() +
                " Gana: " + getSueldoBase() + " Soles Recibe de Bonificacion : " + getBonificacion() +
                " Le Hacen Descuento de: " + getDescuento() + " Recibe de Bonificación Especial: " + getBonificacionEspecial() +
                " Cobrando En Total Un Neto De: " + this.neto());
    }
}
