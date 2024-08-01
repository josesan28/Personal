import java.util.Date;

/**
 *  @author José Manuel Sanchez Hernández - 24092
 *  @version 1.0
 *  Descripción: esta clase Evento representa al evento de La Academia que se está realizando.
 *  Fecha de creación: 28/07/2024
 *  Fecha de última modificación: 31/07/2024
 */

public class Evento {
    private String nombre;
    private String ubicacion;
    private int ganancia;
    private int capacidadTotal;
    private int maximoEntradas;
    private Date fechaEvento;

    /**
     * Constructor de la clase Evento.
     * @param nombre Nombre del evento.
     * @param ubicacion Ubicación del evento.
     * @param ganancia Ganancia total del evento por la venta de boletos.
     * @param capacidadTotal Capacidad total del evento.
     * @param maximoEntradas Máximo de entradas que el usuario puede comprar para el evento.
     * @param fechaEvento Fecha del evento.
     */
    public Evento(String nombre, String ubicacion, int ganancia, int capacidadTotal, int maximoEntradas, Date fechaEvento){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.ganancia = ganancia;
        this.capacidadTotal = capacidadTotal;
        this.maximoEntradas = maximoEntradas;
        this.fechaEvento = fechaEvento;
    }

    /**
     * Vender los boletos haciendo algunos cambios en los atributos del evento.
     * @param boletosVendidos Boletos vendidos al usuario.
     * @param precioTotal Precio total de los boletos que está comprando el usuario.
     */
    public void venderBoletoEvento(int boletosVendidos, int precioTotal) {
        capacidadTotal -= boletosVendidos;
        ganancia += precioTotal;
    }

    /**
     * Obtener el nombre del evento.
     * @return Nombre del evento.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establecer el nombre del evento.
     * @param nombre Nombre del evento.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtener ubicación del evento.
     * @return Ubicación del evento.
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Establecer ubicación del evento.
     * @param ubicacion Ubicación del evento.
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Obtener la ganancia total del evento por la venta de boletos.
     * @return Ganancia total del evento por la venta de boletos.
     */
    public int getGanancia() {
        return ganancia;
    }

    /**
     * Establecer la ganancia total del evento por la venta de boletos.
     * @param ganancia Ganancia total del evento por la venta de boletos.
     */
    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }

    /**
     * Obtener la capacidad total del evento.
     * @return Capacidad total del evento.
     */
    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    /**
     * Establecer la capacidad total del evento.
     * @param capacidadTotal Capacidad total del evento.
     */
    public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    /**
     * Obtener el máximo de entradas que se pueden comprar en el evento.
     * @return Máximo de entradas que se pueden comprar en el evento.
     */
    public int getMaximoEntradas() {
        return maximoEntradas;
    }

    /**
     * Establecer el máximo de entradas que se pueden comprar en el evento.
     * @param maximoEntradas Máximo de entradas que se pueden comprar en el evento.
     */
    public void setMaximoEntradas(int maximoEntradas) {
        this.maximoEntradas = maximoEntradas;
    }

    /**
     * Obtener la fecha del evento.
     * @return Fecha del evento.
     */
    public Date getFechaEvento() {
        return fechaEvento;
    }

    /**
     * Establecer la fecha del evento.
     * @param fechaEvento Fecha del evento.
     */
    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }
}
