public class Main {

    public static void main(String[] args) {

        Controlador controlador = new Controlador();

        Actuador a1 = new Actuador("A01", "Motor", 10.5, true);
        Actuador a2 = new Actuador("A02", "Servo", 25.0, true);
        Actuador a3 = new Actuador("A03", "Pistón", 15.2, false);
        Actuador a4 = new Actuador("A04", "Válvula", 30.8, true);
        Actuador a5 = new Actuador("A05", "Relé", 12.0, false);

        controlador.agregarActuador(a1);
        controlador.agregarActuador(a2);
        controlador.agregarActuador(a3);
        controlador.agregarActuador(a4);
        controlador.agregarActuador(a5);

        controlador.agregarActuador(
                new Actuador("A01", "Motor", 5, true));

        Actuador encontrado =
                controlador.buscarActuador("A03");

        if (encontrado != null) {
            System.out.println("Actuador encontrado: "
                    + encontrado.getTipo());
        }

        System.out.println("Actuadores activos: "
                + controlador.contarActivos());

        System.out.println("Posición promedio: "
                + controlador.calcularPosicionPromedio());

        controlador.eliminarActuador("A02");

        System.out.println("Activos después de eliminar: "
                + controlador.contarActivos());
    }
}
