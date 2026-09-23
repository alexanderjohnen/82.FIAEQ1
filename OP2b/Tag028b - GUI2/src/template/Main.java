package template;

import javax.swing.*;

public class Main
{
    static void main()
    {
        SwingUtilities.invokeLater(() ->
        {
            Profil gui = new Profil();
            gui.show();
        });
    }
}
