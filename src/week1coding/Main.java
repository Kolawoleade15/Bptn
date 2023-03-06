package week1coding;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("# in:");
    int amt = inp.nextInt();
    inp.nextLine(); //this line is necessary
    System.out.print("word:");
    String word = inp.nextLine();
    //leave the above unedited, write your code below:
   
if (amt==1) {
            System.out.print(amt +" " + word);
        }else if (word.endsWith("fe")){
            System.out.print(amt + " "+ word.substring(0,word.length()-2) + "ves");
        }else if (word.endsWith("ay")||word.endsWith("oy")||word.endsWith("ey")||word.endsWith("uy")){
            System.out.print(amt +" "+ word +"s");
        }else if (word.endsWith("ch")||word.endsWith("sh")) {
            System.out.print(amt + " "+ word + "es");
        }else if (word.endsWith("us")) {
            System.out.print(amt +" "+ word.substring(0,word.length()-2)+ "i");
        } else if(word.endsWith("y")) {
            System.out.print(amt + " "+ word.substring(0,word.length()-1) + "ies");
        }else {
            System.out.print(amt +" " + word +"s");
        }inp.close();
    
  }
}