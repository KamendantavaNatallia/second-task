package by.epam.secondtask.validator;


public class StringValidator {
    private static final String FRUITS_REG = "^(CUCUMBER|TOMATO)\\s*\\d+\\s*\\d+\\s*$";
    private static final String LEAFY_REG = "^(CABBAGE|PARSLEY)\\s*\\d+\\s*\\d+\\s*$";
    private static final String ROOTS_REG = "^(CARROT|BEET)\\s*\\d+\\s*\\d+\\s*$";

    public boolean isValidate(String line) {

        if(line==null || line.isEmpty()) {
            return false;
        }

        String current = line.toUpperCase().trim();
        if(current.matches(FRUITS_REG) || current.matches(LEAFY_REG) || current.matches(ROOTS_REG)) {
            return true;
        }
        else {
            return false;
        }
    }
}