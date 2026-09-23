package template;

import javax.swing.SwingUtilities;

public class Main
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(
                () ->
                {
                    CodeWerkGui gui = new CodeWerkGui();
                    gui.show();
                });
    }
}