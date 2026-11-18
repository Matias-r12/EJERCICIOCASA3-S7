import java.util.ArrayList;

public class Controlador {

    private ArrayList<Actuador> actuadores;

    public Controlador() {
        actuadores = new ArrayList<>();
    }

    public void agregarActuador(Actuador actuador) {

        for (Actuador a : actuadores) {
            if (a.getCodigo().equalsIgnoreCase(actuador.getCodigo())) {
                System.out.println("Código duplicado.");
                return;
            }
        }

        actuadores.add(actuador);
    }

    public void eliminarActuador(String codigo) {

        for (Actuador a : actuadores) {

            if (a.getCodigo().equalsIgnoreCase(codigo)) {
                actuadores.remove(a);
                System.out.println("Actuador eliminado.");
                return;
            }
        }

        System.out.println("Actuador no encontrado.");
    }

    public Actuador buscarActuador(String codigo) {

        for (Actuador a : actuadores) {

            if (a.getCodigo().equalsIgnoreCase(codigo)) {
                return a;
            }
        }

        return null;
    }

    public int contarActivos() {

        int contador = 0;

        for (Actuador a : actuadores) {

            if (a.isActivo()) {
                contador++;
            }
        }

        return contador;
    }

    public double calcularPosicionPromedio() {

        if (actuadores.isEmpty()) {
            return 0;
        }

        double suma = 0;

        for (Actuador a : actuadores) {
            suma += a.getPosicion();
        }

        return suma / actuadores.size();
    }
}
