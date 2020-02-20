package clases;

public class Dormida extends Servicios{
    private String tipo;

    public Dormida(Integer codigo, String descripcion, Double precio, String tipo) {
        super(codigo, descripcion, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
