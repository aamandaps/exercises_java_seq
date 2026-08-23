import javax.swing.JOptionPane;

public class ex05 {

    // Algoritmo cálculo equação segundo grau (AX2+BX+C=0).

    public static void main(String[] args) {
        int a , b , c;
        double delta , x1 , x2;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite valor de A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite valor de B: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite valor de C: "));

        delta = (b * b) - (4 * a * c);
        x1 = (-b + Math.sqrt(delta))/ (2*a);
        x2 = (-b - Math.sqrt(delta))/ (2*a);

        JOptionPane.showMessageDialog(null, "As raízes são "+ x1+" e "+x2);

    }

}
