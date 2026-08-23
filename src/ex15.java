import javax.swing.JOptionPane;

public class ex15 {

    // Algoritmo cálculo da hipotenusa

    public static void main (String[] args) {
        int b, c;
        double a;

        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro cateto: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo cateto: "));

        a = Math.sqrt((b * b) + (c * c));

        JOptionPane.showMessageDialog(null, "A hipotenusa é igual à: "+ a);
    }

}
