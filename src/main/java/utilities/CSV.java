package utilities;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    public static List<String[]> read(String filePath){
        List<String[]> data = new LinkedList<>();
        String lineOfData = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while ((lineOfData = reader.readLine()) != null) {
               String[] arrayOfData = lineOfData.split(",");
               data.add(arrayOfData);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FILE COULD NOT BE FOUND!!!");
        } catch (IOException e) {
            System.out.println("FILE CANNOT BE READ!!!");
        }
        return data;
    }

}