package entity;

public abstract class User {
    // Attributes
    protected int UserID;
    protected String FirstName;
    protected String LastName;
    protected String Email;
    protected String Password;

    // Constructor
    public User(int userID, String firstName, String lastName, String email, String password) {
        this.UserID = userID;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Email = email;
        this.Password = password;
    }

    // Abstract methods
    public abstract void register();
    public abstract void login();
    public abstract void updateProfile();
    public abstract void resetPassword();
}
