import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class IOBank {
    File myRecord;
    private String[] userNames;
    private String[] passwords;
    private float[] amounts;
    int recordCount = 0;

    public static void main(String[] args) {
        IOBank checkObj = new IOBank("myRecord.csv");
         checkObj.addAcount("Ayesha","memon",100.0f);

        System.out.println(Arrays.toString(checkObj.getAmounts()));
        System.out.println(Arrays.toString(checkObj.getPasswords()));
        System.out.println(Arrays.toString(checkObj.getUserNames()));
    }

    public IOBank(String fileName){
        this.myRecord = new File(fileName);
        this.initArray();
//          this.recordCount = initArray();
//        this.userNames = new String[recordCount];
//        this.passwords = new String[recordCount];
//        this.amounts = new float[recordCount];
//        this.readAccount();

    }

    private void initArray() {
        int count = 0;
        try {
            Scanner s = new Scanner(this.myRecord);
            s.useDelimiter("[\n]");
            while(s.hasNext()){
                s.next();
                count++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        if (count == 0){
            System.out.println("No Records Found");
        }
        else if(this.userNames == null){
            this.userNames = new String[count];
            this.passwords = new String[count];
            this.amounts = new float[count];
            this.readAccount();
        }
        else{
            String[] tempUserNames = new String[count];
            String[] tempPasswords = new String[count];
            float[] tempAmounts = new float[count];

            System.arraycopy(this.userNames,0,tempUserNames,0,this.userNames.length);
            System.arraycopy(this.passwords,0,tempPasswords,0,this.passwords.length);
            System.arraycopy(this.amounts,0,tempAmounts,0,this.amounts.length);

            this.userNames = tempUserNames;
            this.passwords = tempPasswords;
            this.amounts =tempAmounts;
            this.readAccount();
        }

        this.recordCount = count;
    }

    public String[] getUserNames() {
        return userNames;
    }

    public void setUserNames(String[] userNames) {
        this.userNames = userNames;
    }

    public String[] getPasswords() {
        return passwords;
    }

    public void setPasswords(String[] passwords) {
        this.passwords = passwords;
    }

    public float[] getAmounts() {
        return amounts;
    }

    public void setAmounts(float[] amounts) {
        this.amounts = amounts;
    }

    public void addAcount(String userName,String password,float amount){
        try{
            FileWriter fw = new FileWriter(myRecord,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            // amount, password, userName
            pw.println(amount + "," + password + "," + userName);
            pw.flush();
            pw.close();
            this.initArray();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void readAccount() {
        try{
            FileReader fr = new FileReader(this.myRecord);
            BufferedReader br = new BufferedReader(fr);
            String line;        // s=Variable to stop at lineEnd.
            int i = 0;
            while((line = br.readLine()) != null) {
                String[] a = line.split(",");
                this.amounts[i] = Float.parseFloat(a[0]);
                this.passwords[i] = a[1];
                this.userNames[i] = a[2];
                i++;
            }
            br.close();

//            Scanner s = new Scanner(this.myRecord);
//            s.useDelimiter("[,\n]");
//
//            int i = 0;
//            while (s.hasNext()){
//                // amount, password, userName
//                this.amounts[i] = Float.parseFloat(s.next());
//                this.passwords[i] = s.next();
//                this.userNames[i] = s.next();
//                System.out.println(s.next());
//                System.out.println(s.next());
//                System.out.println(s.next());
//                i++;
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
