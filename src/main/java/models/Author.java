package models;

import java.io.Serializable;

public class Author extends Quote implements Serializable{

    public int id;
    public String lastName;
    public String firstName;

    public String content;




    public Author(int id, String lastName, String firstName, String content) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void quote() {

    }
}
