package template.Refactored.SOLID.dip;

public class BenachrichtungsService {
    private IBenachrichtigungsDienst dienst;

    public BenachrichtungsService(IBenachrichtigungsDienst dienst){
        this.dienst = dienst;

    }

    public void sendeBenachrichtigung(String nachricht){
        dienst.sende(nachricht);
    }
}
