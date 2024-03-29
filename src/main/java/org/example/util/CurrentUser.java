package org.example.util;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component("currentUser")
@SessionScope
public class CurrentUser {
    private String firstName;
    private String lastName;
    private boolean isLogged;


    public String getFirstName() {
        return firstName;
    }

    public CurrentUser setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public CurrentUser setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public boolean isLogged() {
        return isLogged;
    }

    public CurrentUser setLogged(boolean logged) {
        isLogged = logged;
        return this;
    }

    public String getFullName() {
        StringBuilder builder = new StringBuilder();
        if (firstName != null){
            builder.append(firstName);
        }
        if (lastName != null){
            if (!builder.isEmpty()){
                builder.append(" ");
            }
            builder.append(lastName);
        }
        return builder.toString();
    }

    public void logOut() {
        setFirstName(null);
        setLastName(null);
        setLogged(false);
    }

    @Override
    public String toString() {
        return "CurrentUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isLogged=" + isLogged +
                '}';
    }
}
