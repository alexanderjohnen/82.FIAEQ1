package template;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CheckBox
{
    public static List<JCheckBox> checkBoxCreator(String... names)
    {
        List<JCheckBox> checkBoxes = new ArrayList<>();

        for(String name : names)
        {
            checkBoxes.add(new JCheckBox(name));
        }

        return checkBoxes;
    }


}
