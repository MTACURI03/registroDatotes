import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Datotes extends JFrame{

    private JTextField textField2;
    private JTextField textField3;
    private JButton unirButton;
    private JButton sumarButton;
    private JButton cerrarButton;
    private JPanel panel1;
    private JButton limpiarButton;
    private JTextField textField1;
    private JTextField textField4;

    public Datotes(){
        super("OPERACIONES");
        setContentPane(panel1);
        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.out.println(0);
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField2.setText("");
                textField3.setText("");
            }
        });
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double val1 = Double.parseDouble(textField2.getText());
                    double val2 = Double.parseDouble(textField3.getText());
                    double resultado = val1 + val2;
                    JOptionPane.showMessageDialog(null, "hola" + " tu resultado es : " + resultado);
                    textField1.setText(Double.toString(resultado));
                }catch (Exception exception){
                    System.out.println("ESTA MAL DIGITADO");
                }
            }
        });
        unirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom1= textField2.getText();
                String nom2= textField3.getText();
                String igual=nom1+" "+nom2;
                JOptionPane.showMessageDialog(null,"hola"+" "+igual);
                textField4.setText(igual);
            }
        });
        textField4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
