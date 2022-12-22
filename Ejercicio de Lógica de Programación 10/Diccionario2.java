package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class Diccionario2 {

	public static void main(String[] args) {
		System.out.println("escribe en su respectivo orden la traduccion al ingles de las siguientes palabras: ");
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

		Scanner sc = new Scanner(System.in);

		int contador = 0;
		for (int i = 0; i < 5; i++) {

			List<String> valuesList = new ArrayList<String>(map.keySet());
			int randomIndex = new Random().nextInt(valuesList.size());
			String randomValue = valuesList.get(randomIndex);
			System.out.print("Escribe la traduccion de '" + randomValue + "' - ");
			String palabra = sc.nextLine();

			if (map.get(randomValue).equals(palabra)) {
				map.remove(randomValue);
				contador++;
			}

		}

		System.out.println("Tuviste " + contador + " aciertos y " + (5 - contador) + " errores");

	}

}
