/**
 *  @author José Manuel Sanchez Hernández - 24092
 *  @version 1.0
 *  Descripción: esta clase representa las cartas que se usan dentro del juego.
 *  Fecha de creación: 04/08/2024
 *  Fecha de última modificación: 07//08/2024
 */

public class Carta {
    private int numero;
    
    /**
     * Constructor de la clase Carta.
     * @param numero Número de la carta.
     */
    public Carta(int numero){
        this.numero = numero;
    }

    /**
     * Obtener el número de la carta.
     * @return Número de la carta.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Establecer el número de la carta.
     * @param numero Número de la carta.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
}