/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

//        clase 2: ejercicio 1

        //Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, 
        //y un constructor con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para 
        //cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, 
        //el título, el autor del libro y el numero de páginas.

public class Libro {
    
    //declaración de atributos de la clase
    public int ISBN = (int) (Math.random()*(1000));
    public String titulo;
    public String autor;
    public int numPag;

    //constructor vacio
    public Libro() {
    }
    
    //constructor con todos los atributos pasados por parametro
    public Libro(int ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
    
    //metodo set para ingresar el dato que va a pasar el usuario en el main
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    
    //metodo get para poder tomar el valor del atributo y mostrarlo (imprimirlo)

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPag() {
        return numPag;
    }
    
    //metodo to string para mostrar el objeto y los valores actuales
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + '}';
    }
    
    
}
