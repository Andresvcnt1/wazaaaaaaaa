import java.util.Scanner;
public class tablamultiplicar {
    public static void main (String[] args) {
        int n1;
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que numero de tabla de multiplicar desea? ");
        n1=teclado.nextInt();

        for(int i=1; i<=12; i++){
            System.out.println(n1+" x "+i+" = "+i*n1);
        }
    }
}
    