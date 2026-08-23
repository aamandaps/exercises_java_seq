import javax.swing.JOptionPane;

public class ex10 {

    // Algoritmo cálculo da diferença entre dois números reais

    public static void main (String[] args) {
        double n1, n2, dif;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um segundo número real: "));

        dif = n1 - n2;

        JOptionPane.showMessageDialog(null, "A diferença é igual à: "+ dif);
    }

}
