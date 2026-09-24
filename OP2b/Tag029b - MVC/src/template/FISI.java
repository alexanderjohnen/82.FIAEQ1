package template;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FISI
{
    public void show()
    {
        JFrame frame = new JFrame("Wie du vom FIAE zum FISI wechselst");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel outerPanel = new JPanel();
        outerPanel.setLayout(new FlowLayout());
        frame.add(outerPanel);

        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(0,1,10,10));
        innerPanel.setPreferredSize(new Dimension(300, 200));
        outerPanel.add(innerPanel);

        JLabel label = new JLabel("Schnauze! Keiner wechselt hier zum FISI!", SwingConstants.CENTER);
        label.setVisible(false);

        Buttons buttonCreator = new Buttons();

        List<JButton> buttonsCreated = buttonCreator.createButtons("Hier klicken", "Oder hier", "Oder vielleicht doch hier");

        JButton pressButton = buttonsCreated.get(0);
        innerPanel.add(pressButton);
        pressButton.addActionListener(e -> {
            label.setVisible(true);
        });

        for (String name : new String[]{"Option1", "Option2", "Option 3", "Option 4"})
        {
            innerPanel.add(new JCheckBox(name));
        }

        innerPanel.add(label);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
