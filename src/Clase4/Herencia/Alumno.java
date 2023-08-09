package Clase4.Herencia;

import org.w3c.dom.ls.LSOutput;

public class Alumno extends Persona {
    private String curso;
    private double nota1;
    private double nota2;

    public Alumno() {
    }

    public Alumno(String nombre, String aPaterno, String aMaterno, byte edad, String curso, double nota1, double nota2) {
        super(nombre, aPaterno, aMaterno, edad);
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double promedio(double n1, double n2) {
        n1 = getNota1();
        n2 = getNota2();
        return Double.parseDouble(String.format("%.2f", (n1 + n2) / 2));
    }

    public void muestra() {
        System.out.println("El Alumno: " + getNombre() + " " + getaPaterno() + " " + getaMaterno() +
                "Lleva EL Curso De: " + this.curso + " Obtuvo Es Su Primera Pc :" + this.nota1 +
                " Obtuvo Es Su Segunda Pc :" + this.nota2 + " A Sus " + getEdad() + " años Obtuvo un Promedio de: "
                + promedio(getNota1(), getNota2()));
    }
}
