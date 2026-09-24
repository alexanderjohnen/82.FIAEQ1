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

        vornameEingabe = addInput(panel,"Vorname", 'V', " (Alt + V)", "Vorname", "Bitte hier Ihren Vornamen eingeben");
        showName(panel, "Vorname", vornameEingabe);
        nachnameEingabe = addInput(panel,"Nachname", 'N', " (Alt + N)", "Nachname", "Bitte hier Ihren Nachnamen eingeben");
        showName(panel, "Nachname", nachnameEingabe);

        JPanel outerPanel = new JPanel();
        outerPanel.add(panel);

        frame.add(outerPanel);

        frame.pack();

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    private JTextField addInput (JPanel panel, String fieldType, char setMnemonic, String Kuerzel, String fieldName, String fieldContext )
    {
        JLabel nameLabel = new JLabel("Geben Sie Ihren " + fieldType + "n ein:");
        panel.add(nameLabel);

        JTextField nameEingabe = new JTextField(10);
        panel.add(nameEingabe);
        nameLabel.setLabelFor(nameEingabe);
        nameEingabe.getAccessibleContext().setAccessibleName(fieldName);
        nameEingabe.getAccessibleContext().setAccessibleDescription(fieldContext);

        JButton nameConfirm = new JButton("Speichern" + Kuerzel);
        panel.add(nameConfirm);
        nameConfirm.setMnemonic(setMnemonic);
        nameEingabe.addActionListener(e -> nameConfirm.doClick());

        int index = nameConfirm.getText().indexOf(setMnemonic);
        if (index != -1) {
            nameConfirm.setDisplayedMnemonicIndex(index);
        }

        JLabel nameSaved = new JLabel("---------------------------------------------");
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

        JLabel showNameLabel = new JLabel("---------------------------------------------");
        panel.add(showNameLabel);

        showNameButton.addActionListener(e -> {
            showNameLabel.setText(inputField.getText().trim());
        });
    }
}
