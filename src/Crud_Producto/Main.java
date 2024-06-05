package Crud_Producto;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Producto> productos = new ArrayList<Producto>();

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu De Producto: ");
            System.out.println("1. CRUD Producto");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    crudProducto(scanner);
                    break;
                    case 2:
                        System.out.println("Saliendo Del Programa: ");
                        break;
                default:
                    System.out.println("Opcion no valida. Por favor, intente nuevamente. ");
            }
        } while (option != 2);
    }

    private static void crudProducto(Scanner scanner) {
        int option;
        do {
            System.out.println("Crud Producto Menu De Opciones");
            System.out.println("1. Crear Producto");
            System.out.println("2. Eliminar Producto");
            System.out.println("3. Modificar Producto");
            System.out.println("4. Listar Productos");
            System.out.println("5. Salir");
            System.out.println("Seleccione Una Opcion");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    crearProducto(scanner);
                    break;
                    case 2:
                        eliminarProducto(scanner);
                        break;
                        case 3:
                            modificarProducto(scanner);
                            break;
                            case 4:
                                listarProductos();
                                break;
                                case 5:
                                    System.out.println("Saliendo Del Programa: ");
                                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, intente nuevamente. ");
            }
        } while (option != 5);
    }

    private static void crearProducto(Scanner scanner) {
        System.out.println("Ingrese el nombre del Producto: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese descripcion del Producto: ");
        String descripcion = scanner.nextLine();
        System.out.println("Ingrese Id del Producto: ");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese la Cantidad del Producto: ");
        String cantidad = scanner.nextLine();

        for (Producto producto : productos) {
            if (producto.getIdProducto().equals(codigo)) {
                System.out.println("El producto con el Id " + codigo + " ya existe. No se puede crear el producto.");
                return;
            }
        }

        Producto producto = new Producto(nombre, descripcion, codigo, cantidad);
        productos.add(producto);
        System.out.println("Producto creado Exitosamente. ");
    }

    private static void eliminarProducto(Scanner scanner) {
        System.out.println("Ingrese el Id del Producto que desea eliminar: ");
        String codigo = scanner.nextLine();
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getDescripcion().equals(codigo)) {
                iterator.remove();
                System.out.println("Producto eliminado Exitosamente. ");
                return;
            }
        }
        System.out.println("El Producto no se encuentra eliminado. ");
    }

    private static void modificarProducto(Scanner scanner) {
        System.out.println("Ingrese el id del Producto que desea modificar: ");
        String codigo = scanner.nextLine();
        for (Producto producto : productos) {
            if (producto.getDescripcion().equals(codigo)) {
                System.out.println("Ingrese nuevo nombre del Producto(Actual: " + producto.getNombre() + "): ");
                producto.setNombre(scanner.nextLine());
                System.out.println("Ingrese nuevo Descripcion del Producto(Actual:" + producto.getIdProducto() + "): ");
                producto.setIdProducto(scanner.nextLine());
                System.out.println("Ingrese nuevo id del Producto(Actual:" + producto.getDescripcion() + "): ");
                producto.setDescripcion(scanner.nextLine());
                System.out.println("Ingrese nueva Cantidad del Producto(Actual:" + producto.getCantidad() + "): ");
                producto.setCantidad(scanner.nextLine());
                System.out.println("Producto Modificado Exitosamente. ");
                return;
            }
        }
    }

    private static void listarProductos() {
        System.out.println("Listado de Productos del Programa: ");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}

