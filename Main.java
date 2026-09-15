public class Main {
    public static void main(String[] args) {
        Dispositivo dispositivo = new Dispositivo("Jose", true);

        dispositivo.mostrarEstado();
        dispositivo.ejecutarDiagnostico();



        Proyector proyector = new Proyector("Proyector Sala 201", true);
        Computador computador = new Computador("PC Laboratorio", true);
        Impresora impresora = new Impresora("Impresora Biblioteca", false);


        proyector.mostrarEstado();
        computador.mostrarEstado();
        impresora.mostrarEstado();



        proyector.ejecutarDiagnostico();
        computador.ejecutarDiagnostico();
        impresora.ejecutarDiagnostico();
    }
}
