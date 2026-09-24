package template;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Buttons
{
    public List<JButton> createButtons(String... names)
    {
        List<JButton> buttons = new ArrayList<>();

        for (String name : names)
        {
            buttons.add(new JButton(name));
        }

        return buttons;
    }
}
