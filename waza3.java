import javax.swing.JOptionPane;
public class waza3 {
    public static void main(String[] args){
        int nota1, nota2, nota3;
        double promedio;

        nota1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la primera nota: "));
        nota2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la segunda nota: "));
        nota3=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la tercera nota: "));

        promedio = (nota1+nota2+nota3)/3;

        JOptionPane.showMessageDialog(null,"El promedio del estudiante es: " + promedio);
 
    }
}
   