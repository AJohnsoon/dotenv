package src.com.env;

import src.com.env.utils.Dotenv;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static final String path = "docfiles\\docIn.txt";

    public static void main(String[] args){
        Dotenv dotenv = new Dotenv();
        String env = dotenv.LocalEnvironment("projectPath", path);

        File file = new File(env).getAbsoluteFile();
        Scanner scan;
        try{
            scan = new Scanner(file);
            while (scan.hasNext()){
                System.out.println(scan.nextLine());
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
