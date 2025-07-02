package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Handlers {
    public static void main(String[] args) {
        // try(InputStreamReader isr=new InputStreamReader(System.in)){
        //     System.out.println("enter letter:");
        //     int letters=isr.read();
        //     while (isr.ready()) {
        //         System.out.println((char) letters);
        //         letters=isr.read();
        //     }
        //     System.out.println(); //no need to write isr.close becoz catch automatically does it
        // }
        // catch (IOException e) {
        //     // TODO: handle exception
        //     System.out.println(e.getMessage());
        // }

        // try (FileReader fr = new FileReader("notes.txt")) {
        // int letters = fr.read();
        // while(letters!=-1) {
        //     System.out.println((char)letters);
        //     letters = fr.read();
        // }
        // // fr.close();
        //     System.out.println();
        // } 
        // catch (IOException e) {
        //     System.out.println(e.getMessage());      
        // }

        // //byte to char stream and then reading it we use BufferedReader
        // try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
        //     System.out.println("you typed"+br.readLine());
        // } 
        // catch (IOException e) {
        //     System.out.println(e.getMessage());      
        // }

        // try(BufferedReader br=new BufferedReader(new FileReader("notes.txt"))){
        //     while (br.ready()) {
        //         System.out.println(br.readLine());;
        //     }
        // } 
        // catch (IOException e) {
        //     System.out.println(e.getMessage());      
        // }

        //output
        OutputStream os=System.out;
        // os.write(😆); range exceeds

        System.out.println();

        // try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
        //     osw.write("Hello World");
        //     osw.write(97);
        //     osw.write(10);
        //     osw.write('A');
        //     osw.write('\n');
        //     char[] arr = "hello world".toCharArray();
        //     osw.write(arr);
        //     // osw.write(😍);
        // } 
        // catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }

        try (FileWriter fw = new FileWriter("notes.txt")) {
            fw.write("Hello World");
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //this helps to append without rewriting
        try (FileWriter fw = new FileWriter("notes.txt",true)) {
            fw.write("this should be appended");
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("notes.txt"))) {
            bw.write("hare krishna");
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
