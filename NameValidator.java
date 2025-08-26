public class NameValidator implements Validator {
    @Override
    public boolean validateInput(String name1, String name2) {
        return name1 != null && !name1.trim().isEmpty()
            && name2 != null && !name2.trim().isEmpty();
    }
}