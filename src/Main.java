import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        boolean esValido = false;
        while (!esValido) {
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros enteros ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            String primerNumero = JOptionPane.showInputDialog("Digite el primer numero: ");
            String segundoNumero = JOptionPane.showInputDialog("Digite el segundo  numero: ");

            try {
                int n1 = Integer.parseInt(primerNumero);
                int n2 = Integer.parseInt(segundoNumero);
                esValido = true;
                int resultado = n1 + n2;
                JOptionPane.showMessageDialog(null, "La suma es: " + resultado, "Resultado", JOptionPane.PLAIN_MESSAGE);
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo numeros enteros", "Error", JOptionPane.ERROR_MESSAGE);
            }


        }
    }
}