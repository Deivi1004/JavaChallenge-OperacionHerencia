public class Main {
    public static void main(String[] args) {
        Dispositivo dispositivo = new Dispositivo("Jose", true);

        dispositivo.mostrarEstado();
        dispositivo.ejecutarDiagnostico();
    }
}
