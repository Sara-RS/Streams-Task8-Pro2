
package com.mycompany.tarea8pro2;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
        
public class Tarea8pro2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        
        System.out.print("Ingresa nombres (separados por comas): ");
        String nombres = leer.nextLine();
        
        String nombresConGuiones = nombres.replace(",", "-");
        
        try (FileWriter writer = new FileWriter("Tarea8_Nombres.txt")) {
            writer.write(nombresConGuiones);
            System.out.println("Nombres guardados correctamente en el archivo: 'Tarea8_Nombres.txt' ");
        } catch (IOException e) {
            System.out.println("Error al guardar los nombres en el archivo ");
            e.printStackTrace();
        }

    }
}
