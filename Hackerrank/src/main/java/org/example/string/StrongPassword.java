package org.example.string;

public class StrongPassword {
    public static void main(String[] args) {
        System.out.println(StrongPassword.minimumNumber(3, "Ab1"));
    }

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int validCount = 4;
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_character = "!@#$%^&*()-+";

        boolean hasNumber = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (numbers.indexOf(c) != -1 && hasNumber == false) {
                hasNumber = true;
                validCount--;
            }
            else if (lower_case.indexOf(c) != -1 && hasLowerCase == false) {
                hasLowerCase = true;
                validCount--;
            }
            else if (upper_case.indexOf(c) != -1 && hasUpperCase == false) {
                hasUpperCase = true;
                validCount--;
            }
            else if (special_character.indexOf(c) != -1 && hasSpecialChar == false) {
                hasSpecialChar = true;
                validCount--;
            }
        }

        return Math.max(6-password.length(), validCount);
    }
}
