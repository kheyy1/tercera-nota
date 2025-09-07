import java.util.Scanner;

public class Ejercicio1EscructurasControl {
    public static void main(String[] args) {
        //Escribe un programa que lea tres números del usuario y determine 
        //cuál es el mayor de los tres utilizando una estructura if-else.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = teclado.nextInt();
        teclado.reset();
        System.out.println("Ingrese el segundo numero");
        int num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer numero");
        int num3 = teclado.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero mayor es : " + num1);
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println("El numero mayor es: " + num2);
        }
        else {
            System.out.println("El numero mayor es: " + num3);
        }
        teclado.close();
    }
}
