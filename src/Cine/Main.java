package Cine;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long startime=System.nanoTime();
        Film film1 = new Film("La milla verde", 16, "Frank Darabont", 330);
        Cinema cinesa = new Cinema("Cars", (float) 8.72, film1);
        System.out.println();
        cinesa.sit2();
        System.out.println();
        long stoptime = System.nanoTime();
        System.out.println("Tiempo de ejecucion: " + (double)((stoptime-startime) * 1000000)+"ms");
    }
}
