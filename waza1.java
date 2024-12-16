import javax.swing.JOptionPane;
public class waza1 {
    public static void main(String []args){
        int edad;
        
        edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad de la persona: "));

        if (edad >= 1 && edad <= 3) {
            JOptionPane.showMessageDialog(null,"Es un bebe");
        } else if (edad >= 4 && edad <= 11) {
            JOptionPane.showMessageDialog(null,"Es un niño");
        } else if (edad >= 12 && edad <= 17) {
            JOptionPane.showMessageDialog(null,"Es un adolescente");
        } else if (edad >= 18 && edad <= 31) {
            JOptionPane.showMessageDialog(null,"Es un joven");
        } else if (edad >= 32 && edad <= 65) {
            JOptionPane.showMessageDialog(null,"Es un adulto");
        } else if (edad > 65) {
            JOptionPane.showMessageDialog(null,"Es un adulto mayor");
        }
    }
}
