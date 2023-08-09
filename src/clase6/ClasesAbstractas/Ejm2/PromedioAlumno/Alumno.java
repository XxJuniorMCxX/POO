package clase6.ClasesAbstractas.Ejm2.PromedioAlumno;

public abstract class Alumno {
    private String codigo,nombre,apellido,sexo;
    private double pcTotal,examParcial,examFinal;

    public Alumno() {
    }

    public Alumno(String codigo, String nombre, String apellido, String sexo, double pcTotal, double examParcial, double examFinal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.pcTotal = pcTotal;
        this.examParcial = examParcial;
        this.examFinal = examFinal;
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

    public double getPcTotal() {
        return pcTotal;
    }

    public void setPcTotal(double pcTotal) {
        this.pcTotal = pcTotal;
    }

    public double getExamParcial() {
        return examParcial;
    }

    public void setExamParcial(double examParcial) {
        this.examParcial = examParcial;
    }

    public double getExamFinal() {
        return examFinal;
    }

    public void setExamFinal(double examFinal) {
        this.examFinal = examFinal;
    }
    public abstract double promedioTotal();
}
