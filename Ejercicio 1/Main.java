import java.util.Scanner;
import java.util.Date;

/**
 * @author José Manuel Sanchez Hernández - 24092
 * @version 1.0
 * Descripción: este programa está hecho para llevar el control de la compra de boletos de La Academia, en él se pueden comprar boletos, ver la disponibilidad de las localidades y las ganancias que ha generado el programa.
 * Créditos:
 * Oracle Help Center
 * W3Schools
 * Fecha de creación: 28/07/2024
 * Fecha de última modificación: 31/07/2024
 */

public class Main {
    public static void main(String[] args) {
        //Instanciar los objetos necesarios.
        Evento evento = new Evento("La Academia", "Guatemala", 0, 9000, 6, new Date());
        Localidad balcon2 = new Localidad("Balcón 2", 3000, 300);
        Localidad platea = new Localidad("Platea", 3000, 600);
        Localidad VIP = new Localidad("VIP", 3000, 1800);

        //Scanner para ingreso de datos por el usuario.
        Scanner scanner = new Scanner(System.in);

        //Variable para salir.
        boolean salir = false;

        //Menú principal.
        while (!salir){
            System.out.println("Bienvenido/a a la compra de tickets de La Academia\n");
            System.out.println("1. Comprar boletos\n2. Consultar disponibilidad total del evento\n3. Consultar disponibilidad por localidad\n4. Reporte de caja\n5. Salir\n");
            System.out.println("Elige una opción:");
            //Opción del menú.
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                //Compra de boletos.
                //Ingreso de datos del usuario.
                System.out.println("Ingresa tu nombre:");
                String nombre_usuario = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Ingresa tu email:");
                String email = scanner.nextLine();
                System.out.println("Ingresa la cantidad de boletos que deseas comprar:");
                int cantidadBoletos = scanner.nextInt();
                System.out.println("Ingresa tu presupuesto máximo:");
                float presupuestoMax = scanner.nextFloat();
                //Instanciar objeto del usuario.
                Usuario usuario = new Usuario(nombre_usuario, email, cantidadBoletos, presupuestoMax);

                //Elección de la localidad en la cual quiere comprar los boletos.
                System.out.println("¿En qué localidad quieres comprar tus boletos?\n 1. Balcón 2 - Q300\n 2. Platea - Q600\n 3. VIP - Q1,800");
                int opcionLocalidad = scanner.nextInt();
                Localidad localidadElegida = null;

                switch (opcionLocalidad) {
                    case 1:
                    localidadElegida = balcon2;
                    break;

                    case 2:
                    localidadElegida = platea;
                    break;

                    case 3:
                    localidadElegida = VIP;
                    break;
                    
                    default:
                    System.out.println("Elige una opción válida.\n");
                    scanner.close();
                    return;
                }
                //Validar espacio de la localidad.
                int boletosDisponibles = localidadElegida.getCapacidadLocalidad();
                if (boletosDisponibles <= 0){
                    System.out.println("Ya no hay espacio en esta localidad\n");
            
                }
                else {
                    //Ver cuántos boletos se pueden vender.
                    int boletosAComprar = cantidadBoletos;
                    if (boletosAComprar > boletosDisponibles) {
                        boletosAComprar = boletosDisponibles;
                    }

                    
                    int precioTotal = localidadElegida.getPrecio()*boletosAComprar;
                    //Validar precio.
                    if (presupuestoMax >= precioTotal){
                        if (boletosAComprar <= evento.getMaximoEntradas()){
                            //Vender boletos.
                            localidadElegida.venderBoletosLocalidad(boletosAComprar);
                            evento.venderBoletoEvento(boletosAComprar, precioTotal);                                
                            System.out.println("Gracias por tu compra, has comprado " + cantidadBoletos + " boletos en la localidad " + localidadElegida.getTipo() + "\n");
                                //Crear boletos.
                                for (int i = 0; i < boletosAComprar; i++) {
                                    Boleto boleto = new Boleto("", localidadElegida.getTipo(), new Date());
                                    System.out.println("El número de su boleto es: " + boleto.getNumeroBoleto());
                                }
                            }
                    
                        else {
                                System.out.println("Solo se pueden comprar " + evento.getMaximoEntradas() + " entradas o menos en este evento\n");
                            }
                    }
                    else {
                            System.out.println("El precio de los boletos que quieres comprar es mayor a tu presupuesto, no se puede realizar la compra\n");
                        }
                }
                break;

                case 2:
                //Ver disponibilidad de boletos en general.
                System.out.println("Boletos Vendidos:\n");
                System.out.println("Balcón 2: " + balcon2.getBoletosVendidos());
                System.out.println("Platea: " + platea.getBoletosVendidos());
                System.out.println("VIP: " + VIP.getBoletosVendidos());
                System.out.println("Total: " + (balcon2.getBoletosVendidos() + platea.getBoletosVendidos() + VIP.getBoletosVendidos()) + "\n");
                System.out.println("Boletos disponibles:\n");
                System.out.println("Balcón 2: " + balcon2.getCapacidadLocalidad());
                System.out.println("Platea: " + platea.getCapacidadLocalidad());
                System.out.println("VIP: " + VIP.getCapacidadLocalidad());
                System.out.println("Total: " + evento.getCapacidadTotal());
                break;

                case 3:
                //Ver disponibilidad según la localidad elegida por el usuario.
                System.out.println("Disponibilidad de localidades:\n1. Balcón 2\n2. Platea\n3. VIP\nElige una localidad:");
                int opcionDisponibilidad = scanner.nextInt();

                switch (opcionDisponibilidad){
                    case 1:
                    System.out.println("Disponibilidad en Balcón 2: " + balcon2.getCapacidadLocalidad() + "\n");
                    break;

                    case 2:
                    System.out.println("Disponibilidad en Platea: " +platea.getCapacidadLocalidad() + "\n");
                    break;

                    case 3:
                    System.out.println("Disponibilidad en VIP: " + VIP.getCapacidadLocalidad() + "\n");
                    break;

                    default:
                    System.out.println("Opción no válida");
                }
                
                break;

                case 4:
                //Ver el reporte de caja.
                System.out.println("Reporte de caja\n");
                System.out.println("Balcón 2: " + balcon2.getGanancias());
                System.out.println("Platea: " + platea.getGanancias());
                System.out.println("VIP: " + VIP.getGanancias());
                System.out.println("Total: " + evento.getGanancia() + "\n");
                break;

                case 5:
                //Opción de salir.
                salir = true;
                break;

                default:
                System.out.println("Ingresa una opción válida\n");

        }
        
    }

    }
    
}