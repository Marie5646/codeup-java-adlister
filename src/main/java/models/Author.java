package models;

import java.io.Serializable;

public class Author implements Serializable{

    public int id;
    public String lastName;
    public String firstName;
    public String img;


    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Author(int id, String lastName, String firstName, String img) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.img = img;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



}
