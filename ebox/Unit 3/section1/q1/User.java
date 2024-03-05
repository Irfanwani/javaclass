public class User {
    private String name;
    private String username;
    private String password;
    private ContactDetail contactDetail;

    public User(String name, ContactDetail contactDetail,String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.contactDetail = contactDetail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setContactDetail(ContactDetail contactDetail) {
        this.contactDetail = contactDetail;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public ContactDetail getContactDetail() {
        return contactDetail;
    }

    @Override
    public String toString() {
        return "Name:" + name + "\nUsername:" + username + "Password:" + password + "\nContact detail:\n" + contactDetail;
    }
}
