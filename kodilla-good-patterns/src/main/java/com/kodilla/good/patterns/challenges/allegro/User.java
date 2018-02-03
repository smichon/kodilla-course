package com.kodilla.good.patterns.challenges.allegro;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String loginName;
    private String firstName;
    private String lastName;
    private String userID;
    private List<User> usersList = new ArrayList<>();

    public User(String loginName, String firstName, String lastName, String userID) {
        this.loginName = loginName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userID;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserID() {
        return userID;
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public void addUser(User user) {
        usersList.add(user);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!loginName.equals(user.loginName)) return false;
        if (!lastName.equals(user.lastName)) return false;
        return userID.equals(user.userID);
    }

    @Override
    public int hashCode() {
        int result = loginName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + userID.hashCode();
        return result;
    }
}
