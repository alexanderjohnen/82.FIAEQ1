package template2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main
{
    static void main()
    {
        SwingUtilities.invokeLater(() ->
        {
            CodeWerkGui2 gui = new CodeWerkGui2();
            gui.show();
        });
    }
}
