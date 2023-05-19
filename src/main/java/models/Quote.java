package models;


import java.io.Serializable;

public class Quote implements Serializable {

    public int id;
    public Author author;
    public String content;


    public Quote(int id, Author author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

