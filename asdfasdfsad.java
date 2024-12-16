//calcular la edad de una persona con java.util.Date
import javax.swing.JOptionPane;
import java.util.Date;
public class asdfasdfsad {
    @SuppressWarnings("deprecation")
    public static void main (String[]args){
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su dia de nacimiento: (01-31)"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su mes de nacimiento: (01-12)"));
        int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento: (YYYY)"));

        Date fechaNacimiento = new Date(año - 1900, mes, dia);
        Date fechaActual = new Date();

        int edad = fechaActual.getYear() - fechaNacimiento.getYear();

        if (fechaActual.getMonth() < fechaNacimiento.getMonth() ||
                (fechaActual.getMonth() == fechaNacimiento.getMonth() && fechaActual.getDate() < fechaNacimiento.getDate())) {
        }

        JOptionPane.showMessageDialog(null,"Usted tiene: " + edad + " Años" );
    }
}
