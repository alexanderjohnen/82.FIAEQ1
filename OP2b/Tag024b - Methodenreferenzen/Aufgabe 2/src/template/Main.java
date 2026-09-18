package template;

public class Main {

    public static void main(String[] args) {
        ProjectLogger logger =
                new ProjectLogger();

        ProjectPrinter printer = logger::log;

        printer.print("Kundenportal");
    }
}
