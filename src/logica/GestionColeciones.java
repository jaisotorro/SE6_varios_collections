package logica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GestionColeciones {

	List<String> listNombres;
	Set<String> conjProductos;
	Map<Integer,String> mapTareas;
	
	public void crearColeccion(String tipoCol) {
		switch (tipoCol){
		case "L":
			listNombres = new ArrayList<>();
			break;
		case "S":
			conjProductos = new HashSet<>();
			break;
		case "M":
			mapTareas = new HashMap<>();
		}
	}
	public void agregarNombre(String nombre) {
		listNombres.add(nombre);
	}
	public void agregarProducto(String producto) {
		conjProductos.add(producto);
	}
	public void agregarTarea(int cod, String desc) {
		mapTareas.put(cod, desc);
	}
	public void eliminarNombre(int indice) {
		listNombres.remove(indice-1);
	}
	public void eliminarProducto(String producto) {
		Collection<String> col = conjProductos;
		col.remove(producto);
	}
	public void eliminarTarea(int clave) {
		mapTareas.remove(clave);
	}
	public void modificarNombre(int indice, String nombre) {
		listNombres.set(indice-1, nombre);
	}
	public void modificarProducto(String productoOrig, String productoNuevo) {
		eliminarProducto(productoOrig);
		agregarProducto(productoNuevo);
	}
	public void modificarTarea(int clave, String nuevaDesc) {
		mapTareas.put(clave, nuevaDesc);
	}
	public void mostrarElementos(String tipoCol) {
		
		switch (tipoCol){
		case "L":
			System.out.println("LISTADO NOMBRES (list)");
			
			for (String n:listNombres) {
				System.out.println(listNombres.indexOf(n)+1+"-"+n);
			}
			break;
		case "S":
			Collection<String> col = conjProductos;
			System.out.println("LISTADO PRODUCTOS (set)");
			for (String p:col) {
				System.out.println(p);
			}
			break;
		case "MD":
			System.out.println("LISTADO TAREAS (map)");
			for (String t:mapTareas.values()) {
				System.out.println(t);
			}
			break;
		case "MC":
			System.out.println("LISTADO TAREAS (map)");
			for (Entry<Integer,String> t:mapTareas.entrySet())
				System.out.println(t.getKey()+"-"+t.getValue());
		}
	}
	
}
