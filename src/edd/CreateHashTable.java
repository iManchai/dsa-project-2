/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author emilianaplaz
 */
public class CreateHashTable {
    public void createHashtable() {
        String csvFile = "src/prueba/users.csv";
        String line;
        String cvsSplitBy = ",";

        // Create the hashtable
        Object[][][] hashtable = new Object[100][100][100];

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // skip the first line (header)
            br.readLine();

            int i = 0, j = 0, k = 0;
            while ((line = br.readLine()) != null && i < 100) {
                String[] data = line.split(cvsSplitBy);

                String user = data[0].trim();
                String type = data[1].trim();

                // Create and populate the documents array
                Document[] documents = new Document[2];
                documents[0] = new Document("pdf", "imprimir.pdf", 1024);
                documents[1] = new Document("docx", "contrato.docx", 2048);

                // Store the user, type, and documents in the hashtable
                hashtable[i][j][k] = new Object[]{user, type, documents};

                // Move to the next slot in the array
                k++;
                if (k == 100) {
                    k = 0;
                    j++;
                    if (j == 100) {
                        j = 0;
                        i++;
                    }
                }
            }

            // Print the hashtable
            for (i = 0; i < 100; i++) {
                for (j = 0; j < 100; j++) {
                    for (k = 0; k < 100; k++) {
                        if (hashtable[i][j][k] != null) {
                            Object[] data = (Object[]) hashtable[i][j][k];
                            String user = (String) data[0];
                            String type = (String) data[1];
                            Document[] docs = (Document[]) data[2];

                            System.out.println("Usuario: " + user + ", Tipo: " + type);
                            for (Document doc : docs) {
                                System.out.println("Documento: " + doc.getName() + ", File: " + doc.getDocument_type() + ", Tamaño: " + doc.getSize());
                            }
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
