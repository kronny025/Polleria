package capanegocio;
import java.util.ArrayList;
public class Factura {
    // Atributos de la clase
    private String codRegistroVenta;
    private String tipoPagoRegistroVenta;
    private double montoRegistrroVenta;
    public Cliente correspondeCliente;
    public ArrayList<DetalleFactura> tieneDetalleFactura = new ArrayList();

    public String getCodRegistroVenta() {
        return codRegistroVenta;
    }

    public void setCodRegistroVenta(String codRegistroVenta) {
        this.codRegistroVenta = codRegistroVenta;
    }

    public String getTipoPagoRegistroVenta() {
        return tipoPagoRegistroVenta;
    }

    public void setTipoPagoRegistroVenta(String tipoPagoRegistroVenta) {
        this.tipoPagoRegistroVenta = tipoPagoRegistroVenta;
    }

    public double getMontoRegistrroVenta() {
        return montoRegistrroVenta;
    }

    public void setMontoRegistrroVenta(double montoRegistrroVenta) {
        this.montoRegistrroVenta = montoRegistrroVenta;
    }
}
