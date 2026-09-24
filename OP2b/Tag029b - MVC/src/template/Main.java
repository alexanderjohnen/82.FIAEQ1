package template;

import javax.swing.*;

public class Main
{
    static void main()
    {
        SwingUtilities.invokeLater(() ->
        {
            FISI gui = new FISI();
            gui.show();
        });
    }
}
