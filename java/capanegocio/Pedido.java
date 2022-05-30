package capanegocio;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    // Atributos de la clase
    private String codPedido;
    private Date fechaHoraPedido;
    private String estadoPedido;
    public Motorizado atendidoporMotorizado;
    public ArrayList<DetallePedido> contieneDetallePedido = new ArrayList();

    public String getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(String codPedido) {
        this.codPedido = codPedido;
    }

    public Date getFechaHoraPedido() {
        return fechaHoraPedido;
    }

    public void setFechaHoraPedido(Date fechaHoraPedido) {
        this.fechaHoraPedido = fechaHoraPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
}
