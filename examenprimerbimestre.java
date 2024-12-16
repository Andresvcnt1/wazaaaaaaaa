import javax.swing.JOptionPane;
public class examenprimerbimestre {
    @SuppressWarnings("empty-statement")
    public static void main (String[] args){
        JOptionPane.showMessageDialog(null, """
                                            \u00a1Bienvenido!
                                            Ingresa tu fecha de nacimiento para saber
                                            Cual es tu signo de zodiaco y 
                                            cual es tu signo en el horoscopo chino""");
        boolean continuar = true;
       
        while(continuar) {

            int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su dia de nacimiento: (1-31)"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su mes de nacimiento: (1-12)"));
            int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento: (YYYY)"));
            String signozodiacal = "";

            if (mes == 1 && dia>=20 || mes == 2 && dia <= 18 ){
                signozodiacal = "Acuario";
            }
            else if (mes == 2 && dia >= 19 || mes == 3 && dia <= 20) {
                signozodiacal = "Piscis";
            }
            else if (mes == 3 && dia>=21 || mes == 4 && dia <= 19 ){
                signozodiacal = "Aries";
            }
            else if (mes == 4 && dia >= 20 || mes == 5 && dia <= 20) {
                signozodiacal = "Tauro";
            }
            else if (mes == 5 && dia>=21 || mes == 6 && dia <= 20 ){
                signozodiacal = "Géminis";
            }
            else if (mes == 6 && dia >= 21 || mes == 7 && dia <= 22) {
                signozodiacal = "Cáncer";
            }
            else if (mes == 7 && dia>=23 || mes == 8 && dia <= 22 ){
                signozodiacal = "Leo";
            }
            else if (mes == 8 && dia >= 23 || mes == 9 && dia <= 22) {
                signozodiacal = "Virgo";
            }  
            else if (mes == 9 && dia>=23 || mes == 10 && dia <= 22 ){
                signozodiacal = "Libra";
            }
            else if (mes == 10 && dia >= 23 || mes == 11 && dia <= 21) {
                signozodiacal = "Escorpio";
            }
            else if (mes == 11 && dia>=22 || mes == 12 && dia <= 21 ){
                signozodiacal = "Sagitario";
            }
            else if (mes == 12 && dia >= 20 || mes == 1 && dia <= 19) {
                signozodiacal = "Capricornio";
            };

            String signochino = "";
            switch (año % 12) {
                case 0 -> signochino = "Rata";
                case 1 -> signochino = "Buey";
                case 2 -> signochino = "Tigre";
                case 3 -> signochino = "Conejo";
                case 4 -> signochino = "Dragon";
                case 5 -> signochino = "Serpiente";
                case 6 -> signochino = "Caballo";
                case 7 -> signochino = "Cabra";
                case 8 -> signochino = "Mono";
                case 9 -> signochino = "Gallo";
                case 10 -> signochino = "Perro";
                case 11 -> signochino = "cerdo";
             }

             
             JOptionPane.showMessageDialog(null,"Tu signo sodiacal es " + signozodiacal + "\n" +
             "Tu signo sodiacal chino es " + signochino 
             );
             int respuesta = JOptionPane.showConfirmDialog(null, "Deseas ingresar otra fecha de nacimiento?");
                if (respuesta == JOptionPane.NO_OPTION) {
                    continuar = false;
                }
        }    
    }
}
