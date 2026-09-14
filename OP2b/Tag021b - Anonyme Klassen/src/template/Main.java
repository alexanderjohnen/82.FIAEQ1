package template;

public class Main {

    public static void main(String[] args) {
        TaskAction action =
                new SaveTaskAction();

        action.execute();                                                                       // Methodenaufruf der benannten Klasse

        TaskAction unnamedAction = new TaskAction()                                             // anonyme Klasse
        {
            @Override
            public void execute()
            {
                System.out.println("Projekt gespeichert über anonyme Klasse.");
            }
        };

        unnamedAction.execute();                                                                // Methodenaufruf der anonymen Klasse
    }
}
