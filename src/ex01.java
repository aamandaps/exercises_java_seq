import javax.swing.JOptionPane;

public class ex01 {

    // Algoritmo cálculo área quadrado

    public static void main(String[] args) {
        int lado , area;

        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado do quadrado: "));

        area = lado * lado;

        JOptionPane.showMessageDialog(null, "A área do quadrado é igual à: "+ area);
    }
}
