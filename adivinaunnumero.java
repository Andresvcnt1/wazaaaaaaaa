import javax.swing.JOptionPane;
import java.util.Random;

public class adivinaunnumero {
    public static void main(String[] args) { 
        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;

        JOptionPane.showMessageDialog(null, 
            "¡Bienvenido al juego de adivinar el número!\n" +
            "Debes adivinar un número entre 0 y 10.\n" +
            "Tienes 3 intentos. ¡Buena suerte!");

     
        for (int i = 1; i <= 3; i++) {
            String input = JOptionPane.showInputDialog("Intento " + i + ": ¿Cuál crees que es el número?");
            
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Juego cancelado. ¡Hasta luego!");
                return;
            }

            int intento = Integer.parseInt(input);

            if (intento == numeroSecreto) {
                JOptionPane.showMessageDialog(null, 
                    "¡Felicidades! Adivinaste el número secreto: " + numeroSecreto);
                return; 
            } else if (i < 3) {
                JOptionPane.showMessageDialog(null, 
                    "No es correcto. ¡Inténtalo de nuevo!");
            }
        }

        JOptionPane.showMessageDialog(null, 
            "Lo siento, no lograste adivinar el número. El número secreto era: " + numeroSecreto);
    }
}