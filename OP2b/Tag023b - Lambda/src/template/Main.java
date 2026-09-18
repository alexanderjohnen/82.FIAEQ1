package template;

public class Main
{
    public static void main(String[] args)
    {
        TaskAction action = () -> System.out.println("Projekt wurde archiviert.");                               // Expression Lambda Schreibweise
        action.execute();                                                                                        // Methode aus Interface TaskAction

        ProjectPrinter printer = projectName -> System.out.println("Projekt: " + projectName);             // Expression Lambda mit Parameter
        printer.print("Kundenportal");                                                                           // Methode aus Interface ProjectPrinter

        ProjectLabelBuilder builder = (projectName, status) -> projectName + "[" + status + "]";     // Expression Lambda mit zwei Parametern & return
        String result = builder.build("Kundenportal", "AKTIV");                                 // Methoder aus Interface ProjectLabelBuilder

        ProjectLabelBuilder builder2 = (projectName, status) ->
        {
            String normalizedStatus = status.toUpperCase();
            return projectName + " [" + normalizedStatus + "]";                                                   // Block Lambda mit toUpperCase() & return
        };                                                                                                        // Block Lambda gekennzeichnet durch {}
                                                                                                                  // egal wie viele Zeilen
        String result2 = builder2.build("Kundeportal", "aktiv");
        System.out.print(result2);
    }
}
