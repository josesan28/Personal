/**
 *  @author José Manuel Sanchez Hernández - 24092
 *  @version 1.0
 *  Descripción: esta clase es utilizada para tener control de la interacción con el usuario.
 *  Fecha de creación: 04/08/2024
 *  Fecha de última modificación: 07//08/2024
 */


import java.util.Scanner;
import java.util.List;

public class Vista {
    private Scanner scanner;
    
    /**
     * Constructor de la clase Vista.
     */
    public Vista() {
        scanner = new Scanner(System.in);
    }

    /**
     * Dar una bienvenida al usuario.
     */
    public void bienvenida() {
        System.out.println("-- Blackjack --\n Bienvenido a Blackjack, para iniciar ingrese su nombre");
    }

    /**
     * Recibir el nombre del jugador o jugadora escrito por él/ella mismo/a. 
     * @return Nombre del usuario.
     */
    public String obtenerNombreJugador() {
        System.out.println("Ingrese su nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        return nombreUsuario;
    }

    /**
     * Preguntar al usuario si quiere otra carta.
     * @return Respuesta del usuario sobre si quiere otra carta.
     */
    public int pedirCarta() {
        System.out.println("¿Desea otra carta?\n1. Sí\n2. No");
        int respuesta = scanner.nextInt();
        return respuesta;
    }

    /**
     * Ver las cartas y la suma de estas del usuario.
     * @param usuario Usuario de la partida.
     */
    public void verCartasUsuario(Usuario usuario) {
        System.out.println("Cartas de " + usuario.getNombre() + ": " + verMazo(usuario.getMazo()) + "\nSuma: " + usuario.getSumaMano());
    }

    /**
     * Ver las cartas y la suma de estas del dealer.
     * @param dealer Dealer de la partida.
     */
    public void verCartasDealer(Dealer dealer) {
        System.out.println("Cartas del Dealer: " + verMazo(dealer.getMazo()) + "\nSuma: " + dealer.getSumaMano());
    }

    /**
     * Ver los resultados y las estadísticas del jugador.
     * @param resultado Resultado de la partida recién jugada.
     * @param usuario Usuario de la partida.
     * @param dealer Dealer de la partida.
     */
    public void verResultados(String resultado, Usuario usuario, Dealer dealer) {
        System.out.println("Resultado: " + resultado);
        System.out.println("Estadísticas de " + usuario.getNombre() + "\nGanadas: " + usuario.getGanadas() + "\nPerdidas: " + usuario.getPerdidas() + "\nEmpates: " + usuario.getEmpates());
    }

    /**
     * Ver la lista de las cartas que tiene el usuario o dealer en la mano.
     * @param mazo Cartas en la mano del usuario o dealer.
     * @return Listado de las cartas de la mano del usuario o el dealer.
     */
    public String verMazo(List<Carta> mazo){
        String cartas = "";
        for (int i = 0; i < mazo.size(); i++){
            cartas += mazo.get(i).getNumero();
            if (i < mazo.size() - 1){
                cartas += ", ";
            }
        }
        return cartas;
    }

    /**
     * Preguntar al usuario si quiere jugar otra partida y recibir la respuesta a esta pregunta.
     * @return Respuesta del usuario a la pregunta de si quiere jugar otra partida o no.
     */
    public boolean jugarOtra() {
        System.out.println("¿Quiere jugar otra partida? \n1. Sí \n2. No");
        int respuesta = scanner.nextInt();
        if (respuesta == 1){
            return true;
        }
        else {
            return false;
        }
    }
}
