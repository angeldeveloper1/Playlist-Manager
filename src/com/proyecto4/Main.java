package com.proyecto4;

import java.util.Scanner;

// Clase Main que contiene el método principal
public class Main {

    // Método principal que inicia la aplicación
    public static void main(String[] args) {

        // Creación de un objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        // Creación de un objeto ListaDeCanciones para manejar la lista de canciones
        ListaDeCanciones listaCanciones = new ListaDeCanciones(input);

        // Variable booleana para controlar la ejecución del bucle
        boolean condicion = true;
        // Bucle para mostrar el menú y procesar las opciones del usuario
        while (condicion) {
            // Muestra el menú de opciones
            System.out.println("Playlist");
            System.out.println("1. Agregar Canciones");
            System.out.println("2. Eliminar Canciones");
            System.out.println("3. Ver Playlist");
            System.out.println("4. Buscar Artistas");
            System.out.println("5. Salir");

            // Verifica si la entrada del usuario es un número entero
            if (input.hasNextInt()) {
                // Lee la opción ingresada por el usuario
                int opcion = input.nextInt();
                input.nextLine(); // Limpia el buffer del Scanner

                // Verifica si la opción ingresada está dentro del rango válido
                if (opcion < 1 || opcion > 5) {
                    // Muestra un mensaje de error si la opción no está dentro del rango válido
                    System.out.println("Error, no ha ingresado un número dentro del rango correspondiente");
                }

                // Ejecuta la opción seleccionada por el usuario
                if (opcion == 1) {
                    listaCanciones.agregarCanciones();
                }
                if (opcion == 2) {
                    listaCanciones.eliminarCanciones();
                }
                if (opcion == 3) {
                    listaCanciones.verPlaylist();
                }
                if (opcion == 4) {
                    listaCanciones.buscarArtista();
                }
                if (opcion == 5) {
                    // Muestra un mensaje de despedida y finaliza el bucle
                    System.out.println("¡Hasta luego!");
                    condicion = false;
                }
            } else {
                // Muestra un mensaje de error si la entrada del usuario no es un número entero
                System.out.println("Error, ingrese nuevamente con un número entero");
                input.next(); // Limpia el buffer del Scanner
            }
        }
        // Cierra el objeto Scanner
        input.close();
    }
}