/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class HashTable {
    private Entry[] users;
    private int capacity = 16;

    public HashTable() {
        users = new Entry[capacity];
    }

    public void put(String key, Object value) {
        int index = getIndex(key);
        Entry entry = users[index];
        if (entry == null) {
            entry = new Entry(key, value);
            users[index] = entry;
        } else {
            while (entry.next != null) {
                entry = entry.next;
            }
            entry.next = new Entry(key, value);
        }
    }

    public Object get(String key) {
        int index = getIndex(key);
        Entry entry = users[index];
        while (entry != null) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
            entry = entry.next;
        }
        return null;
    }

    private int getIndex(String key) {
        return Math.abs(key.hashCode() % capacity);
    }

    private class Entry {
        public String key;
        public Object value;
        public Entry next;

        public Entry(String key, Object value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}


    



/**
 *
 * @author emilianaplaz
 */

