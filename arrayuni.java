import javax.swing.JOptionPane;

public class arrayuni {
    public static void main(String [ ] args){
        int array[ ] = new int[ 4 ];
        int valor;
        for(int i = 0 ; i < 4 ; i ++){ //llenar el vector
            valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un valor"));
            array[i] = valor;
            //array[ i ] = i * 2; //lleno el valor automatico de j multiplica por 2
        }

        for(int i = 0 ; i < 4 ; i ++){ //presentar el vector
            System.out.println("Vector[" + i + "] = " + array[ i ]);
        }
    }
}


//int resultadoAleatorio = (int) Math.floor(Math.random()*100+1);
//System.out.println(resultadoAleatorio);