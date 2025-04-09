
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<vehiculo> lstvehiculos = new ArrayList<>();
        int opcion, opcion1;
        do {

            System.out.println("""
                    BIENVENIDO AL CONCESIONARIO
                    ¿Que desea realizar?
                    1.Agregar un vehiculo
                    2.Calcular precio final
                    3.Mostrar listado de vehiculos
                    4.Salir""");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("""
                            Que tipo de vehiculo quiere registrar
                            1.Automovil
                            2.Moto
                            """);
                    opcion1 = teclado.nextInt();
                    switch (opcion1) {
                        case 1 -> {
                            String marca, modelo;
                            int año, placa, preciobase = 0, numeropuertas;
                            System.out.println("REGISTRO AUTOMOVIL");
                            teclado.nextLine();
                            System.out.println("Ingrese la marca del automovil");
                            marca = teclado.nextLine();
                            teclado.nextLine();
                            System.out.println("Ingrese el modelo del automovil");
                            modelo = teclado.nextLine();
                            System.out.println("Ingrese el año del automovil");
                            año = teclado.nextInt();
                            System.out.println("Ingrese el precio base del automovil");
                            preciobase = teclado.nextInt();
                            System.out.println("Ingrese el numero de puertas del automovil");
                            numeropuertas = teclado.nextInt();
                            System.out.println("Ingrese la placa del automovil");
                            placa = teclado.nextInt();
                            lstvehiculos.add(new auto(marca, modelo, año, preciobase, numeropuertas, placa));
                        }


                        case 2 -> {
                            String marca, modelo;
                            int año,placa, preciobase = 0, cilindraje;
                            System.out.println("REGISTRO MOTO");
                            teclado.nextLine();
                            System.out.println("Ingrese la marca de la moto");
                            marca = teclado.nextLine();
                            teclado.nextLine();
                            System.out.println("Ingrese el modelo de la moto");
                            modelo = teclado.nextLine();
                            System.out.println("Ingrese el año de la moto");
                            año = teclado.nextInt();
                            System.out.println("Ingrese el precio base de la moto");
                            preciobase = teclado.nextInt();
                            System.out.println("Ingrese el cilindraje de la moto");
                            cilindraje = teclado.nextInt();
                            System.out.println("Ingrese la placa del automovil");
                            placa = teclado.nextInt();
                            lstvehiculos.add(new moto(marca, modelo, año, preciobase, cilindraje, placa));
                        }


                    }
                }

                case 2 -> {
                    System.out.println("Ingrese la placa del vehículo para calcular su precio final: ");
                    int placaBuscar = teclado.nextInt();
                    boolean encontrado = false;

                    for (vehiculo v : lstvehiculos) {
                        if (v.getPlaca() == placaBuscar) {
                            if (v instanceof auto a) {
                                System.out.println("Precio final del automóvil: $" + a.calcularpreciofinal());
                            } else if (v instanceof moto m) {
                                System.out.println("Precio final de la moto: $" + m.calcularpreciofinal());
                            }
                        }
                    }
                }
                case 3 -> {
                    System.out.println("LISTADO DE VEHÍCULOS:");

                    for (vehiculo v : lstvehiculos) {
                        System.out.println(v);
                    }
                }
            }

        }while(opcion != 3);
    }

}


