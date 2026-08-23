import javax.swing.JOptionPane;

public class ex13 {

    // Algoritmo cálculo alimento em g

    public static void main(String[] args) {
        int quant_kg, dias;

        quant_kg = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de alimento em kg: "));

        dias = (quant_kg * 1000)/50;

        JOptionPane.showMessageDialog(null, "Esse alimento irá durar "+ dias+" dias");


    }

}
