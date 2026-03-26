package Unidad6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaInversa {

    public static void main(String[] args) {

        try (
             BufferedReader br = new BufferedReader(new FileReader("lectura.txt"))) {

            String linea;

            
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }
}
