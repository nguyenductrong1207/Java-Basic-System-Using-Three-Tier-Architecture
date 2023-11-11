package entity;

import java.util.ArrayList;
import java.util.List;

public abstract class User {

	private int userID;
	private String firstName;
	private String lastName;
	private String email;
	private String password;

	public User(int userID, String firstName, String lastName, String email, String password) {
		super();
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{" + "userID='" + userID + '\'' + ", firstName='" + firstName + '\'' + ", lastName='" + lastName
				+ '\'' + ", email='" + email + '\'' + ", password='" + password + '\'' + '}';
	}
}


class manageUser extends User{
	private List<User> users;		

	

	public manageUser(int userID, String firstName, String lastName, String email, String password, List<User> users) {
		super(userID, firstName, lastName, email, password);
		this.users = users;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public void Register(int userID, String firstName, String lastName, String email, String password) {
		User newUser = new User(userID, firstName, lastName, email, password);
        users.add(newUser);
        System.out.println("User registered successfully: " + newUser);	
	}

	public User Login(String email, String password) {
		for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                System.out.println("User logged in successfully: " + user);
                return user;
            }
        }
        System.out.println("Login failed. User not found or invalid credentials.");
        return null;
	}
	
    private User findUser(int userID) {
        for (User user : users) {
            if (user.getUserID() == (userID)) {
                return user;
            }
        }
        return null;
    }

	public void UpdateProfile(User user, String newFirstName, String newLastName) {
		user = findUser(user.getUserID());
        if (user != null) {
        	users.setFisrtName(getUserID(), user)
            users.setLastName(newLastName);
            System.out.println("User profile updated successfully: " + user);
        } else {
            System.out.println("User not found. Update profile failed.");
        }
	}

	public void ResetPassword(User users, String newPassword) {
		users = findUser(users.getUserID());
        if (users != null) {
        	
            users = new User(users.getUserID(), users.getFirstName(), users.getLastName(), users.getEmail(), newPassword);
            System.out.println("Password reset successful for user: " + users);
        } else {
            System.out.println("User not found. Password reset failed.");
        }
	}

}
