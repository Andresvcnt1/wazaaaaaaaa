import javax.swing.JOptionPane;

public class ejercicio09 {
    public static void main(String[] args){
        String palabra;
        int numero;
        char letra;
        double promedio;
        
        palabra = JOptionPane.showInputDialog(null,"Ingrese sus nombres");
        JOptionPane.showMessageDialog(null,palabra);

        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero entre 0 y 20"));
        JOptionPane.showMessageDialog(null,numero+5);

        letra = JOptionPane.showInputDialog("Su letra "+palabra).charAt(0);
        JOptionPane.showMessageDialog(null, letra);

        promedio = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un valor"));
        System.out.println(promedio);

    }
}
