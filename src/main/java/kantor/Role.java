package kantor;

public enum Role {
    ADMIN("Admin"), USER("User");
    String roleUser;

    Role(String roleUser) {
        this.roleUser = roleUser;
    }

    public String getRoleUser() {
        return roleUser;
    }
}
