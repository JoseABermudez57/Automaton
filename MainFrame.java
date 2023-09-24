import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainFrame extends JFrame {

    JTextField tfEntry;
    
    public void initialize() {
        JLabel lbEntry = new JLabel("Ingresa la cadena a evaluar");
        tfEntry = new JTextField();

        JButton btnCheck = new JButton("Validar");
        btnCheck.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String entry = tfEntry.getText();
                String message;
                ValidateExpression validate = new ValidateExpression();
                if (validate.ValidateRegularExpression(entry)){
                    message = "Cadena valida";
                } else {
                    message = "Cadena invalida";
                }
                JOptionPane.showMessageDialog(MainFrame.this, "Resultado: " + message);
            }
        });

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));

        
        mainPanel.add(lbEntry, BorderLayout.NORTH);
        mainPanel.add(tfEntry, BorderLayout.CENTER);
        mainPanel.add(btnCheck, BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("Automaton");
        setSize(300, 200);
        setMaximumSize(new Dimension(300, 200));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainFrame myFrame = new MainFrame();
                myFrame.initialize();
            }
        });
    }
}
