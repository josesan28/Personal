/**
 *  @author José Manuel Sanchez Hernández - 24092
 *  @version 1.0
 *  Descripción: esta clase Usuario representa al comprador de los boletos para el evento.
 *  Fecha de creación: 28/07/2024
 *  Fecha de última modificación: 31/07/2024
 */

public class Usuario{

    private String nombre_usuario;
    private String email;
    private int cantidadBoletos;
    private float presupuestoMax;

    /**
     * Constructor de la clase Usuario.
     * @param nombre_usuario Nombre del comprador.
     * @param email Correo electrónico del comprador.
     * @param cantidadBoletos Cantidad de boletos que desea comprar el usuario.
     * @param presupuestoMax Presupuesto máximo que tiene el comprador para gastar.
     */

    public Usuario(String nombre_usuario, String email, int cantidadBoletos, float presupuestoMax){
        this.nombre_usuario = nombre_usuario;
        this.email = email;
        this.cantidadBoletos = cantidadBoletos;
        this.presupuestoMax = presupuestoMax;
    }

    /**
     * Obtiene el nombre del usuario.
     * @return nombre del usuario.
     */
    public String getNombreUsuario() {
        return nombre_usuario;
    }

    /**
     * Establece el nombre del usuario.
     * @param nombre_usuario Nombre del usuario.
     */
    public void setNombreUsuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     * @return Correo electrónico del usuario.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electrónico del usuario.
     * @param email Correo electrónico del usuario.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene la cantidad de boletos que el usuario quiere comprar.
     * @return Cantidad de boletos que el usuario quiere comprar.
     */
    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    /**
     * Establece la cantidad de boletos que el usuario quiere comprar.
     * @param cantidadBoletos Cantidad de boletos que el usuario quiere comprar.
     */
    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }

    /**
     * Obtiene el presupuesto máximo que el usuario está dispuesto a pagar.
     * @return Presupuesto máximo que el usuario está dispuesto a pagar.
     */
    public float getPresupuestoMax() {
        return presupuestoMax;
    }

    /**
     * Establece el presupuesto máximo que el usuario está dispuesto a pagar.
     * @param presupuestoMax Presupuesto máximo que el usuario está dispuesto a pagar.
     */
    public void setPresupuestoMax(float presupuestoMax) {
        this.presupuestoMax = presupuestoMax;
    }


}