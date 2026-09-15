package template.Refactored.SOLID.dip;

public class EmailSeviceBad {
    public void sendeEmail(String m){
        System.out.println("E-mail: "+ m);
    }
}

class BenachrichtigungBad{
    private EmailSeviceBad email = new EmailSeviceBad();        // Feste Verdrahtung!
    public void sende(String m ){
        email.sendeEmail(m);
    }
}
