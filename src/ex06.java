import javax.swing.JOptionPane;

public class ex06 {

    // Algoritmo trocar y e x

    public static void main(String[] args) {
        int x , y , aux;

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));

        aux = x;
        x = y;
        y = aux;

        JOptionPane.showMessageDialog(null, "Os valores atualizados são: X = "+x+", Y = "+y);

    }

}
