package template2;

import javax.swing.*;
import java.awt.*;

public class CodeWerkGui2
{
    public void show()
    {
        // Neues Fenster mit Titel CodeWerk2
        JFrame frame = new JFrame("CodeWerk2");

        // Beendet das Programm vollständig, wenn es geschlossen wird. EXIT_ON_CLOSE ist eine Konstante
        // die wir an die Methode setDefaultCloseOperation übergeben (Option 3)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // FlowLayout ordnet Elemente nebeneinander an
        frame.setLayout(new FlowLayout());

        // Neues Label "Status: Warten..."
        JLabel label = new JLabel("Status: Warten...");
        frame.add(label);

        // Neuer Button mit Beschriftung "Klick mich!"
        JButton button = new JButton("Klick mich!");
        frame.add(button);

//        // namenlose Klasse (mit Parameter e für event)
//        ActionListener meinListener = new ActionListener()
//        {
//            @Override
//            public void actionPerformed(ActionEvent e)
//            {
//                label.setText("Status: Button wurde geklickt");
//            }
//        };
//
//        button.addActionListener(meinListener);
//
//        // namenlose Klasse ohne Hilfsvariable
//        button.addActionListener(new ActionListener()
//        {
//            @Override
//            public void actionPerformed(ActionEvent e)
//            {
//                label.setText("Status: Button wurde geklickt");
//            }
//        });

        // ActionListener für Button
        button.addActionListener(e ->
        {
            label.setText("Status: Button wurde geklickt");
            frame.pack();
        });

        // berechnet die minimale Fenstergröße, damit alle hinzugefügten Komponenten hineinpassen
        frame.pack();

        // zentriert das Fenster auf dem Bildschirm. Muss wissen, wie hoch und breit das Fenster ist, um die Mitte berechnen zu können
        frame.setLocationRelativeTo(null);

        // macht das Fenster auf dem Bildschirm sichtbar. Letzte Aktion, da man sonst alle Aktionen vorher mitverfolgen kann
        frame.setVisible(true);
    }
}
