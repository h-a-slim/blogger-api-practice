package org.slim.blog;

public class Blog {
    private String author;
    private String content;

    public Blog(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public Blog() {
        this.author = "";
        this.content = "";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
