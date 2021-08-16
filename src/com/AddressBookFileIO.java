package com;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class AddressBookFileIO {
public  void writeData(Map<String,AddressBook> addressBook){
    File file=new File("B:\\ADDRESSBOOK git\\Contacts.txt");
    BufferedWriter bf=null;

    try {
        //creating buffer writer for the output file
        bf=new BufferedWriter(new FileWriter(file));
        //itrate map entries
        for (Map.Entry<String,AddressBook> entry:  addressBook.entrySet()) {
            //put key and values seprated by a colon
            bf.write(entry.getKey() + ":" + entry.getValue());

            //new line
            bf.newLine();
        }
        bf.flush();

    } catch (IOException e) {
        e.printStackTrace();
    }
}

public static Map<String,String> readData(){
    Map<String,String> mapFileContents=new HashMap<>();
    BufferedReader br=null;
    try {
        //create file object
        File file=new File( "B:\\ADDRESSBOOK git\\Contacts.txt");

        //create bufferreader object from file
        br=new BufferedReader(new FileReader(file));

        String line=null;
        String line2="";

        //read file line by line
        while ((line= br.readLine())!=null){

            //split the line by:
            String[] parts=line.split(":");
            String[] part2=line2.split(",");

            String bookName = parts[0].trim();
            String fname = parts[1].trim();
            mapFileContents.put(bookName, fname);
        }

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        //Always close the BufferedReader
        if (br != null) {
            try {
                br.close();
            } catch (Exception e) {
            }
        }
    }
    return mapFileContents;
    }

}


