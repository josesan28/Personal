import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *  @author José Manuel Sanchez Hernández - 24092
 *  @version 1.0
 *  Descripción: esta clase boleto representa el boleto que compra el usuario.
 *  Fecha de creación: 28/07/2024
 *  Fecha de última modificación: 31/07/2024
 */

public class Boleto {

    private String numeroBoleto;
    private String localidad;
    private Date fecha;
    private static int correlativo = 1;

    /**
     * Constructor de la clase Boleto.
     * @param numeroBoleto Número del boleto.
     * @param localidad Localidad a la que pertenece el boleto.
     * @param fecha Fecha de creación del boleto.
     */
    public Boleto(String numeroBoleto, String localidad, Date fecha){
       this.numeroBoleto = crearTicket();
       this.localidad = localidad;
       this.fecha = fecha;
    }

    /*
     * Crear el número del boleto utilizando un correlativo y la fecha.
     */
    public String crearTicket(){
        SimpleDateFormat formato_fecha = new SimpleDateFormat("ddMMyyy");
        String fecha = formato_fecha.format(new Date());
        return fecha + correlativo++;
    }

    /**
     * Obtener el número de boleto.
     * @return Número de boleto.
     */
    public String getNumeroBoleto() {
        return numeroBoleto;
    }

    /**
     * Establecer el número de boleto.
     * @param numeroBoleto Número de boleto.
     */
    public void setNumeroBoleto(String numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    /**
     * Obtener localidad del boleto.
     * @return Localidad del boleto.
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Establecer localidad del boleto.
     * @param localidad Localidad del boleto.
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * Obtener fecha de creación del boleto.
     * @return Fecha de creación del boleto.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establecer fecha de creación del boleto.
     * @param fecha Fecha de creación del boleto.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }  
}
