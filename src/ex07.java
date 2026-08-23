import javax.swing.JOptionPane;

public class ex07 {

    // Algoritmo cálculo volume paralelepípedo

    public static void main(String[] args) {
        int alt, comp, larg, vol;

        alt = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));
        comp = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento: "));
        larg = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura: "));

        vol = alt * comp * larg;

        JOptionPane.showMessageDialog(null, "O volume é igual à: "+vol);

    }

}
