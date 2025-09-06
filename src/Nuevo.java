public class Nuevo {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        int num3 = 1;
        int numMax = 0;
        for (int i = 0 ; i <= 3 ; i++){
            if (num1 > num2 && num1 > num3){
                numMax=num1;
            } else if (num2 > num1 && num2 > num3){
                numMax= num2;
            } else {
                numMax= num3;
            }
        }
        System.out.println(numMax);
    }
}
