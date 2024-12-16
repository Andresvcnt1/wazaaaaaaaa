import java.util.Scanner;
public class tabladesumar {
    public static void main(String[] args){
        int num;
        int resultado;
        int i;
        try (Scanner teclado = new Scanner(System.in)) {

            System.out.println("Numero de tabla (Sumar): ");
            num=teclado.nextInt();

            for (i=1; i<=12;i++){
                resultado=num+i;
                System.out.println(+num+"+"+i+"="+resultado);
            }
        }
    } 
}
