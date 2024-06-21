import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*boolean esValido = false;
        while (!esValido) {
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros enteros ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            String primerNumero = JOptionPane.showInputDialog("Digite el primer numero: ");
            String segundoNumero = JOptionPane.showInputDialog("Digite el segundo  numero: ");
            try {
                int n1 = Integer.parseInt(primerNumero);
                int n2 = Integer.parseInt(segundoNumero);
                esValido = true;
                int suma = n1 + n2;
                int resta = n1 + n2;
                int multi = n1 + n2;
                int div = n1 + n2;


                JOptionPane.showMessageDialog(null, "La suma es: " + suma, "Resultado", JOptionPane.PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(null, "La resta es: " + resta, "Resultado", JOptionPane.PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multi, "Resultado", JOptionPane.PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(null, "La division es: " + div, "Resultado", JOptionPane.PLAIN_MESSAGE);

            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo numeros enteros", "Error", JOptionPane.ERROR_MESSAGE);
            }


        }*/
        /*JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Forma2().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(4500, 1600);
        frame.pack();
        frame.setVisible(true);*/

        JFrame frame1 = new JFrame("LOGIN");
        frame1.setContentPane(new Forma3().login);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(4500, 1600);
        frame1.pack();
        frame1.setVisible(true);
    }
}