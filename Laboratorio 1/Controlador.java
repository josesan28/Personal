/**
 *  @author José Manuel Sanchez Hernández - 24092
 *  @version 1.0
 *  Descripción: esta clase es utilizada para tener el control del funcionamiento del programa.
 *  Fecha de creación: 04/08/2024
 *  Fecha de última modificación: 07//08/2024
 */


import java.util.ArrayList;
import java.util.Random;

public class Controlador {
    private Usuario usuario;
    private Dealer dealer;
    private Vista vista;
    private Random random; 
    
    /**
     * Constructor de la clase Controlador.
     * @param usuario Instancia de la clase usuario.
     * @param dealer Instancia de la clase dealer.
     * @param vista Instancia de la clase vista.
     */
    public Controlador(Usuario usuario, Dealer dealer, Vista vista){
        this.usuario = usuario;
        this.dealer = dealer;
        this.vista = vista;
        this.random = new Random();
    }

    /**
     * Clase para iniciar y tener el control de las partidas.
     */
    public void empezarJuego() {
        //Iniciar partida.
        vista.bienvenida();
        usuario.setNombre(vista.obtenerNombreJugador());
        
        //Preparar partida.
        boolean jugarOtra = true;
        while (jugarOtra == true) {
            reiniciarManos();
            repartirCartas();

            boolean continuar = true;
            while (continuar) {
                //Mostrar cartas.
                vista.verCartasUsuario(usuario);
                vista.verCartasDealer(dealer);
                //Verificar si el usuario quiere otra carta.
                if (vista.pedirCarta() == 1)
                {
                    //Dar cartas tanto al usuario como al Dealer.
                    darCartaUsuario(usuario);
                    darCartaDealer(dealer);
                    //Verificar que ni la suma del usuario como la del dealer sean igual o mayores que 21.
                    if (usuario.getSumaMano() >= 21 || dealer.getSumaMano() >= 21) {
                        continuar = false;
                    }
                }
                else {
                    continuar = false;
                }
            }
            //Determinar y mostrar resultados.
            String resultado = determinarGanador();
            vista.verResultados(resultado, usuario, dealer);
            jugarOtra = vista.jugarOtra();

        }

    }

    /**
     * Reiniciar las manos y las sumas de las cartas del usuario y el dealer para empezar una partida.
     */
    public void reiniciarManos() {
        usuario.setMazo(new ArrayList<>());
        usuario.setSumaMano(0);
        dealer.setMazo(new ArrayList<>());
        dealer.setSumaMano(0);
    }

    /**
     * Dar cartas al usuario.
     * @param usuario Usuario de la partida.
     */
    public void darCartaUsuario(Usuario usuario) {
        int numeroCartaUsuario = random.nextInt(10) + 1;
        Carta cartaNueva = new Carta(numeroCartaUsuario);
        usuario.getMazo().add(cartaNueva);
        usuario.setSumaMano(usuario.getSumaMano() + numeroCartaUsuario);
    }

    /**
     * Dar cartas al dealer.
     * @param dealer Dealer de la partida.
     */
    public void darCartaDealer(Dealer dealer) {
        int numeroCartaDealer = random.nextInt(10) + 1;
        Carta cartaNueva = new Carta(numeroCartaDealer);
        dealer.getMazo().add(cartaNueva);
        dealer.setSumaMano(dealer.getSumaMano() + numeroCartaDealer);
    }

    /**
     * Repartir cartas al usuario y dealer.
     */
    public void repartirCartas(){
        darCartaUsuario(usuario);
        darCartaUsuario(usuario);
        darCartaDealer(dealer);
        darCartaDealer(dealer);
    }

    /**
     * Determinar quién ganó la partida y sumar el resultado a las estadísticas del jugador.
     * @return Resultado de la partida con las estadísticas.
     */
    public String determinarGanador() {
        int sumaUsuario = usuario.getSumaMano();
        int sumaDealer = dealer.getSumaMano();

        if(sumaDealer > 21 && sumaUsuario > 21){
            usuario.setEmpates(usuario.getEmpates() + 1);
            return "Ambos se pasaron de 21, empate.\nSuma del dealer: " + sumaDealer + "\nSuma de " + usuario.getNombre() + ": " + sumaUsuario;
        }


        else if(sumaUsuario == 21){
            usuario.setGanadas(usuario.getGanadas() + 1);
            return usuario.getNombre() + " ha ganado con 21.\nSuma del usuario: " + sumaUsuario + "\nSuma del dealer: " + sumaDealer;
        }

        else if(sumaDealer == 21){
            usuario.setPerdidas(usuario.getPerdidas() + 1);
            return "El dealer ha ganado con 21.\nSuma del dealer: " + sumaDealer + "\nSuma de " + usuario.getNombre() + ": " + sumaUsuario;
        }

        else if(sumaUsuario > 21){
            usuario.setPerdidas(usuario.getPerdidas() + 1);
            return "El dealer ha ganado.\nSuma del dealer: " + sumaDealer + "\nSuma de " + usuario.getNombre() + ":" + sumaUsuario;
        }
        else if (sumaDealer > 21){
            usuario.setGanadas(usuario.getGanadas() + 1);
            return usuario.getNombre() + " ha ganado.\nSuma total de " + usuario.getNombre() + ": " + sumaUsuario + "\nSuma del dealer: " + sumaDealer;
        }
        else if (sumaUsuario > sumaDealer){
            usuario.setGanadas(usuario.getGanadas() + 1);
            return usuario.getNombre() + " ha ganado.\nSuma total de " + usuario.getNombre() + ": " + sumaUsuario + "\nSuma del dealer: " + sumaDealer;
        }
        else if (sumaDealer > sumaUsuario){
            usuario.setPerdidas(usuario.getPerdidas() + 1);
            return "El dealer ha ganado.\nSuma total del dealer: " + sumaDealer + "\nSuma de " + usuario.getNombre() + ": " + sumaUsuario;
        }

        else {
            usuario.setEmpates(usuario.getEmpates() + 1);
            return "Empate. \nSuma de " + usuario.getNombre() + ": " + sumaUsuario + "\nSuma del dealer: " + sumaDealer;
        }
    }

}