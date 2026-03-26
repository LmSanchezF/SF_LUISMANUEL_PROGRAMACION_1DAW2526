package Unidad6;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class ChatLog {

    public static void main(String[] args) {
        
        String mensaje;

        try (
            BufferedWriter bw = new BufferedWriter(new FileWriter("historial.txt", true));
            PrintWriter out = new PrintWriter(bw);
            Scanner teclado = new Scanner(System.in)) { 

            do {
                System.out.println("Introduce un mensaje:");
                mensaje = teclado.nextLine();

                if (!mensaje.equalsIgnoreCase("fin")) {
                    out.println(mensaje);
                    System.out.println("¡Datos guardados en el log!");
                }

            } while (!mensaje.equalsIgnoreCase("fin"));

            System.out.println("Ha escogido salir");

        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }
}
