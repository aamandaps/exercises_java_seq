import javax.swing.JOptionPane;

public class ex09 {

    // Algoritmo cálculo soma dos quadrados de dois números

    public static void main (String[] args) {
        int n1, n2, q1, q2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

        q1 = n1*n1;
        q2 = n2*n2;

        JOptionPane.showMessageDialog(null, "Os quadrados são respectivamente: "+q1+" e "+q2);

    }

}
