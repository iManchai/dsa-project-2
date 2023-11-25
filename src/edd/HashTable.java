/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class HashTable {
    private LinkedList<Entry>[] listOfHashTable;
    private int capacity = 20;

    public HashTable() {
        listOfHashTable = new LinkedList[capacity];
    }

    public void put(String key, Document value) {
        int index = getIndex(key);
        LinkedList<Entry> docList = listOfHashTable[index];
        if (docList == null) {
            docList = new LinkedList();
            docList.add(new Entry(key, value));
            listOfHashTable[index] = docList;
        } else {
            docList.add(new Entry(key, value));
        }
    }

    public Object get(String key) {
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

    private class Entry {
        public String key;
        public Document value;

        public Entry(String key, Document value) {
            this.key = key;
            this.value = value;
        }
    }
}


    



/**
 *
 * @author emilianaplaz
 */

