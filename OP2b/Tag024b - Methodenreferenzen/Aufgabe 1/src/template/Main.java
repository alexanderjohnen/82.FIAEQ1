package template;

public class Main {

    public static void main(String[] args)
    {
        // Lambda Schreibweise
        // TaskAction action = () -> ProjectActions.archiveProject();

        // Methodenreferenz Schreibweise
        TaskAction action = ProjectActions::archiveProject;

        action.execute();
    }
}
