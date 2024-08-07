/**
 * @author José Manuel Sanchez Hernández - 24092
 * @version 1.0
 * Descripción: este programa está hecho para simular una variante de blackjack. Varían algunas reglas y es un juego para un jugador.
 * Créditos:
 * W3Schools
 * IONOS
 * Códigos de Programación - MR
 * Fecha de creación: 04/08/2024
 * Fecha de última modificación: 07/08/2024
 */

public class Main {
    public static void main(String[] args) {
        //Instanciar los objetos necesarios.
        Vista vista = new Vista();
        Usuario usuario = new Usuario("");
        Dealer dealer = new Dealer();
        Controlador controlador = new Controlador(usuario, dealer, vista);
        controlador.empezarJuego();

    }
    
}