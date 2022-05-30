package capanegocio;
import java.util.ArrayList;
public class Producto {
    // Atributos de la clase
    private String codProducto;
    private String descripcionProducto;
    private double precioReferenciaProducto;
    public ArrayList<DetalleFactura> tieneDetalleFactura = new ArrayList();
    public ArrayList<DetallePedido> estaenPedido = new ArrayList();

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getPrecioReferenciaProducto() {
        return precioReferenciaProducto;
    }

    public void setPrecioReferenciaProducto(double precioReferenciaProducto) {
        this.precioReferenciaProducto = precioReferenciaProducto;
    }
}
