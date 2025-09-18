package escuela;

public class App {
    public static void main(String[] args) {
        Persona a = new Alumno("24000123", "Juan", "Perez", 0);
        System.out.println(a);

        TipoDocente tipo = new TipoDocente("001", "Auxiliar");

        Profesor b = new Profesor("AX001", "Jorge", "Zavaleta", 0, tipo);
        System.out.println(b);

        Profesor c = new Profesor("BX991", "Alejandro", "Diaz", 0, tipo);
        System.out.println(c);
    }
}
