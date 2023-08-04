package Clase2.Encapsulamiento;

public class Main {
    public static void main(String[] args) {
        //constructor de forma implicito
        Persona p = new Persona();
        System.out.println("\tDatos De Persona " +
                "\nNombre: " + p.getNombre() +
                "\nApellido Paterno: " + p.getaPaterno() +
                "\nApellido Materno: " + p.getaMaterno() +
                "\nSexo: " + p.getSexo()+
                "\nEdad: " + p.getEdad()
        );
    }
}
