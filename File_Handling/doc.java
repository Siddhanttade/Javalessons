package File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class doc {
    public static void main(String[] args) {
        //create file
        try {
            File fo=new File("txt.msg");
            fo.createNewFile();
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }


        //writing in file
        try (FileWriter fw = new FileWriter("txt.msg")) {
            fw.write("सर्वे भवन्तु सुखिनः,\r\n" + //
                                "सर्वे सन्तु निरामयाः।\r\n" + //
                                "सर्वे भद्राणि पश्यन्तु,\r\n" + //
                                "मा कश्चिद्दुःखभाग्भवेत्॥");
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // reading from a file
        try (BufferedReader br = new BufferedReader(new FileReader("txt.msg"))) {
        while (br.ready()) {
            System.out.println(br.readLine());
        }
        } catch (IOException e) {
            System.out.println(e.getMessage());      
        }

        // create
        try {
        File fo = new File("random.txt");
        fo.createNewFile();
        if(fo.delete()) {
            System.out.println(fo.getName());
        }
        } catch (IOException e) {
        System.out.println(e.getMessage());
        }

    }
}
