package com.company;

import java.io.*;

public class Main {

    private static File createFile(){
        File myFile = new File("file.txt");

        try {
            if (myFile.createNewFile()){
                System.out.println("File Created");
            }
            else{
                System.out.println("File Already Available");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myFile;
    }

    private static void writeFile(File myFile){
        try {
            FileWriter fw = new FileWriter(myFile);
            fw.write("This is my test for IO Operation");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile(File myFile){
        try {
            FileReader fr = new FileReader(myFile);
            // -1 comes at the EndOfFile
            int i;
            while((i = fr.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void appendFile(File myFile, String s){
        try {
            FileWriter fa = new FileWriter(myFile, true);
            fa.write(s);
            fa.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
	// write your code here
        File obj = createFile();
        writeFile(obj);
        readFile(obj);
        System.out.println();
        appendFile(obj,"\nMariam Yusra 1000 IMCS");
        appendFile(obj,"\nAyesha Memon 5000 IMCS");
        readFile(obj);
    }
}

