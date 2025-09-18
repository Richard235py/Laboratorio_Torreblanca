package escuela;

public class Alumno extends Persona {
    private int creditos;

    public Alumno(String codigo, String nombre, String apellidos, int creditos) {
        super(codigo, nombre, apellidos);
        this.creditos = creditos;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public void registrarAsistencia() {
        System.out.println("Asistencia registrada para alumno: " + getCodigo());
    }

    @Override
    public String toString() {
        return "Alumno(" +
               "codigo=" + getCodigo() +
               ", nombre=" + getNombre() +
               ", apellidos=" + getApellidos() +
               ", creditos=" + creditos +
               ')';
    }

    public String rendirExamen() {
        return "Rindiendo evaluación";
    }
}
