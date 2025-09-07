public class Ejercicio2EstructurasControl {
    public static void main(String[] args) {
        //Crea un programa que cuente cuántos números pares hay entre 1 y 100 utilizando un ciclo for.
        int contadorDePares = 0;
        for (int i = 1 ; i <=100 ; i++){
            if (i%2 == 0) {
                contadorDePares++;
            }
        }
        System.out.println("Del 1 al 100 hay un total de " + contadorDePares + " numeros pares");
    }
}
