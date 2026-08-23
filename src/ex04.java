import javax.swing.JOptionPane;

public class ex04 {

    // Algoritmo cálculo de conversão de Celsius para Fahrenheit --> F = (9*C+160) /5.

    public static void main(String[] args) {
        int c , f;

        c = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em Celsius: "));

        f =(9 * c + 160)/5;

        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é igual à: "+ f);

    }

}
