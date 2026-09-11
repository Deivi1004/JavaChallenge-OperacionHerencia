public class Main {
    public static void main(String[] args) {
        Dispositivo dispositivo = new Dispositivo("Juan", true);

        dispositivo.mostrarEstado();
        dispositivo.ejecutarDiagnostico();
    }
}
