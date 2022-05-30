package capanegocio;
import java.util.ArrayList;
public class Motorizado {
    // Atributos de la clase
    private String codMotorizado;
    private String nombreMotorizado;
    private String celularMotorizado;
    public ArrayList<Pedido> atiendePedido = new ArrayList();

    public String getCodMotorizado() {
        return codMotorizado;
    }

    public void setCodMotorizado(String codMotorizado) {
        this.codMotorizado = codMotorizado;
    }

    public String getNombreMotorizado() {
        return nombreMotorizado;
    }

    public void setNombreMotorizado(String nombreMotorizado) {
        this.nombreMotorizado = nombreMotorizado;
    }

    public String getCelularMotorizado() {
        return celularMotorizado;
    }

    public void setCelularMotorizado(String celularMotorizado) {
        this.celularMotorizado = celularMotorizado;
    }
}
