import java.util.Scanner;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;
import java.io.FileWriter;
class TextE{
    static void tulis(){
        try{
        Scanner inp = new Scanner(System.in);
        FileWriter file = new FileWriter("write.txt");
        System.out.print("Text : ");
        file.write(inp.nextLine());
        file.close();    
        System.out.println("Berhasil");
        file.close();    
    }catch(Exception e){
        System.out.print(e.getMessage());
        }
    }
    static void baca(){
        try{
        File file = new File("write.txt");
        Scanner fileReader = new Scanner(file);
        while(fileReader.hasNextLine()){
            System.out.println(fileReader.nextLine());
        }
        fileReader.close();
    }catch(Exception FileNotFoundException){
        System.out.println("File Tidak Ada ");
    }
    }
}
public class TextReaderWriter {
    public static void main(String[] args) {
        int pil;
        Scanner scan = new Scanner(System.in);
        System.out.print("    1. Tulis\n    2. Baca\npilih : ");
        pil = scan.nextInt();
        TextE exe = new TextE();
        switch(pil){
            case 1:
            exe.tulis();
            break;
            case 2:
            exe.baca();
            break;
        }
    }
}
