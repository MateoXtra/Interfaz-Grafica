import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forma3 {
    private JLabel lb1;
    private JLabel lb2;
    private JTextPane textPane1;
    private JButton OKButton;
    private JButton BORRARButton;
    private JPasswordField passwordField1;
    public JPanel login;

    public Forma3() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contrasena = "OLA123";
                passwordField1.setText(contrasena);
                if (passwordField1.getText().equals(contrasena)) {
                    textPane1.setText("BIENVENIDO");
                }else{
                    textPane1.setText("Contraseña Incorrecta");
                }
            }
        });
    }

}
