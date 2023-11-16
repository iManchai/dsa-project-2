/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author manch
 */
public class User {
    private String username;
    private String type;
    private LinkedList<Document> documents;

    public User(String username, String type) {
        this.username = username;
        this.type = type;
        this.documents = new LinkedList<Document>();
    }
    
    public String getUsername() {
        return username;
    }

    public String getType() {
        return type;
    }

    public LinkedList<Document> getDocuments() {
        return documents;
    }
    
    
}
