package UTS_3;

public class user extends userProfile {
    public user(int user_id, String password, String name, String age, int email, String doc) {
        super(user_id, password, name, age, email, doc);
    }

    public boolean login(int user_id, String password) {
        if (this.getUser_id() == user_id && this.getPassword().equals(password)) {
            formatOutput.printSuccess("Login Successful.");
            formatOutput.printInfo("Welcome, " + getName());
            return true;
        }
        formatOutput.printError("Login Failed.");
        return false;
    }

    public void recoverPassword() {
        formatOutput.printInfo("Password recovery process initiated.");
    }

    public void logout() {
        formatOutput.printInfo("User logged out.");
    }
}

