import javax.swing.JOptionPane;

public class ex03 {

    // Algoritmo cálculo área do triângulo

    public static void main(String[] args) {
        int alt , base, area;

        alt = Integer.parseInt(JOptionPane.showInputDialog("Insira a altura do triângulo: "));
        base = Integer.parseInt(JOptionPane.showInputDialog("Insira a base do triângulo: "));

        area = (alt * base)/2;

        JOptionPane.showMessageDialog(null, "A área do triângulo é igual à: "+ area);

    }

}
