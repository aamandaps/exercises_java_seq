import javax.swing.JOptionPane;

public class ex16 {

    public static void main (String[] args) {
        int quant_h, valor_h, num_d;
        float perc, sal_b, sal_l;

        quant_h = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas: "));
        valor_h = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de cada hora trabalhada: "));
        num_d = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de dependentes: "));
        perc = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do percentual: "));

        sal_b = quant_h * valor_h;
        sal_l = sal_b -(perc/100) + (num_d * 100);

        JOptionPane.showMessageDialog(null, "O salário é igual à: "+ sal_l);

    }

}
