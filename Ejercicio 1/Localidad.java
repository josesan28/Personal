/**
 *  @author José Manuel Sanchez Hernández - 24092
 *  @version 1.0
 *  Descripción: esta clase localidad representa las localidades que hay en el evento de la academia.
 *  Fecha de creación: 28/07/2024
 *  Fecha de última modificación: 31/07/2024
 */

public class Localidad {
    private String tipo;
    private int capacidadLocalidad;
    private int precio;
    private int boletosVendidos;
    private int ganancias;

    /**
     * Constructor de la clase Localidad.
     * @param tipo Nombre de la localidad.
     * @param capacidadLocalidad Capacidad de la localidad.
     * @param precio Precio de los boletos de la localidad.
     */
    public Localidad(String tipo, int capacidadLocalidad, int precio) {
        this.tipo = tipo;
        this.capacidadLocalidad = capacidadLocalidad;
        this.precio = precio;
        this.boletosVendidos = 0;
        this.ganancias = 0;
    }

    /**
     * Validar si hay boletos disponibles en una localidad.
     * @param boletosAComprar Boletos que quiere comprar el usuario.
     * @return Booleano para comprobar si hay boletos disponibles o no.
     */
    public boolean validarDisponibilidad(int boletosAComprar) {
        if (boletosAComprar <= (capacidadLocalidad - boletosVendidos)){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Vender boletos haciendo algunos cambios en los atributos de la localidad.
     * @param boletosPendientes Cantidad de boletos que quiere comprar el usuario.
     */
    public void venderBoletosLocalidad(int boletosPendientes) {
        this.boletosVendidos += boletosPendientes;
        this.capacidadLocalidad -= boletosPendientes;
        this.ganancias += (boletosPendientes * this.precio);

    }

    /**
     * Obtener el nombre de la localidad.
     * @return Nombre de la localidad.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establecer el nombre de la localidad.
     * @param tipo Nombre de la localidad.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtener la capacidad de la localidad.
     * @return Capacidad de la localidad.
     */
    public int getCapacidadLocalidad() {
        return capacidadLocalidad;
    }

    /**
     * Establecer la capacidad de la localidad.
     * @param capacidadLocalidad Capacidad de la localidad.
     */
    public void setCapacidadLocalidad(int capacidadLocalidad) {
        this.capacidadLocalidad = capacidadLocalidad;
    }

    /**
     * Obtener el precio de la localidad.
     * @return Precio de la localidad.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establecer el precio de la localidad.
     * @param precio Precio de la localidad.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtener los boletos vendidos de la localidad.
     * @return Boletos vendidos de la localidad.
     */
    public int getBoletosVendidos() {
        return boletosVendidos;
    }

    /**
     * Establecer la cantidad de boletos vendidos de la localidad.
     * @param boletosVendidos Boletos vendidos de la localidad.
     */
    public void setBoletosVendidos(int boletosVendidos) {
        this.boletosVendidos = boletosVendidos;
    }

    /**
     * Obtener las ganancias de la localidad.
     * @return Ganancias de la localidad.
     */
    public int getGanancias() {
        return ganancias;
    }

    /**
     * Establecer las ganancias de la localidad.
     * @param ganancias Ganacias de la localidad.
     */
    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }    
}
