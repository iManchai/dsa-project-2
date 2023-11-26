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
    
    /**
     * Atributos de documento
     * @field name: nombre del documento
     * @field documentType: tipo de documento (Pdf, World, etc)
     * @field size: Tamaño del documento
     * @field timeSendToPriorityQueue: tiempo en ms desde UTC del documento
     * @field isInPQ: booleano de si esta en la cola de prioridad.
     */
    
    private String name;
    private String documentType;
    private int size;
    private long timeSendToPriorityQueue;
    private boolean isInPQ;

    /**
     * Constructor de la instancia documento
     * @param name
     * @param document_type
     * @param size 
     */
    public Document(String name, String document_type, int size) {
        this.name = name;
        this.documentType = document_type;
        this.size = size;
        this.isInPQ = false;
    }

    /**
     * Getter de name
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter del tipo de documento
     * @return String tipo de documento
     */
    public String getDocument_type() {
        return documentType;
    }

    /**
     * Getter de tamaño
     * @return int tamaño
     */
    public int getSize() {
        return size;
    }

    /**
     * Getter del tiempo de envio a la cola
     * @return long tiempo de envio a la cola
     */
    public long getTimeSendToPriorityQueue() {
        return timeSendToPriorityQueue;
    }

    /**
     * Setter del tiempo enviado a la cola
     * @param timeSendToPriorityQueue 
     */
    public void setTimeSendToPriorityQueue(long timeSendToPriorityQueue) {
        this.timeSendToPriorityQueue = timeSendToPriorityQueue;
    }

    /**
     * Getter de si esta en cola
     * @return boolean esta en cola de prioridad
     */
    public boolean isIsInPQ() {
        return isInPQ;
    }

    /**
     * Setter de si esta en la cola de prioridad
     * @param isInPQ 
     */
    public void setIsInPQ(boolean isInPQ) {
        this.isInPQ = isInPQ;
    }
    
    
    
}
