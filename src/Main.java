// Clase principal para ejecutar la simulación
public class Main {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor(); // Crear instancia de Ascensor

        // Crear e iniciar los hilos para usar el ascensor
        Thread usuario1 = new Thread(new Usuario(ascensor));
        Thread usuario2 = new Thread(new Usuario(ascensor));

        usuario1.start();
        usuario2.start();
    }
}