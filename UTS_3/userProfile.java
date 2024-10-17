package UTS_3;

public class userProfile {
    private int user_id;
    private String password;
    private String name;
    private String age;
    private int email_id;
    private String doc;

    public userProfile(int user_id, String password, String name, String age, int email, String doc) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email;
        this.doc = doc;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public int getEmail() {
        return email_id;
    }

    public void editProfile(String name, String newAge, int newEmail) {
        this.name = name;
        this.age = newAge;
        this.email_id = newEmail;
        formatOutput.printSuccess("Profile Updated Successfully.");
    }

    public void showDocuments() {
        if (doc != null) {
            formatOutput.printInfo("Document: " + doc);
        } else {
            formatOutput.printInfo("No document found.");
        }
    }
}

