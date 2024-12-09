public class MessangerAuthor {

    private String nickname;
    private String username;
    private int phoneNumber;
    private String password;

    public MessangerAuthor() {}

    public MessangerAuthor(String nickname, String username, int phoneNumber, String password) {
        this.nickname = nickname;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setUsername(String nickname) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNickname() {
        return nickname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPhonenumber() {
        return phoneNumber;
    }

    public void printUserInfo() {
        System.out.println("Nickname: " + nickname);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
