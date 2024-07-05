import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        List<Auto> autos = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        List<Alquiler> alquileres = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1. Agregar auto");
            System.out.println("2. Mostrar autos");
            System.out.println("3. Agregar cliente");
            System.out.println("4. Mostrar clientes");
            System.out.println("5. Agregar alquiler");
            System.out.println("6. Mostrar alquileres");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            //Creo un menu para que el usuario elija una opción
            switch (opcion) {
                case 1:
                    System.out.println("Agregar auto");
                    scanner.nextLine();
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Año: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Precio por dia: ");
                    double precioPorDia = scanner.nextDouble();
                    scanner.nextLine();
                    autos.add(new Auto(marca, modelo, anio, placa, precioPorDia));
                    break;
                case 2:
                    System.out.println("Mostrar autos");
                    for (Auto auto : autos) {
                        auto.mostrarAuto();
                        
                    }
                    break;
                case 3:
                    System.out.println("Agregar Cliente");
                    scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Documento: ");
                    String documento = scanner.nextLine();
                    for (int i = 0; i < clientes.size(); i++) {
                        if(clientes.get(i).getDocumento() == documento) {
                            System.out.println("El cliente ya existe.");
                            break;
                        }
                    }
                    clientes.add(new Cliente(nombre, documento));
                    break;
                case 4:
                    System.out.println("Mostrar clientes");
                    for (Cliente cliente : clientes) {
                        System.out.println(cliente.getNombre() + " - " + cliente.getDocumento());
                    }
                    break;
                case 5: 
                    System.out.println("agregar alquiler");
                    scanner.nextLine();
                    System.out.print("Placa: ");
                    String placaAuto = scanner.nextLine();
                    System.out.print("Documento: ");
                    String documentoCliente = scanner.nextLine();
                    System.out.print("Fecha inicio: ");
                    String fechaInicio = scanner.nextLine();
                    System.out.print("Fecha fin: ");
                    String fechaFin = scanner.nextLine();
                    alquileres.add(new Alquiler(placaAuto, documentoCliente, fechaInicio, fechaFin));
                    break;
                case 6:
                    System.out.println("Mostrar alquileres");
                    for (Alquiler alquiler : alquileres) {
                        System.out.println("Patente auto: "+ alquiler.getPlacaAuto());
                        System.out.println( "DNI Cliente: " + alquiler.getDocumentoCliente());
                        System.out.println( "Fecha inicio: " + alquiler.getFechaInicio());
                        System.out.println( "Fecha fin: " + alquiler.getFechaFin());
                    }
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
