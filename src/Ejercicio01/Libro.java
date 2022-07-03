//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
//Autor, Número de páginas, y un constructor con todos los atributos pasados por
//parámetro y un constructor vacío. Crear un método para cargar un libro y luego
//informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.
package Ejercicio01;

public class Libro {

    //Atributos
    public int ISBN;
    public String titulo;
    public String autor;
    public int Paginas;

    //Metodos: Setters y getters en este caso
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return Paginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public Libro() {
    }
}
