package exercises2;

import java.util.Scanner;
public class FileExtension {

    public static void main(String[] args) throws FileExtension.FileExtensionException  {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the file name which ends with  .txt extension");
        
        String fileName = scan.nextLine();
        
        if(!fileName.endsWith(".txt")){
            throw new FileExtensionException("File doesn't have .txt extension");
            
        }
        System.out.println("File name is entered correctly");
            

    }
    public static class FileExtensionException extends Exception{
        public FileExtensionException(String message) {
            super(message);
        }
    }

}