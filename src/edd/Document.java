/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author manch
 */
public class Document {
    
    private String name;
    private String document_type;
    private int size;

    public Document(String name, String document_type, int size) {
        this.name = name;
        this.document_type = document_type;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getDocument_type() {
        return document_type;
    }

    public int getSize() {
        return size;
    }
    
    
    
    
}
