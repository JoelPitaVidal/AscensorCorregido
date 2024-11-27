// Clase que ejecuta la funcionalidad de mover el ascensor
public class Usuario implements Runnable {
    private final Ascensor ascensor;

    public Usuario(Ascensor ascensor) {
        this.ascensor = ascensor;
    }

    @Override
    public void run() {
        while (true) {
            ascensor.moverAscensor(); // Llama al metodo para mover el ascensor
        }
    }
}
