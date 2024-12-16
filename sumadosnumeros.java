import java.util.Scanner;
public class sumadosnumeros {
    public static void main(String[] args){
        int n1,n2,suma;
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);        
        System.out.println("Ingrese el primer numero: ");
        n1=teclado.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        n2=teclado.nextInt();

        suma=n1+n2;

        System.out.println("La suma es: " + suma);

    }
} 