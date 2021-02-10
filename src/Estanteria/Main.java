package Estanteria;

public class Main {
    public static void main(String[] args) {
        Estanteria e = new Estanteria();
        Book l1 = new Book("El guardian entre el centeno", "J.D Sallinger", 8);
        Book l2 = new Book("El capitan Alatriste", "Arturo Pérez-Reverte", 9);

        e.afegirLlibre(l1);
        e.afegirLlibre(l2);

        System.out.println(e.VeureEstanteria());

        Book l3 = new Book("Don Quijote de la mancha", "Miguel de Cervantes", 10);
        Book l4 = new Book("It", "Stephen King", 6);
        Book l5 = new Book("Cienfuegos", "Alberto Vazquez-Figueroa", 7);

        e.afegirLlibre(l3);
        e.afegirLlibre(l4);
        e.afegirLlibre(l5);

        System.out.println(e.Top10());

        System.out.println(e.VeureEstanteria());

        e.eliminarPerTitol("Don Quijote de la mancha");

        System.out.println(e.VeureEstanteria());
    }
}
