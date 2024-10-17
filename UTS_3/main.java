package UTS_3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Header
        formatOutput.printHeader("User  Management");

        // Create user
        formatOutput.printSubHeader("User  Creation");
        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter document type (jpg/png/pdf): ");
        String doc = scanner.nextLine();

        userProfile userProfile = new userProfile(userId, password, name, email, age, doc);
        user user = new user(userId, password, name, email, age, doc);
        customer customer = new customer(userId, password, name, age, email, doc);
        admin admin = new admin();
        formatOutput.printSuccess("User  Created Successfully.");

        // User Login
        formatOutput.printSubHeader("User  Login");
        System.out.print("Enter user ID to login: ");
        int loginId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter password to login: ");
        String loginPassword = scanner.nextLine();
        user.login(loginId, loginPassword);
        user.logout();

        // Password Recovery
        formatOutput.printSubHeader("Password Recovery");
        user.recoverPassword();

        // Customer Verification Process
        formatOutput.printSubHeader("Customer Verification Process");
        System.out.print("Enter document name for verification: ");
        String verificationDoc = scanner.nextLine();
        customer.applyVerification(verificationDoc);
        formatOutput.printInfo("Customer verification status: " + customer.getVerificationStatus());

        // Admin Verification Process
        formatOutput.printSubHeader("Admin Verification Process");
        admin.verifyuser(customer);
        formatOutput.printInfo(
                "Customer verification status after admin verification: " + customer.getVerificationStatus());

        // User Profile Management
        formatOutput.printSubHeader("User  Profile Management");
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new age: ");
        int newAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new email: ");
        String newEmail = scanner.nextLine();
        userProfile.editProfile(newName, newEmail, newAge);
        userProfile.showDocuments();

        // Vehicle Management
        formatOutput.printSubHeader("Vehicle Management");
        System.out.print("Enter vehicle ID: ");
        int vehicleId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter vehicle details: ");
        String vehicleDetails = scanner.nextLine();
        admin.updateVehicleDetails(vehicleId, vehicleDetails);

        formatOutput.printHeader("End Program");

        scanner.close();
    }
}