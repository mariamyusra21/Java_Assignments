package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

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

    private int PowerOfSeries(int base,int power){
        return base;
    }

    public void generateSeries(int base,int power, int upToTimes){
        try {
            FileWriter fw = new FileWriter(this.file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(base + "," + power + "," + upToTimes);

            pw.flush();
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readSeries(){
        try {
            Scanner scan = new Scanner(this.file);
            scan.useDelimiter("[, \n]");

            while(scan.hasNext()){
                String base = scan.next();
                String power = scan.next();
                String upToTimes = scan.next();

                System.out.println(base + " " + power + " " + upToTimes);
            }
            scan.close();

        } catch (Exception e) {
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
    s.readSeries();
    }
}
