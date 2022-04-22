/***************************************************************************************************
 * Purpose :
 * UC 1    : Ability for the analyser to load the Indian States Census
 *           Information from a csv file - Create a StateCensusAnalyser Class
 *           to load the State Census CSV Data
 *           - Create CSVStateCensus Class to load the CSV Data
 *           - Use Iterator to load the data
 *           - Check with StateCensusAnalyser to ensure number of records matches
 ***************************************************************************************************/

package org.ajinkya.Main;

import org.ajinkya.Exceptions.CustomizedExceptions;
import org.ajinkya.FileOperations.FileReaderWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class IndianStateCensusAnalyzer {

    public static void main(String[] args) throws CustomizedExceptions {
        String filePath = "C:\\Bridgelabs\\LFP126\\Day29_Assignments\\main\\java\\org\\ajinkya\\Files\\StateCensusData.csv";

        IndianStateCensusAnalyzer id = new IndianStateCensusAnalyzer();

    }

    /**
     * Purpose : To get the number of records in CSV File
     */
    public int getNumberOfRecords(String filePath) throws CustomizedExceptions {
        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        int count = fileReaderWriter.getTotalRecords(filePath);

        return count;
    }

    /**
     * Purpose : To get flag  value from FileReader method
     */
    public boolean delimiterChecker(String filePath) {
        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        boolean flag = fileReaderWriter.checkDelimiter(filePath);
        return flag;
    }

    /**
     * Purpose : To get flag value from FileReaderWriter Method
     */
    public  boolean csvHeaderChecker(String filePath) throws IOException, CustomizedExceptions {
        FileReaderWriter fileReaderWriter = new FileReaderWriter();

        //To compare actual csv headers and with headers in arraylist
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("State","Population","Area","Density"));
        boolean flag = fileReaderWriter.checkCSVHeader(filePath, stringArrayList);
        return flag;
    }
}