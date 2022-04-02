package extraPracticeClasses;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadingFromCSV {

    public static void main(String[] arg){
        //Simple test to see that the value we got from the file matches what we expect
        //https://support.spatialkey.com/spatialkey-sample-csv-data/ << practice website to download csv files from
        getRowsFromFile().get(6).get(5).equals("530.5 PC USE PERSONAL ID INFO");
    }

    public static ArrayList<List<String>> getRowsFromFile(){
        //declare the return type and variable
        ArrayList<List<String>> records = new ArrayList<List<String>>();

        //locate the latest downloaded file location in your system
        File latestFile = getLastModified("C:\\Users\\moe\\Downloads\\");

        //read form the file
        {
            try {
                BufferedReader br = new BufferedReader(new FileReader(latestFile));
                int i = 0;
                String line;
                while((line = br.readLine()) != null){
                    String[] values = line.split(",");
                    records.add(i, Arrays.asList(values));
                    i++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return records;
    }

    public static File getLastModified(String directoryFilePath)
    {
        File directory = new File(directoryFilePath);
        File[] files = directory.listFiles(File::isFile);
        long lastModifiedTime = Long.MIN_VALUE;
        File chosenFile = null;
        if (files != null)
        {
            for (File file : files)
            {
                if (file.lastModified() > lastModifiedTime)
                {
                    chosenFile = file;
                    lastModifiedTime = file.lastModified();
                }
            }
        }
        return chosenFile;
    }

}
