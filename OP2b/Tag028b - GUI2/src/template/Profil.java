package template;

import javax.swing.*;
import java.awt.*;

public class Profil
{
    private JTextField vornameEingabe;
    private JTextField nachnameEingabe;


    public void show()
    {
        JFrame frame = new JFrame("Persönliches Profil");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(12,1,10,10));

        vornameEingabe = addInput(panel,"Vorname");
        showName(panel, "Vorname", vornameEingabe);
        nachnameEingabe = addInput(panel,"Nachname");
        showName(panel, "Vorname", nachnameEingabe);

        JPanel outerPanel = new JPanel();
        outerPanel.add(panel);

        frame.add(outerPanel);

        frame.pack();

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    private JTextField addInput (JPanel panel, String fieldType)
    {
        JLabel nameLabel = new JLabel("Geben Sie Ihren " + fieldType + "n ein:");
        panel.add(nameLabel);

        JTextField nameEingabe = new JTextField(10);
        panel.add(nameEingabe);

        JButton nameConfirm = new JButton("Speichern");
        panel.add(nameConfirm);

        JLabel nameSaved = new JLabel();
        panel.add(nameSaved);

        nameConfirm.addActionListener(e ->
        {
            String nameEingabeSaved = nameEingabe.getText().trim();
            nameConfirm.setText(fieldType + " gespeichert");
            nameSaved.setText("Ihr " + fieldType + " lautet: " + nameEingabeSaved);
            nameEingabe.setEnabled(false);
            nameConfirm.setEnabled(false);
            // frame.pack();
        });

        return nameEingabe;
    }

    public void showName(JPanel panel, String fieldtype, JTextField inputField)
    {
        JButton showNameButton = new JButton("Zeige " + fieldtype + " an");
        panel.add(showNameButton);

        JLabel showNameLabel = new JLabel();
        panel.add(showNameLabel);

        showNameButton.addActionListener(e -> {
            showNameLabel.setText(inputField.getText().trim());
        });
    }
}
