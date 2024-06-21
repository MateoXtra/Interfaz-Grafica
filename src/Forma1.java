import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forma1 {
    private JButton button0;
    public JPanel MainPanel;
    private JLabel NombreLbl;
    private JButton button1;
    private JTextField Jtextfield;
    private JButton button3;
    public JPanel panel0;

    public Forma1() {
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NombreLbl.setText("HOLA MUNDO");

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NombreLbl.setText(" ");

            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NombreLbl.setText(Jtextfield.getText());
            }
        });
    }

}
