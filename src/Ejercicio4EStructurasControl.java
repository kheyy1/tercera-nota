import java.util.Scanner;

public class Ejercicio4EStructurasControl {
    public static void main(String[] args) {
        //Desarrolla un programa que calcule el factorial de un número dado por el usuario utilizando un ciclo while.
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿A que numero quiere hayarle su factorial?");
        int Numero = teclado.nextInt();
        long resultado = 1;
        for (int i = 1 ; i <= Numero ; i++){
            resultado = resultado * i;
        }
        System.out.println("El factorial de " + Numero + " es " + resultado);
        teclado.close();
    }
}