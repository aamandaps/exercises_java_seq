import javax.swing.JOptionPane;

public class ex12 {

    public static void main(String[] args) {
        int ano_nasc, ano_atual, idade_atual, idade_fut;

        ano_nasc = Integer.parseInt(JOptionPane.showInputDialog("Insira o seu ano de nascimento: "));
        ano_atual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual: "));

        idade_atual = ano_atual - ano_nasc;
        idade_fut = idade_atual + 17;

        JOptionPane.showMessageDialog(null, "Sua idade é "+idade_atual+
                                        ", e daqui 17 anos você terá "+idade_fut);
        //
    }

}
