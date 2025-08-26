public class FLAMESGame extends Game {

    private RelationshipCalculator calculator = new RelationshipCalculator();
    private String finalChar = "";

    @Override
    public String play(String name1, String name2) {
        int count = calculator.calculate(name1, name2);
        String flames = "FLAMES";
        StringBuilder sb = new StringBuilder(flames);

        int index = 0;
        while (sb.length() > 1) {
            index = (index + count - 1) % sb.length();
            sb.deleteCharAt(index);
        }
        finalChar = sb.toString();
        return finalChar;
    }

    @Override
    public String displayResult(String resultChar) {
        switch (resultChar) {
            case "F": return "Friends";
            case "L": return "Lovers";
            case "A": return "Affectionate";
            case "M": return "Marriage";
            case "E": return "Enemies";
            case "S": return "Siblings";
            default: return "Unknown";
        }
    }
}