import javax.swing.JOptionPane;
public class waza2 {
    public static void main(String [] args){
        int precioarticulo;
        int precioventa;

        precioarticulo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el precio del articulo: "));

        precioventa = (int)(precioarticulo*1.3);

        JOptionPane.showMessageDialog(null,"Es precio de venta para obtener una ganacia del 30% es: "+ precioventa);
    }
}
