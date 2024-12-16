import java.util.Scanner;
public class tabladerestar {
    public static void main(String[] args) {
     int num;
     int resultado;
     int i;
     
     try (Scanner teclado = new Scanner(System.in)) {
        System.out.println("Numero de tabla (Restar): ");
        num=teclado.nextInt();

        i=0;

        while (i<=12){
            resultado=num-i;
            System.out.println(num+"-"+i+"="+resultado);
            i++;
        }
    }
    }
}

