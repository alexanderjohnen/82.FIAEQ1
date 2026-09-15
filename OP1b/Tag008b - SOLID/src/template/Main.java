package template;

import template.Refactored.SOLID.dip.BenachrichtungsService;
import template.Refactored.SOLID.dip.EmailService;
import template.Refactored.SOLID.dip.IBenachrichtigungsDienst;
import template.Refactored.SOLID.dip.SMSService;
import template.Refactored.SOLID.isp.Hund;
import template.Refactored.SOLID.lsp.Pinguin;
import template.Refactored.SOLID.lsp.Spatz;
import template.Refactored.SOLID.lsp.Vogel;
import template.Refactored.SOLID.ocp.Form;
import template.Refactored.SOLID.ocp.Kreis;
import template.Refactored.SOLID.ocp.Rechteck;
import template.Refactored.SOLID.srp.RechnungsDrucker;
import template.Refactored.SOLID.srp.RechnungsRechner;

public class Main {
    public static void main(String[] args) {
        // SRP
        RechnungsRechner rechner = new RechnungsRechner(123);
        new RechnungsDrucker(rechner).druckeRechnung();

        // OCP
        Form rechteck = new Rechteck(5.0,3.3);
        Form kreis = new Kreis(4.0);
        System.out.println("Umfang des Rechtecks: " + rechteck.berechneUmfang());
        System.out.println("Umfang des Kreises: " + kreis.berechneUmfang());

        //LSP
        Vogel spatz = new Spatz();
        Vogel pinguin =  new Pinguin();
        spatz.bewegen();
        pinguin.bewegen();

        Hund hund = new Hund();
        hund.laufen();
        hund.schwimmen();

        //DIP
        IBenachrichtigungsDienst emailService = new EmailService();
        IBenachrichtigungsDienst smsService = new SMSService();

        BenachrichtungsService service = new BenachrichtungsService(emailService);
        service.sendeBenachrichtigung("Hallo hier meine nachricht per E-Mail.......");          // Sende Email....

        service = new BenachrichtungsService(smsService);
        service.sendeBenachrichtigung("Hallo hier kommt meine versprochene SMS .....!!!!");     // Sende SMS:....
    }

}



//S – Single Responsibility Principle   → eine Klasse, eine Aufgabe
//O – Open/Closed Principle             → offen für Erweiterung, zu für Änderung
//L – Liskov Substitution Principle     → Unterklasse muss Oberklasse ersetzen können
//I – Interface Segregation Principle   → viele kleine statt ein großes Interface
//D – Dependency Inversion Principle    → gegen Abstraktion, nicht gegen Details