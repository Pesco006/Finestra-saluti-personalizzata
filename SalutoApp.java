import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SalutoApp extends JFrame implements ActionListener {
    private JTextField nomeField;
    private JTextArea outputArea;

    public SalutoApp() {
        setTitle("Saluto App");
        setSize(520, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JLabel label = new JLabel("Inserisci il tuo nome:");
        panel.add(label);

        nomeField = new JTextField(20);
        panel.add(nomeField);

        JButton salvaButton = new JButton("Salva Nome");
        salvaButton.addActionListener(this);
        panel.add(salvaButton);

        JButton salutoFormaleButton = new JButton("Saluta Buongiorno");
        salutoFormaleButton.addActionListener(this);
        panel.add(salutoFormaleButton); 

        JButton salutoInformaleButton = new JButton("Saluta Buonasera");
        salutoInformaleButton.addActionListener(this);
        panel.add(salutoInformaleButton);

        outputArea = new JTextArea();
        panel.add(new JScrollPane(outputArea));

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = nomeField.getText();

        switch (e.getActionCommand()) {
            case "Salva Nome":
                // Qui potresti salvare il nome in una variabile globale o in un altro modo.
                break;
            case "Saluta Buongiorno":
                outputArea.append("Buongiorno, " + nome + "!\n");
                break;
            case "Saluta Buonasera":
                outputArea.append("Buonasera, " + nome + "!\n"); // Aggiunta condizione per il caso del bottone "Saluta Buonasera"
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SalutoApp();
            }
        });
    }
}
