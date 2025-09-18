package escuela;

public class Profesor extends Persona {
    private int horas;
    private TipoDocente tipo;

    public Profesor(String codigo, String nombre, String apellidos, int horas, TipoDocente tipo) {
        super(codigo, nombre, apellidos);
        this.horas = horas;
        this.tipo = tipo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public TipoDocente getTipo() {
        return tipo;
    }

    public void setTipo(TipoDocente tipo) {
        this.tipo = tipo;
    }

    @Override
    public void registrarAsistencia() {
        System.out.println("Asistencia registrada para profesor: " + getCodigo());
    }

    @Override
    public String toString() {
        return "Profesor(" +
               "codigo=" + getCodigo() +
               ", nombre=" + getNombre() +
               ", apellidos=" + getApellidos() +
               ", horas=" + horas +
               ", tipo=" + tipo.getNombre() +
               ')';
    }

    public String prepararEvaluacion() {
        return "Preparando evaluación";
    }
}
