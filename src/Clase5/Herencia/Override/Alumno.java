package Clase5.Herencia.Override;

public class Alumno {
    private String codigo, nombre, apellido, sexo;
    private double promPracticas, examenParcial, getExamenFinal;

    public Alumno() {
    }

    public Alumno(String codigo, String nombre, String apellido, String sexo, double promPracticas, double examenParcial, double getExamenFinal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.promPracticas = promPracticas;
        this.examenParcial = examenParcial;
        this.getExamenFinal = getExamenFinal;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPromPracticas() {
        return promPracticas;
    }

    public void setPromPracticas(double promPracticas) {
        this.promPracticas = promPracticas;
    }

    public double getExamenParcial() {
        return examenParcial;
    }

    public void setExamenParcial(double examenParcial) {
        this.examenParcial = examenParcial;
    }

    public double getGetExamenFinal() {
        return getExamenFinal;
    }

    public void setGetExamenFinal(double getExamenFinal) {
        this.getExamenFinal = getExamenFinal;
    }

    public double resultadoFinal() {
        return Double.parseDouble(String.format("%.2f", (getPromPracticas() + this.examenParcial + this.getExamenFinal) / 3));
    }
}
