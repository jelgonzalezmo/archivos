/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author Estudiante
 */
public class Archivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        /*File f =new File("arc.txt");
        System.out.println("exist returns" + f.exists());
        System.out.println("cabRead return" +f.canRead());     
         System.out.println("lengh return" +f.length());
         System.out.println("getabsolutePath return" + f.getAbsolutePath());
         */
        PrintStream output = new PrintStream(new File("arc.txt"));
        output.println("hello world");
        output.println();
        output.println("este programa produce cuatro");
        output.println("lineas de salida ");

    }
}


