
package ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Diccionario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String palabra;
		System.out.print("Introduzca una palabra: ");
		palabra = sc.nextLine();

		Map<String, String> map = new HashMap<>();
		map.put("manzana", "apple");
		map.put("gato", "cat");
		map.put("verde", "green");
		map.put("rojo", "red");
		map.put("amor", "love");
		map.put("cerveza", "beer");
		map.put("computadora", "computer");
		map.put("dedo", "finger");
		map.put("queso", "cheese");
		map.put("perro", "dog");
		map.put("carro", "car");
		map.put("audifonos", "headphones");
		map.put("caminar", "walk");
		map.put("naranja", "orange");
		map.put("azul", "blue");
		map.put("desarrollador", "developer");
		map.put("ingeniero", "engineer");
		map.put("famoso", "famous");
		map.put("punto", "point");
		map.put("hambre", "hungry");

		if (map.containsKey(palabra)) {
			System.out.println("la traduccion de " + palabra + " al ingles es: ");
			System.out.println(map.get(palabra));

		} else {
			System.out.print("La palabra no se encuentra en el diccionario");
		}
	}
}
