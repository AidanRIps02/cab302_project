package qut.group83.cab302_project;

public class User {
    private String passWord;
    private String userName;

    // Constructor
    public User(String passWord, String userName) {
        this.passWord = passWord;
        this.userName = userName;
    }

    // Getters
    public String getPassWord() {
        return passWord;
    }

    public String getUserName() {
        return userName;
    }

    // Setters
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserName=" + userName +
                ", Password='" + passWord + '\'' +
                ']';
    }
}
