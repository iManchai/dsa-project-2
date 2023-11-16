/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author manch
 */
public class LinkedList<T> {
    /**
     * Atributos de la lista enlazada
     * @field head: nodo cabeza
     * @field tail: nodo cola
     * @field size: Tamaño de la lista
     */
    private Nodo<T> head;
    private Nodo<T> tail;
    private int size;
    
    /**
     * Constructor de la lista enlazada
     */
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Getter del nodo cabeza
     * @return Nodo cabeza
     */
    public Nodo<T> getHead() {
        return head;
    }

    /**
     * Setter del nodo cabeza
     * @param head Nodo
     */
    public void setHead(Nodo<T> head) {
        this.head = head;
    }

    /**
     * Getter del nodo cola
     * @return Nodo cola
     */
    public Nodo<T> getTail() {
        return tail;
    }

    /**
     * Setter del nodo cola
     * @param tail Nodo
     */
    public void setTail(Nodo<T> tail) {
        this.tail = tail;
    }

    /**
     * Getter del tamaño de la lista
     * @return Integer del tamaño de la lista
     */
    public int getSize() {
        return size;
    }
    
    /**
     * Funcion primitiva de si está vacía o no la lista
     * @return Booleano dependiendo si la lista es vacía
     */
    public boolean isEmpty() {
        return this.head == null;
    }
    
    /**
     * Método añadir nuevo nodo a lista
     * @param info Información del nodo
     */
    public void add(T info) {
        if (this.isEmpty()) {
            Nodo newNode = new Nodo(info);
            this.head = newNode;
            this.tail = newNode;
            this.size++;
        } else {
            Nodo newNode = new Nodo(info);
            Nodo currentTail = this.tail;
            currentTail.setNext(newNode);
            this.tail = newNode;
            this.size++;
        }
    }
    
    /**
     * Método para imprimir la lista
     */
    public void print() {
    Nodo current = head;
  
    while(current != null) {
      System.out.print(current.getValue() + " -> ");  
      current = current.getNext();
    }
    
    System.out.println("null");
  }

    
    /**
     * Método obtener según el índice
     * @param index Número entero del índice donde quieres obtener la información
     * @return La información del Nodo
     */
    public T get(int index) {
    if (this.isEmpty()) {
        throw new IndexOutOfBoundsException("This list is empty");
    } else {
        int auxIndex = 0;
        Nodo<T> auxNode = this.head;
        while (auxIndex != index) {
            if (auxNode.getNext() == null) {
                throw new IndexOutOfBoundsException("Index not found " + index);
            } else {
                auxNode = auxNode.getNext();
                auxIndex++;
            }
        }
        return auxNode.getValue();
        }
    }
    
    /**
     * Método remover primer nodo con la información dada
     * @param data Data a buscar del Nodo.
     */
    public void remove(Object data) {
        Nodo current = this.head;
        Nodo previous = null;
        
        while (current != null && current.getValue() != data) {
            previous = current;
            current = current.getNext();
        }
        
        if (current == null) {
            return;
        }
        
        if (previous == null) {
            head = head.getNext();
        } else {
            previous.setNext(current.getNext());
        }
        this.size--;
    } 
}
