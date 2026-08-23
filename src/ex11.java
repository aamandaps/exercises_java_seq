import javax.swing.JOptionPane;

public class ex11 {

    // Algoritmo cálculo comprimento circunferência

    public static void main(String[] args) {
        int raio;
        double circ;

        raio = Integer.parseInt(JOptionPane.showInputDialog("Digite o raio: "));

        circ = raio * 3.14 * 2;

        JOptionPane.showMessageDialog(null, "A circunferência é: "+ circ);


    }

}
