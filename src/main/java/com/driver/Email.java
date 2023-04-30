package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId) {
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword) {
        // Change password only if the oldPassword is equal to current password and the
        // new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from
        // alphabets and digits is a special character

        if (oldPassword.equals(this.password)) {
            if (newPassword.length() >= 8) {
                boolean flagUp = false, flagLo = false, flagDigit = false, flagSpe = false;

                for (int i = 0; i < newPassword.length(); i++) {
                    char ch = newPassword.charAt(i);
                    if (Character.isUpperCase(ch)) {
                        flagUp = true;
                    }

                    if (Character.isLowerCase(ch)) {
                        flagLo = true;
                    }

                    if (Character.isDigit(ch)) {
                        flagDigit = true;
                    }

                    if (!Character.isAlphabetic(ch) && !Character.isDigit(ch) && !Character.isWhitespace(ch)) {
                        flagSpe = true;
                    }
                }

                if (flagUp == true && flagLo == true && flagDigit == true && flagSpe == true) {
                    this.password = newPassword;
                }
            }
        }
    }
}
