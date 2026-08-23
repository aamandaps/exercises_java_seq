import javax.swing.JOptionPane;

public class ex17 {

    public static void main(String[] args) {
        int quant_l, vel;
        double litros, tempo, dis;

        tempo = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo do trajeto: "));
        vel = Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade percorrida: "));

        dis = vel * tempo;

        litros = dis/12;

        JOptionPane.showMessageDialog(null, "A distância percorrida foi: "
                                      + dis+", e os litros gastos foram "+litros);
        //
    }

}
