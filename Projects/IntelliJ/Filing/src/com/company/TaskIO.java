package com.company;

import java.io.*;
import java.util.Scanner;

class Series{
    File file;

    public Series(String myFileName){
        this.file = new File(myFileName);
        try {
            if (this.file.createNewFile()){
                System.out.println("Series File is Created.");
            }else{
                System.out.println("Series File is Already Created.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void generateSeries(int base,int power, int upto){
        try {
            FileWriter fappend = new FileWriter(this.file,true);
            BufferedWriter bwriter = new BufferedWriter(fappend);
            PrintWriter pwriter = new PrintWriter(bwriter);

            pwriter.println(base);

            pwriter.flush();
            pwriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readSeries(){
        try {
            Scanner scan = new Scanner(this.file);
            scan.useDelimiter("[,\n]");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

public class TaskIO {
    public static void main(String[] args) {
    Series s = new Series("Series.csv");
    s.generateSeries(2, 3, 2);
    s.generateSeries(3, 1, 4);
    s.generateSeries(4, 2, 5);
    }
}
