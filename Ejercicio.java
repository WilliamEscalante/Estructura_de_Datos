package Ejercicio;

public class Ejercicio {
    private int i;
    private int limite;



    public Ejercicio() {
        this.i = 1;
        this.limite = 10;
    }

    public void mostrarMensaje() {
        System.out.println("Hola mundo");
    }

    public void GenerarNumerosNatutalesFOR() {
        System.out.println("Generar numeros naturales (FOR)");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Numero: " + i);
        }
    }

    public void GenerarNumerosParesFOR() {
        System.out.println("Generar numeros pares (FOR)");
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.println(i + ", ");
        }
    }

    public void GenerarNaturalesWHILE() {
        System.out.println("Generar numeros Naturales (WHILE)");
        int i = 2;
        while (i <= 10) {
            System.out.println(i + ", ");
            i = i + 2;
        }
    }
}