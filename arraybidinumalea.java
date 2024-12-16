import java.util.Random;
public class arraybidinumalea {
    public static void main(String [] args){
        int array[][] = new int[4][4];
        Random random = new Random();
        for(int i=0;i<4;i++){ //recorrer filas
            for (int j=0; j<4;j++){ //Recorrer columnas
                array[i][j] = random.nextInt(20);
            }
        }
        for(int i=0;i<4;i++){ //recorrer filas
            for (int j=0; j<4;j++){ //Recorrer columnas
                System.out.println("matriz ["+ i + "," + j + "] = " + array[i][j]);
            }
        }
    }
}
