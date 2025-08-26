public class RelationshipCalculator {

    public int calculate(String name1, String name2) {
        name1 = name1.toLowerCase().replaceAll("\\s+", "");
        name2 = name2.toLowerCase().replaceAll("\\s+", "");

        StringBuilder sb1 = new StringBuilder(name1);
        StringBuilder sb2 = new StringBuilder(name2);

        for (int i = 0; i < sb1.length(); i++) {
            for (int j = 0; j < sb2.length(); j++) {
                if (sb1.charAt(i) == sb2.charAt(j)) {
                    sb1.deleteCharAt(i);
                    sb2.deleteCharAt(j);
                    i--;
                    break;
                }
            }
        }
        return sb1.length() + sb2.length();
    }
}