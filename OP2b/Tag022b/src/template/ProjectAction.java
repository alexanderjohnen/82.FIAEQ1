package template;

public abstract class ProjectAction {

    private String actionName;

    public ProjectAction(String actionName) {
        this.actionName = actionName;
    }

    public void printStart() {
        System.out.println("Starte Aktion: " + actionName);
    }

    public abstract void execute();
}
