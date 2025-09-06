import java.util.Scanner;

public class TareaNombres {
    public static void main(String[] args) {
        String[] marcasDeCarros;
        marcasDeCarros = new String[5];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cinco marcas de carros");
        for (int i = 0 ; i<=4 ; i++){
            marcasDeCarros[i] = teclado.nextLine();
            teclado.reset();
        } 
        for (int i = 0 ; i<=4 ; i++){
            System.out.println(i+1 + ". " + marcasDeCarros[i]);
        }
    }
}
