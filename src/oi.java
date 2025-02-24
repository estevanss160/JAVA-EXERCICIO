import javax.swing.*;
public class oi {
    public static void main(String[] args) {
        double soma = 1+2 ;
        JOptionPane.showMessageDialog(null, "oi");
        String nome = JOptionPane.showInputDialog(soma);
        JOptionPane.showMessageDialog(null, "ff");
        String numero = JOptionPane.showInputDialog("digite um número");
        Byte num1 = Byte.parseByte(numero);
        Short num2 = Short.parseShort(numero);
        Integer num3 = Integer.parseInt(numero);
        Long num4 = Long.parseLong(numero);
        Float num5 = Float.parseFloat(numero);
        Double num6 = Double.parseDouble(numero);

        JOptionPane.showMessageDialog(null, "os números convertidos são \n"+num1 + " " + num2 + "\n "+
                + num3 + "\n " + num4 + "\n " + num5 + "\n " + num6);


    }
}
