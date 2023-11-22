/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class HashTable {
    private Nodo<User>[] HashTable;
    private int size;

    public HashTable(int size) {
        this.size = size;
        HashTable = new Nodo[size];
    }

    private int hash(String user) {
        int hash = 0;
        for (int i = 0; i < user.length(); i++) {
            hash = (hash * 31 + user.charAt(i)) % size;
        }
        return hash;
    }

    public void addUser(User user) {
        int index = hash(user.getUsername());
        Nodo<User> newNode = new Nodo<>(user);

        if (HashTable[index] == null) {
            HashTable[index] = newNode;
        } else {
            Nodo<User> currentNode = HashTable[index];
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
    }

    public User getUser(String username) {
        int index = hash(username);
        Nodo<User> node = HashTable[index];
        while (node != null) {
            if (node.getValue().getUsername().equals(username)) {
                return node.getValue();
            }
            node = node.getNext();
        }
        return null; // User not found
    }

    public void addDocument(String username, Document document) {
        User user = getUser(username);
        if (user != null) {
            user.getDocuments().add(document);
        }
    }

    public LinkedList<Document> getDocuments(String username) {
        User user = getUser(username);
        if (user != null) {
            return user.getDocuments();
        }
        return null; // User not found
    }
    
    public void loadTable(String file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");
                if (datos.length == 3) {
                    String usuario = datos[0].trim();
                    String tipo = datos[1].trim();
                    Document documento = new Document(datos[2].trim(), tipo, 0);
                    User user = getUser(usuario);
                    if (user == null) {
                        user = new User(usuario, tipo);
                        addUser(user);
                    }
                    addDocument(usuario, documento);                    System.out.println(documento);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


    



/**
 *
 * @author emilianaplaz
 */

