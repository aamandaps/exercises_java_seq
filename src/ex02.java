import javax.swing.JOptionPane;

public class ex02 {

    // Algoritmo cálculo do salário com 15% de ajuste

    public static void main(String[] args) {
        double salario , novo_sal;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o salário atual: "));

        novo_sal = salario * 1.15;

        JOptionPane.showMessageDialog(null, "O novo salário é: "+ novo_sal);
    }

}
