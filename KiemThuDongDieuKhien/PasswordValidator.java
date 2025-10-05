public class PasswordValidator {
    // Method to validate the password based on given criteria
    public static boolean isValidPassword(String password) {
        if (password == null) {
            return false;
        }

        // Check length
        if (password.length() < 6 || password.length() > 12) {
            return false;
        }

        // Check for at least one uppercase letter
        boolean hasUppercase = password.chars().anyMatch(Character::isUpperCase);
        if (!hasUppercase) {
            return false;
        }

        // Check for at least one digit
        boolean hasDigit = password.chars().anyMatch(Character::isDigit);
        if (!hasDigit) {
            return false;
        }

        // Check for at least one special character
        boolean hasSpecialChar = password.chars().anyMatch(ch -> "!@#$%^&*()-+".indexOf(ch) >= 0);
        if (!hasSpecialChar) {
            return false;
        }

        // Check for spaces
        if (password.contains(" ")) {
            return false;
        }

        return true;
    }
}