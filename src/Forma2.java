import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forma2 {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTextField n1;
    private JTextField n2;
    public JPanel MainPanel;
    private JLabel Respuesta;

    public Forma2() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(n1.getText());
                double num2 = Double.parseDouble(n2.getText());
                Respuesta.setText("Respuesta: " + num1 + " + " + num2 + " = " + (num1 + num2));
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(n1.getText());
                double num2 = Double.parseDouble(n2.getText());
                Respuesta.setText("Respuesta: " + num1 + " - " + num2 + " = " + (num1 - num2));
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(n1.getText());
                double num2 = Double.parseDouble(n2.getText());
                Respuesta.setText("Respuesta: " + num1 + " * " + num2 + " = " + (num1 * num2));
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(n1.getText());
                double num2 = Double.parseDouble(n2.getText());
                boolean istrue = true;
                while (istrue = true){
                    if (num2 == 0){
                        Respuesta.setText("No valido dividir para cero");
                    }else{
                        Respuesta.setText("Respuesta: " + num1 + " / " + num2 + " = " + (num1 / num2));
                    }

                }
            }
        });
    }
}
