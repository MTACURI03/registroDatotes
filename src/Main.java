import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame formu =new Datotes();
                formu.setSize(400,400);
                formu.setVisible(true);
            }
        });
    }
}