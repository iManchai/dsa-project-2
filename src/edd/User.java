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
    /**
     * Atributos de la clase usuario
     * @field username: nombre de usuario
     * @field type: prioridad del usuario
     * @field documents: lista de documentos creados por el usuario
     */
    private String username;
    private String type;
    private LinkedList<Document> documents;

    /**
     * Constructor de la instancia usuario
     * @param username
     * @param type 
     */
    public User(String username, String type) {
        this.username = username;
        this.type = type;
        this.documents = new LinkedList<Document>();
    }
    
    /**
     * Getter del nombre de usuario
     * @return String username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Getter del tipo de usuario
     * @return String prioridad del usuario
     */
    public String getType() {
        return type;
    }

    /**
     * Getter de la lista de documentos del usuario
     * @return LinkedList lista de documentos
     */
    public LinkedList<Document> getDocuments() {
        return documents;
    }
    
    
}
