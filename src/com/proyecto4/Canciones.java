package com.proyecto4;

// Definición de la clase Canciones
public class Canciones {

    // Declaración de variables de instancia para el nombre y el artista de la canción
    private String nombre;
    private String artista;

    // Constructor de la clase que recibe el nombre y el artista de la canción
    public Canciones(String nombre, String artista) {
        // Asignación de los parámetros recibidos a las variables de instancia
        this.nombre = nombre;
        this.artista = artista;
    }

    // Método para obtener el nombre de la canción
    public String getNombre() {
        // Retorna el nombre de la canción
        return nombre;
    }

    // Método para establecer el nombre de la canción
    public void setNombre(String nombre) {
        // Asigna el nombre de la canción a la variable de instancia
        this.nombre = nombre;
    }

    // Método para obtener el artista de la canción
    public String getArtista() {
        // Retorna el artista de la canción
        return artista;
    }

    // Método para establecer el artista de la canción
    public void setArtista(String artista) {
        // Asigna el artista de la canción a la variable de instancia
        this.artista = artista;
    }

    // Método toString para representar la información de la canción como una cadena
    @Override
    public String toString() {
        // Retorna una cadena que muestra el nombre y el artista de la canción
        return "Nombre de la canción: " + nombre + " | Artista: " + artista;
    }

}