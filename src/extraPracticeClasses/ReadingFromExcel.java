package extraPracticeClasses;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingFromExcel {

    public static void main(String[] arg){
        //Simple test to see that the value we got from the file matches what we expect
        //https://support.spatialkey.com/spatialkey-sample-csv-data/ << practice website to download csv files from
        getRowsFromFile();
    }

    public static ArrayList<List<String>> getRowsFromFile(){
        //declare the return type and variable
        ArrayList<List<String>> records = new ArrayList();
        //locate the latest downloaded file location in your system
        File latestFile = getLastModified("C:\\Users\\moe\\Downloads\\");
        try {
            FileInputStream fis = new FileInputStream(latestFile);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);

            for (int i = 0; i <= sheet.getRow(0).getPhysicalNumberOfCells(); i++) {
                //for each row create a new list
                List<String> tempList = new ArrayList<>();
                for (int j = 0; j < sheet.getLastRowNum(); j++) {
                    //for each row iterate through the columns and create a list
                    tempList.add(sheet.getRow(i).getCell(j).getStringCellValue());
                }
                records.add(i, tempList);
                System.out.println(records.get(i));
            }
        }  catch (IOException e) {
            e.printStackTrace();
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
