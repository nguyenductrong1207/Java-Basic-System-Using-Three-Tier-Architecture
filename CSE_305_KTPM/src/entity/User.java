package entity;

public abstract class User {
    // Attributes
    protected int UserID;
    protected String FirstName;
    protected String LastName;
    protected String Email;
    protected String Password;

    // Constructor
    public User(UserParameter parameterUser) {
        this.UserID = parameterUser.getUserID();
        this.FirstName = parameterUser.getFirstName();
        this.LastName = parameterUser.getLastName();
        this.Email = parameterUser.getEmail();
        this.Password = parameterUser.getPassword();
    }

    // Abstract methods
    public abstract void register(int id, String firstName, String lastName, String email, String password);
    public abstract void login(String email, String password);
    public abstract void updateProfile(int id, String firstName, String lastname, String email, String password);
    public abstract void resetPassword(int id, String password);
}
