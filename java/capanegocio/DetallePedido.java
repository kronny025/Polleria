package capanegocio;

public class DetallePedido {
    // Atributos de la clase
    private String codDetallePedido;
    private float cantidadDetallePedido;
    public Pedido pertenecePedido;
    public Producto consignaProducto;

    public String getCodDetallePedido() {
        return codDetallePedido;
    }

    public void setCodDetallePedido(String codDetallePedido) {
        this.codDetallePedido = codDetallePedido;
    }

    public float getCantidadDetallePedido() {
        return cantidadDetallePedido;
    }

    public void setCantidadDetallePedido(float cantidadDetallePedido) {
        this.cantidadDetallePedido = cantidadDetallePedido;
    }
}
