package com.proyecto4;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

// Definición de la clase ListaDeCanciones
public class ListaDeCanciones {

    // Declaración de variables de instancia para la lista de canciones y el Scanner
    private LinkedList<Canciones> listaCanciones;
    private Scanner input;

    // Constructor de la clase que recibe un Scanner como argumento
    public ListaDeCanciones(Scanner input) {
        // Inicialización de la lista de canciones como una nueva LinkedList
        listaCanciones = new LinkedList<>();
        // Asignación del Scanner recibido a la variable de instancia
        this.input = input;
    }

    // Método para agregar canciones a la lista
    public void agregarCanciones() {
        // Solicita al usuario ingresar el nombre de la canción
        System.out.println("Ingrese el nombre de la canción");
        // Lee el nombre de la canción ingresado por el usuario
        String nombre = input.nextLine();
        // Solicita al usuario ingresar el nombre del artista
        System.out.println("Ingrese el nombre del artista");
        // Lee el nombre del artista ingresado por el usuario
        String artista = input.nextLine();
        // Crea un objeto Canciones con el nombre y el artista ingresados
        Canciones cancion = new Canciones(nombre, artista);
        // Agrega la canción a la lista de canciones
        listaCanciones.add(cancion);
        // Muestra un mensaje indicando que la canción se ha agregado a la playlist
        System.out.println("Se ha agregado la canción a la playlist");
    }

    // Método para eliminar canciones de la lista
    public void eliminarCanciones() {
        try {
            // Verifica si la lista de canciones está vacía
            if (listaCanciones.size() == 0) {
                // Muestra un mensaje indicando que la playlist está vacía
                System.out.println("La playlist está vacía");
            } else {
                // Solicita al usuario ingresar la posición de la canción que desea eliminar
                System.out.println("Ingrese la posición de la canción que desea eliminar");
                // Lee la posición ingresada por el usuario
                int posicion = input.nextInt();
                // Limpia el buffer del Scanner
                input.nextLine();
                // Verifica si la posición ingresada está dentro del rango de la lista de canciones
                if (posicion >= 0 && posicion < listaCanciones.size()) {
                    // Obtiene la canción en la posición especificada
                    Canciones cancion = listaCanciones.get(posicion);
                    // Elimina la canción de la lista de canciones
                    listaCanciones.remove(cancion);
                    // Muestra un mensaje indicando que la canción se ha eliminado correctamente
                    System.out.println("Se ha eliminado la canción correctamente");
                }
            }
        } catch (InputMismatchException e) {
            // Captura la excepción de tipo InputMismatchException (cuando se ingresa un tipo de dato incorrecto)
            // Muestra un mensaje de error indicando que se debe ingresar nuevamente la posición de la canción
            System.out.println("Error, ingrese nuevamente la posición de la canción que desea eliminar");
            // Limpia el buffer del Scanner
            input.next();
        }
    }

    // Método para mostrar la playlist de canciones
    public void verPlaylist() {
        // Verifica si la lista de canciones está vacía
        if (listaCanciones.size() == 0) {
            // Muestra un mensaje indicando que la playlist está vacía
            System.out.println("La playlist está vacía");
        } else {
            // Itera sobre la lista de canciones
            for (int i = 0; i < listaCanciones.size(); i++) {
                // Muestra el índice y la información de cada canción en la playlist
                System.out.println(i + ". " + listaCanciones.get(i).toString());
            }
        }
    }

    // Método para buscar canciones por el nombre del artista
    public void buscarArtista() {
        // Verifica si la lista de canciones está vacía
        if (listaCanciones.size() == 0) {
            // Muestra un mensaje indicando que la playlist está vacía
            System.out.println("La playlist está vacía");
        } else {
            // Solicita al usuario ingresar el nombre del artista a buscar
            System.out.println("Ingrese el nombre del artista que desea buscar");
            // Lee el nombre del artista ingresado por el usuario
            String artista = input.nextLine();
            // Itera sobre la lista de canciones
            for (int i = 0; i < listaCanciones.size(); i++) {
                // Verifica si el artista de la canción en la posición actual coincide con el nombre ingresado
                if (listaCanciones.get(i).getArtista().equalsIgnoreCase(artista)) {
                    // Muestra el nombre y el artista de la canción que coincide con la búsqueda
                    System.out.println("Nombre: " + listaCanciones.get(i).getNombre() + " | " + listaCanciones.get(i).getArtista());
                }
            }
        }
    }
}