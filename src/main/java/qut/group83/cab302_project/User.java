package qut.group83.cab302_project;

import java.util.UUID;

public class User {
    private String passWord;
    private String userName;
    private String userId;

    // Parameterless constructor
    public User() {
    }

    // Constructor
    public User(String passWord, String userName) {
        this.userId = generateUserId(); // Generate a unique user ID
        this.passWord = passWord;
        this.userName = userName;
    }

    // Constructor for existing user (with provided userId)
    public User(String userId, String userName, String passWord) {
        this.userId = userId; // Set existing user ID
        this.passWord = passWord;
        this.userName = userName;
    }

    // Generate a unique user ID using UUID
    private String generateUserId() {
        return UUID.randomUUID().toString(); // Generate a random UUID and convert it to a String
    }

    // Getters
    public String getPassWord() {
        return passWord;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() { return userId; }


    // Setters
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(String userId) { this.userId = userId; }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                "UserName=" + userName + '\'' +
                ", Password='" + passWord + '\'' +
                ']';
    }
}
