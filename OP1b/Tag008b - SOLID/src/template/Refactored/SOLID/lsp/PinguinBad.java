package template.Refactored.SOLID.lsp;

// Flascher weg Verstoß gegen L

class VogelBad{
    public void fliegen(){
        System.out.println("Fliegt");
    }
}
public class PinguinBad extends VogelBad{
    @Override
    public void fliegen() {
        throw new UnsupportedOperationException("Pinguine fliegen nicht!");
    }
}
