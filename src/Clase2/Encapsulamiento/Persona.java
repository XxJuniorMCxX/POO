package Clase2.Encapsulamiento;

public class Persona {
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private char sexo;
    private byte edad;

    public Persona() {
        this.nombre="Junior";
        this.aPaterno="Castillo";
        this.aMaterno="Yarlequé";
        this.sexo='M';
        this.edad=35;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
}
