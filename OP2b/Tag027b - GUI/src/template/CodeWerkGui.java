package template;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CodeWerkGui
{

    public void show()
    {
        JFrame frame = new JFrame("CodeWerk");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout(10, 10));

        JPanel formPanel = new JPanel(new GridLayout(4, 1, 5, 5));

        JLabel projectLabel = new JLabel("Projektname:");
        formPanel.add(projectLabel);

        JTextField projectField = new JTextField(20);
        formPanel.add(projectField);

        JButton createButton = new JButton("Projekt anlegen");
        formPanel.add(createButton);

        JLabel statusLabel = new JLabel("Noch kein Projekt angelegt.");
        formPanel.add(statusLabel);

        frame.add(formPanel, BorderLayout.CENTER);

        createButton.addActionListener(
                event ->
                {
                    String projectName = projectField
                            .getText()
                            .trim();

                    if (projectName.isBlank())
                    {
                        statusLabel.setText("Bitte Projektname eingeben.");
                        return;
                    }

                    statusLabel.setText("Projekt angelegt: " + projectName);
                }
        );

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
