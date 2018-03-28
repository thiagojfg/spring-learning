package br.com.softsquare.model;

import br.com.softsquare.jsonview.Views;
import com.fasterxml.jackson.annotation.JsonView;

public class User {

    @JsonView(Views.Public.class)
    private String username;

    private String password;

    @JsonView(Views.Public.class)
    private String email;

    @JsonView(Views.Public.class)
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
