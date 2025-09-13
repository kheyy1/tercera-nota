import java.util.Scanner;

public class Ejercicio6EstructurasControl {
    public static void main(String[] args) {
        //Escribe un programa que genere la tabla de multiplicar de un número ingresado por el usuario utilizando un ciclo for.
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Que tabla quiere?");
        int Numero = teclado.nextInt();
        System.out.println("TABLA DEL " + Numero);
        for (int i = 0 ; i <= 10 ; i++){
            System.out.println(i + "x" + Numero + " = " + (i*Numero));
        }
        teclado.close();
    }
}
