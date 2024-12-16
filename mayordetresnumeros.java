import java.util.Scanner;
public class mayordetresnumeros {
    public static void main(String[] args){
        int n1,n2,n3;
        try (Scanner teclado = new Scanner(System.in)) {
            
            System.out.println("Ingrese el primer numero: ");
            n1=teclado.nextInt();

            System.out.println("Ingrese el segundo numero: ");
            n2=teclado.nextInt();
            
            System.err.println("Ingrese el tercer numero:   ");
            n3=teclado.nextInt();
            
            if (n1>n2) {
                System.out.println("El primer numero es mayor: "+n1);
            }
            if (n2>n3) {
                System.out.println("El segundo numero es mayor: "+ n2);
            }
            if (n1<n3) {
                System.out.println("El tercer numero es mayor: "+ n3);
            }
            }
        }
    } 