package template;

public class TestingObjectOrientedProgramming1b
{
    enum Signal {

        RED("STOP"), GREEN("GO");
        private String action;
        public String getAction() {
            return this.action;
        }
        private Signal(String action) {
            this.action = action;
        }
    }

    public static void main(String[] args) {

        Signal[] signals = Signal.values();
        for (Signal signal : signals) {
            if (Signal.GREEN.name().equals("GREEN")) {
                System.out.print(String.format("%s heißt: %s! ", signal.name(), signal.getAction()));
            }
        }
    }

}
