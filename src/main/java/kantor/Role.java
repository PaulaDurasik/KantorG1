package kantor;

public enum Role {
    ADMIN("Admin"), USER("User");

    String roleName;

    Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
