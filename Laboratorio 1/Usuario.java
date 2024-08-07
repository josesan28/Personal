/**
 *  @author José Manuel Sanchez Hernández - 24092
 *  @version 1.0
 *  Descripción: esta clase representa el usuario del juego.
 *  Fecha de creación: 04/08/2024
 *  Fecha de última modificación: 07//08/2024
 */


import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Carta> mazo;
    private int sumaMano;
    private int ganadas;
    private int perdidas;
    private int empates;

    /**
     * Constructor de la clase Usuario.
     * @param nombre Nombre del usuario ingresado por él mismo.
     */
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.mazo = new ArrayList<>();
    }

    /**
     * Obtener el nombre del usuario.
     * @return Nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establecer el nombre del usuario.
     * @param nombre Nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtener las cartas que tiene el usuario en la mano.
     * @return Cartas que tiene el usuario en la mano.
     */
    public List<Carta> getMazo() {
        return mazo;
    }

    /**
     * Establecer las cartas que tiene el usuario en la mano.
     * @param mazo Cartas que tiene el usuario en la mano.
     */
    public void setMazo(List<Carta> mazo) {
        this.mazo = mazo;
    }

    /**
     * Obtener la suma de los valores de las cartas que tiene el usuario.
     * @return Suma de los valores de las cartas que tiene el usuario.
     */
    public int getSumaMano() {
        return sumaMano;
    }

    /**
     * Establecer la suma de los valores de las cartas que tiene el usuario.
     * @param sumaMano Suma de los valores de las cartas que tiene el usuario.
     */
    public void setSumaMano(int sumaMano) {
        this.sumaMano = sumaMano;
    }

    /**
     * Obtener las partidas ganadas por el usuario.
     * @return Partidas ganadas por el usuario.
     */
    public int getGanadas() {
        return ganadas;
    }

    /**
     * Establecer las partidas ganadas por el usuario.
     * @param ganadas Partidas ganadas por el usuario.
     */
    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }

    /**
     * Obtener las partidas perdidas del usuario.
     * @return Partidas perdidas del usuario.
     */
    public int getPerdidas() {
        return perdidas;
    }

    /**
     * Establecer partidas perdidas del usuario.
     * @param perdidas Partidas perdidas por el usuario.
     */
    public void setPerdidas(int perdidas) {
        this.perdidas = perdidas;
    }

    /**
     * Obtener las partidas empatadas del usuario.
     * @return Empates del usuario.
     */
    public int getEmpates() {
        return empates;
    }

    /**
     * Establecer las partidas empatadas del usuario.
     * @param empates Empates del usuario.
     */
    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
