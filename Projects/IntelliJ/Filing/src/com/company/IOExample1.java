package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

class MyIO{
    File file;
    public MyIO(String fileName){
        this.file = new File(fileName);
        try {
            if (this.file.createNewFile()){
                System.out.println("New File Created.");
            }else{
                System.out.println("File Already Created.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addRecord(String userName, String password, double amount,char gender, int id){
        try {
            FileWriter fw = new FileWriter(this.file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(userName + "," + password + "," + amount + "," + gender + "," + id);
            pw.flush();
            pw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readRecord(){
        try {
            Scanner scan = new Scanner(this.file);
            scan.useDelimiter("[,\n]");

            while(scan.hasNext()){
                String userName = scan.next();
                String password = scan.next();
                String amount = scan.next();
                char gender = scan.next().charAt(0);
                String id = scan.next();
                System.out.println(userName + " " + password + " " + amount + " " + gender + " " + id);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}


public class IOExample1 {
    public static void main(String[] args) {
        MyIO obj = new MyIO("record.csv");
        obj.addRecord("Rajesh", "Kumar", 12.00D, 'M', 101);
        obj.addRecord("Sumit", "Raja", 1200.00D, 'M', 102);
        obj.addRecord("Arbaz", "Shah", 1000.00D, 'M', 103);
        obj.readRecord();
    }
}
