package template.Refactored.SOLID.dip;

public class SMSService implements IBenachrichtigungsDienst{
    @Override
    public void sende(String nachricht) {
        System.out.println("Sende SMS: " + nachricht);
    }
}
