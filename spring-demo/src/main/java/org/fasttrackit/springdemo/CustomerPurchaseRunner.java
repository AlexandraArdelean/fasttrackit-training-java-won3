package org.fasttrackit.springdemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomerPurchaseRunner {

    public static void main(String[] args) {
        // detecting the file type
        CustomerPurchase.GetContentFromExcelSheets getContentFromExcelSheets
                = new CustomerPurchase.GetContentFromExcelSheets();
        List<CustomerPurchase> extractedData
                = new ArrayList<>();
        try {
            extractedData
                    = getContentFromExcelSheets
                    .readFromExcelFile("C:\\Users\\Ale\\IdeaProjects\\fasttrackit-training-java-won3\\" +
                            "SampleXLSFile_19kb.xls");
        }
        catch (IOException e) {

            e.printStackTrace();
        }
        System.out.println(extractedData);
    }
}

