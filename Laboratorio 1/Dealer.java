/**
 *  @author José Manuel Sanchez Hernández - 24092
 *  @version 1.0
 *  Descripción: esta clase representa al dealer del juego.
 *  Fecha de creación: 04/08/2024
 *  Fecha de última modificación: 07//08/2024
 */


import java.util.List;
import java.util.ArrayList;

public class Dealer {
    private List<Carta> mazo;
    private int sumaMano;

    /**
     * Constructor de la clase Dealer
     */
    public Dealer(){
        this.mazo = new ArrayList<>();
    }

    /**
     * Obtener la lista de las cartas que tiene en la mano el dealer.
     * @return Cartas que tiene en la mano el dealer.
     */
    public List<Carta> getMazo() {
        return mazo;
    }

    /**
     * Establecer los números de las cartas del mazo del dealer.
     * @param mazo Cartas que tiene en la mano el dealer.
     */
    public void setMazo(List<Carta> mazo) {
        this.mazo = mazo;
    }

    /**
     * Obtener la suma de los valores de las cartas del dealer.
     * @return Suma de los valores de las cartas del dealer.
     */
    public int getSumaMano() {
        return sumaMano;
    }

    /**
     * Establecer el valor de la suma de los valores de las cartas del dealer.
     * @param sumaMano
     */
    public void setSumaMano(int sumaMano) {
        this.sumaMano = sumaMano;
    }   
}
