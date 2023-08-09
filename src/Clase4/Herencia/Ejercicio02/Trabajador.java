package Clase4.Herencia.Ejercicio02;

public class Trabajador {
    private String codigo, nombre, apellido, tipo;
    private double sueldoBase, bonificacion, descuento;

    public Trabajador() {
    }

    public Trabajador(String codigo, String nombre, String apellido, String tipo, double sueldoBase, double bonificacion, double descuento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        this.sueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
        this.descuento = descuento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
