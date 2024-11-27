import java.util.Scanner;

public class Ascensor {
    private boolean funcionando = false; // Indica si el ascensor está en funcionamiento
    private int pisoActual = 0; // Piso actual del ascensor
    private int pisoDestino = 0; // Piso de destino
    private int pisosTotales= 20; //Cantidad máxima de pisos
    private Scanner sc = new Scanner(System.in); // Scanner para leer entradas
    // Metodo para mover el ascensor entre pisos
    public synchronized void moverAscensor() {
        while (funcionando) { // Esperar si el ascensor está ocupado
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println("Inserte el número del piso al que desea ir:");
        pisoDestino = sc.nextInt();
        if(pisoDestino <= pisosTotales) {
            if (pisoDestino != pisoActual) { // Verificar si el destino es distinto del piso actual
                funcionando = true;
                System.out.println("Ascensor en funcionamiento...");

                if (pisoDestino > pisoActual) {
                    System.out.println("Subiendo...");
                } else {
                    System.out.println("Bajando...");
                }
                System.out.println("Ha llegado del piso " + pisoActual + " al piso " + pisoDestino);
                pisoActual = pisoDestino; // Actualizar el piso actual
                funcionando = false;
            } else {
                System.out.println("Ya está en el piso actual. Por favor, elija otro piso.");
            }
        }   else {
            System.out.println("Ese piso no existe, escoja otro por favor.");
        }
        notifyAll(); // Notificar a otros hilos que el ascensor está disponible
    }
}