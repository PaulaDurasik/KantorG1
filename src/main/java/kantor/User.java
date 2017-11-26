package kantor;

public class User {

    String login;

    String pass;

    Role role;

    public User(String login, String pass, Role role) {
        this.login = login;
        this.pass = pass;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public Role getRole() {
        return role;
    }
}
