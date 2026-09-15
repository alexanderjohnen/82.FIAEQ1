package template;

public class Main
{

    public static void main(String[] args)
    {
        TaskAction action = new TaskAction()
        {
            @Override
            public void execute()
            {
                System.out.println("Projekt wurde archiviert.");
            }
        };

        action.execute();
    }
}
