public class Actuador {

    private String codigo;
    private String tipo;
    private double posicion;
    private boolean activo;

    public Actuador(String codigo, String tipo, double posicion, boolean activo) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.posicion = posicion;
        this.activo = activo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPosicion() {
        return posicion;
    }

    public boolean isActivo() {
        return activo;
    }
}