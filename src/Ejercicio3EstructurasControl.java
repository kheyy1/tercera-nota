import java.util.Scanner;

public class Ejercicio3EstructurasControl {
    public static void main(String[] args) {
        //Escribe un programa que presente un menú al usuario, y dependiendo de la opción seleccionada, realice una operación simple 
        //(como sumar dos números, restar, multiplicar o dividir) utilizando una estructura switch.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese los numeros con los que quiere operar");
        System.out.println("Ingrese primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = teclado.nextInt();
        boolean Flag = false;
        while (Flag == false){
            System.out.println("¿Que operacion desea realizar entre sus dos numeros?");
            System.out.println("1. Sumar " + num1 + " + " + num2);
            System.out.println("2. Restar " + num1 + " - " + num2);
            System.out.println("3. Multiplicar " + num1 + " + " + num2);
            System.out.println("4. Division " + num1 + " / " + num2);
            boolean Flag2 = false;
            int Eleccion = 1;
            while (Flag2 == false){
            System.out.println("Ingrese el numero de la operacion elegida");
                Eleccion = teclado.nextInt();
                if (Eleccion < 0 || Eleccion > 4) {
                    System.out.println("Entrada invalida, ingrese un numero de la lista");
                }
                else {
                    Flag2 = true;
                }
            }
            switch (Eleccion){
                case 1: 
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;
                case 2: 
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
                case 3:
                System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                break;
                case 4:
                if (num2 != 0){
                System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                }
                else{
                    System.out.println("No se puede dividir entre 0");
                }
                break;
                default:
                System.out.println("Opcion invalida");
            }
            System.out.println("Quiere probar de nuevo?");
            System.out.println("Ingrese 1 para volver a probar");
            System.out.println("Ingrese 0 para salir");
            int Interruptor = teclado.nextInt();
            if (Interruptor == 1){
                Flag = false;
            }
            else {
                Flag = true;
            }
        }
        System.out.println("Saliendo...");
        teclado.close();
    }
}
