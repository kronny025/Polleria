package capanegocio;

public class DetalleFactura {
    // Atributos de la clase
    private String codDetalleFactura;
    private double precioRealUnitarioDetalleFactura;
    private double subtotalDetalleFactura;
    private float cantidadDetalleFactura;
    public Factura perteneceFactura;
    public Producto contieneProducto;

    public String getCodDetalleFactura() {
        return codDetalleFactura;
    }

    public void setCodDetalleFactura(String codDetalleFactura) {
        this.codDetalleFactura = codDetalleFactura;
    }

    public double getPrecioRealUnitarioDetalleFactura() {
        return precioRealUnitarioDetalleFactura;
    }

    public void setPrecioRealUnitarioDetalleFactura(double precioRealUnitarioDetalleFactura) {
        this.precioRealUnitarioDetalleFactura = precioRealUnitarioDetalleFactura;
    }

    public double getSubtotalDetalleFactura() {
        return subtotalDetalleFactura;
    }

    public void setSubtotalDetalleFactura(double subtotalDetalleFactura) {
        this.subtotalDetalleFactura = subtotalDetalleFactura;
    }

    public float getCantidadDetalleFactura() {
        return cantidadDetalleFactura;
    }

    public void setCantidadDetalleFactura(float cantidadDetalleFactura) {
        this.cantidadDetalleFactura = cantidadDetalleFactura;
    }
    
}
