/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class HashTable {
    private LinkedList<Document>[] listOfHashTable;
    private int capacity = 20;

    public HashTable() {
        listOfHashTable = new LinkedList[capacity];
    }

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

    public LinkedList get(String key) {
        int index = getIndex(key);
        LinkedList list = listOfHashTable[index];
        if (list != null) {
            return list;
        }
        return null;
    }

    private int getIndex(String key) {
        return Math.abs(key.hashCode() % capacity);
    }
}


    



/**
 *
 * @author emilianaplaz
 */

