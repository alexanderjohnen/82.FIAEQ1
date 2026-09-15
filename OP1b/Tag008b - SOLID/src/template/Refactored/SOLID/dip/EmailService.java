package template.Refactored.SOLID.dip;

public class EmailService implements IBenachrichtigungsDienst{
    @Override
    public void sende(String nachricht) {
        System.out.println("Sende Email: " + nachricht);
    }


}
