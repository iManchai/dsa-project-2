/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class HashTable {
    
    /**
     * Atributos del Hash Table
     * @field listOfHashTable: Arreglo de listas enlazadas de documentos
     * @field capacity: Capacidad del arreglo
     */
    private LinkedList<Document>[] listOfHashTable;
    private int capacity = 20;

    public HashTable() {
        listOfHashTable = new LinkedList[capacity];
    }

    /**
     * Metodo de añadir/modificar la HashTable
     * @param key
     * @param value 
     */
    public void put(String key, Document value) {
        int index = getIndex(key);
        LinkedList<Document> docList = listOfHashTable[index];
        if (docList == null) {
            docList = new LinkedList();
            docList.add(value);
            listOfHashTable[index] = docList;
        } else {
            docList.add(value);
        }
    }

    /**
     * Obtener la data a traves del usuario (key)
     * @param key
     * @return LinkedList 
     */
    public LinkedList get(String key) {
        int index = getIndex(key);
        LinkedList list = listOfHashTable[index];
        if (list != null) {
            return list;
        }
        return null;
    }

    /**
     * Funcion de Hash para acceder al indice del usuario deseado
     * @param key
     * @return int indice
     */
    private int getIndex(String key) {
        return Math.abs(key.hashCode() % capacity);
    }
}


    



/**
 *
 * @author emilianaplaz
 */

