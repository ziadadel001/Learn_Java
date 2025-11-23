package Project_1;

import java.util.Scanner;

public class Login {

    public static void run() {

        String[] usernames = {"ziad", "adel", "gomaa"};
        String[] passwords = {"123", "111", "222"};

        try (Scanner scanner = new Scanner(System.in)) {

            int loginAttempts = 0; // 3 attempts for full login

            while (loginAttempts < 3) {

                // --- Name input ---
                String name = "";
                int nameAttempts = 0;

                while (nameAttempts < 3) {
                    System.out.println("Please enter your username:");
                    name = scanner.nextLine().trim();

                    if (!name.isEmpty()) break;
                    nameAttempts++;
                    System.out.println("Name is empty. Attempts left: " + (3 - nameAttempts));
                }

                if (nameAttempts == 3) {
                    System.out.println("Too many failed username attempts.");
                    loginAttempts++;
                    continue; // retry full login
                }

                // --- Password input ---
                String passwordInput = "";
                int passwordAttempts = 0;

                while (passwordAttempts < 3) {
                    System.out.println("Please enter your password:");
                    passwordInput = scanner.nextLine().trim();

                    if (!passwordInput.isEmpty()) break;
                    passwordAttempts++;
                    System.out.println("Password is empty. Attempts left: " + (3 - passwordAttempts));
                }

                if (passwordAttempts == 3) {
                    System.out.println("Too many failed password attempts.");
                    loginAttempts++;
                    continue; // retry full login
                }

                // --- Verify credentials ---
                boolean loggedIn = false;
                for (int i = 0; i < usernames.length; i++) {
                    if (usernames[i].equals(name) && passwords[i].equals(passwordInput)) {
                        loggedIn = true;
                        break;
                    }
                }

                if (loggedIn) {
                    System.out.println("Login successful! Welcome " + name + "!");
                    return;
                } else {
                    loginAttempts++;
                    System.out.println("Incorrect username or password. Attempts left: " + (3 - loginAttempts));
                }
            }

            System.out.println("You used all attempts. Try again later.");
        }
    }
}
