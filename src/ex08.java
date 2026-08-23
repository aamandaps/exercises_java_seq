import javax.swing.JOptionPane;

public class ex08 {

    // Algoritmo cálculo poupança

    public static void main(String[] args) {
        double valor, rend;

        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor depositado: "));

        rend = valor * 1.013;

        JOptionPane.showMessageDialog(null, "O valor atual é igual à: "+ rend);
    }

}
