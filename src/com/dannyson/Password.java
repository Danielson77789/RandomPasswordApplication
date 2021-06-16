package com.dannyson;

import java.util.Scanner;

public class Password {

    private String username;
    private String purpose;
    private int passwordLength;
    private int DEFAULT_PASSWORD_LENGTH = 10;
    private String password;

    Scanner in = new Scanner(System.in);

    public Password() {

        this.username = username;
        this.purpose = purpose;
        this.passwordLength = passwordLength;

        // Set users credentials

        purpose = takeUserPurpose();
        username = takeUsername();

        // Set password length

        passwordLength = setPassLength();

        // Set password

        password = generatePassword(passwordLength);
        System.out.println(password);

    }

    // Ask the user for username and login purposes.

    private String takeUsername() {

        System.out.print("Please enter username: ");
        String username = in.next();

        return username;

    }

    private String takeUserPurpose() {

        System.out.print("Please enter reason for credentials: ");
        String purpose = in.nextLine();

        return purpose;

    }

    // Ask user for requested password length

    private int setPassLength() {

        System.out.println("Enter desired password length: ");
        int passLength = in.nextInt();

        if (passLength > 0)
            return passLength;
        else
            return DEFAULT_PASSWORD_LENGTH;

    }

    // Generate password

    private String generatePassword(int passwordLength) {

        String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYS1234567890#$%";

        char[] password = new char[passwordLength];

        for (int i = 0; i < passwordLength; i++) {
            int rand = (int)(Math.random() * passwordLength);
            password[i] = symbol.charAt(rand);
        }

        return new String(password);

    }


}
