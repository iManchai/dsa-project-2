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
    private String documentType;
    private int size;
    private long timeSendToPriorityQueue;
    private boolean isInPQ;

    public Document(String name, String document_type, int size) {
        this.name = name;
        this.documentType = document_type;
        this.size = size;
        this.isInPQ = false;
    }

    public String getName() {
        return name;
    }

    public String getDocument_type() {
        return documentType;
    }

    public int getSize() {
        return size;
    }

    public long getTimeSendToPriorityQueue() {
        return timeSendToPriorityQueue;
    }

    public void setTimeSendToPriorityQueue(long timeSendToPriorityQueue) {
        this.timeSendToPriorityQueue = timeSendToPriorityQueue;
    }

    public boolean isIsInPQ() {
        return isInPQ;
    }

    public void setIsInPQ(boolean isInPQ) {
        this.isInPQ = isInPQ;
    }
    
    
    
}
