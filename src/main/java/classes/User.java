package classes;

public class User {
    private String userID;
    private String username;
    private String password;


    public User(String userID, String username, String password) {
        this.userID = userID;
        this.username = username;
        this.password = password;

    }

    // Getters and setters
    public String getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public boolean login(String inputPassword) {
        return this.password.equals(inputPassword);
    }


}
