package vista;

import java.util.Scanner;

import logica.GestionColeciones;

public class Menu {

	public static void main(String[] args) {
		try {
			String nombre,producto,nuevoProducto,descTarea;
			int codTarea, indNombre;
			Scanner sc = new Scanner(System.in);
			GestionColeciones gesCol = new GestionColeciones();
			int opcion=0;
			do {
				System.out.println("Selecciona una opción:");
				System.out.println("NOMBRES (list):");
				System.out.println("1 - Crear lista:");
				System.out.println("2 - Añadir un nuevo nombre:");
				System.out.println("3 - Eliminar un nombre");
				System.out.println("4 - Modificar un nombre");
				System.out.println("9 - Mostrar todos los nombres:");
				System.out.println("---");
				System.out.println("PRODUCTOS (set):");
				System.out.println("11 - Crear conjunto:");
				System.out.println("12 - Añadir un nuevo producto:");
				System.out.println("13 - Eliminar un producto");
				System.out.println("14 - Modificar un producto");
				System.out.println("19 - Mostrar todos los productos:");
				System.out.println("---");
				System.out.println("TAREAS (map):");
				System.out.println("21 - Crear mapa:");
				System.out.println("22 - Añadir una nueva tarea:");
				System.out.println("23 - Eliminar una tarea");
				System.out.println("24 - Modificar una tarea");
				System.out.println("28 - Mostrar todas las tareas (descripciones:");
				System.out.println("29 - Mostrar todas las tareas (códigos y descripciones:");
				System.out.println("---");
				System.out.println("99 - Salir:");
				try {
					opcion = Integer.parseInt(sc.nextLine()) ;
					switch(opcion) {
					case 1:
						gesCol.crearColeccion("L");
						System.out.println("Lista creada");
						System.out.println("-----");
						System.out.println("");
						break;
					case 2:
						System.out.println("Introduce nombre:");
						nombre = sc.nextLine();
						gesCol.agregarNombre(nombre);
						System.out.println("Nombre añadido");
						System.out.println("-----");
						System.out.println("");
						break;
					case 3:
						System.out.println("Introduce el indice del nombre a eliminar");
						indNombre = Integer.parseInt(sc.nextLine());
						gesCol.eliminarNombre(indNombre);
						System.out.println("Nombre eliminado");
						System.out.println("-----");
						System.out.println("");
						break;
					case 4:
						System.out.println("Introduce el indice del nombre a modificar");
						indNombre = Integer.parseInt(sc.nextLine());
						System.out.println("Introduce el nuevo nombre");
						nombre = sc.nextLine();
						gesCol.modificarNombre(indNombre, nombre);
						System.out.println("Nombre modificado");
						System.out.println("-----");
						System.out.println("");
						break;
					case 9:
						gesCol.mostrarElementos("L");
						System.out.println("-----");
						System.out.println("");
						break;
					case 11:
						gesCol.crearColeccion("S");
						System.out.println("Conjunto creado");
						System.out.println("-----");
						System.out.println("");
						break;
					case 12:
						System.out.println("Introduce producto:");
						producto = sc.nextLine();
						gesCol.agregarProducto(producto);
						System.out.println("Producto añadido");
						System.out.println("-----");
						System.out.println("");
						break;
					case 13:
						System.out.println("Introduce el producto a eliminar");
						producto = sc.nextLine();
						gesCol.eliminarProducto(producto);
						System.out.println("Producto eliminado");
						System.out.println("-----");
						System.out.println("");
						break;
					case 14:
						System.out.println("Introduce el producto a modificar");
						producto = sc.nextLine();
						System.out.println("Introduce el nuevo producto");
						nuevoProducto = sc.nextLine();
						gesCol.modificarProducto(producto, nuevoProducto);
						System.out.println("Nombre modificado");
						System.out.println("-----");
						System.out.println("");
						break;
					case 19:
						gesCol.mostrarElementos("S");
						System.out.println("-----");
						System.out.println("");
						break;
					case 21:
						gesCol.crearColeccion("M");
						System.out.println("Mapa creado");
						System.out.println("-----");
						System.out.println("");
						break;
					case 22:
						System.out.println("Introduce codigo de la tarea:");
						codTarea = Integer.parseInt(sc.nextLine());
						System.out.println("Introduce descripción de la tarea:");
						descTarea = sc.nextLine();
						gesCol.agregarTarea(codTarea,descTarea);
						System.out.println("Tarea añadida");
						System.out.println("-----");
						System.out.println("");
						break;
					case 23:
						System.out.println("Introduce el código de la tarea a eliminar");
						codTarea = Integer.parseInt(sc.nextLine());
						gesCol.eliminarTarea(codTarea);
						System.out.println("Tarea eliminada");
						System.out.println("-----");
						System.out.println("");
						break;
					case 24:
						System.out.println("Introduce el codigo de la tarea a modificar");
						codTarea = Integer.parseInt(sc.nextLine());
						System.out.println("Introduce la nueva descripción");
						descTarea = sc.nextLine();
						gesCol.modificarTarea(codTarea, descTarea);
						System.out.println("Tarea modificada");
						System.out.println("-----");
						System.out.println("");
						break;
					case 28:
						gesCol.mostrarElementos("MD");
						System.out.println("-----");
						System.out.println("");
						break;
					case 29:
						gesCol.mostrarElementos("MC");
						System.out.println("-----");
						System.out.println("");
						break;
					case 99:
						System.out.println("Hasta la próxima");
						break;
					default:
						System.out.println("Debe introducir una opción del menú");
						break;
					}
				} catch (NumberFormatException e) {
					System.out.println("Debe introducir una opción numérica");
				}
			} while (opcion != 99);
		} catch (Exception e) {
			System.out.println("Traza de errores:");
			e.printStackTrace();
		}
		
//		System.out.println("Lista de colecciones:");
//		gesPel.listaColecciones();
	}

}
