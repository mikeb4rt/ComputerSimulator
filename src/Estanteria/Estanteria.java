package Estanteria;

import java.util.Collections;
import java.util.ArrayList;

public class Estanteria {
    ArrayList<Book> estante = new ArrayList<Book>();

    public Estanteria(){
        initEstante();
    }

    private void initEstante(){
        for (int i = 0; i < 11; i++) {
            estante.add(null);
        }
    }
    public void afegirLlibre(Book book){
        boolean bucle = false;
        int i= 0;
        while(!bucle){
            if (estante.get(i) == null){
                estante.set(i,book);
                bucle = true;
            }
            i++;
        }
    }

    public void eliminarPerAutor1(String autor){
        estante.removeIf(value ->value != null && value.getAuthor().equals(autor));
    }

    public void eliminarPerAutor(String autor){
        for (int i = 0; i < estante.size(); i++) {
            if (estante.get(i) != null && estante.get(i).getAuthor().equals(autor)) {
                estante.set(i,null);
            }
        }
    }
    public void eliminarPerTitol(String title){
        for (int i = 0; i < estante.size(); i++) {
            if (estante.get(i) != null && estante.get(i).getTitle().equals(title)) {
                estante.set(i,null);
            }
        }
    }

    public void eliminarPerTitol1(String titol){
        estante.removeIf(value -> value != null && value.getTitle().equals(titol));
    }

    public StringBuilder Top10() {
        int counter = 1;
        StringBuilder top10 = new StringBuilder();
        for(int i=estante.size(); i>-1; i--){
            for (Book value : estante) {
                if (value != null) {
                    if (value.getCalification() == i) {
                        top10.append(counter).append(" ").append(value.getTitle()).append("\n");
                        counter++;
                    }
                }
            }
        }
        return top10;
    }
    public StringBuilder VeureEstanteria(){
        StringBuilder libros = new StringBuilder();
        for (Book book : estante) {
            if (book != null) {
                libros.append(book.getTitle()).append(("| "));
            }
        }
        return libros;
    }
}
