package template;

public class SaveTaskAction
        implements TaskAction {

    @Override
    public void execute() {
        System.out.println(
                "Projekt gespeichert."
        );
    }
}
