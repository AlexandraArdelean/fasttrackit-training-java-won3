package org.fasttrackit.springdemo;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class CustomerPurchase {


    private int id;
    private String purchasedProduct;
    private String name;
    private String category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPurchasedProduct() {
        return purchasedProduct;
    }

    public void setPurchasedProduct(String purchasedProduct) {
        this.purchasedProduct = purchasedProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "CustomerPurchase{" +
                "id=" + id +
                ", purchasedProduct='" + purchasedProduct + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerPurchase that = (CustomerPurchase) o;
        return id == that.id && Objects.equals(purchasedProduct, that.purchasedProduct) && Objects.equals(name, that.name) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, purchasedProduct, name, category);
    }

    // class to assign the cell value
    public static class GetContentFromExcelSheets {
        private Object getCellValue(Cell cell, CellType cellType) {
            switch (cellType) {
                case STRING:
                    return cell.getStringCellValue();

                case NUMERIC:
                    return cell.getNumericCellValue();
            }

            return null;
        }

        // Read the excel sheet contents and get the contents in
        // a list
        public List<CustomerPurchase> readFromExcelFile(String excelFilePath) throws IOException {

            List<CustomerPurchase> customerList = new ArrayList<>();
            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

            Workbook workbook = new HSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = firstSheet.iterator();

            while (iterator.hasNext()) {
                Row nextRow = iterator.next();
                Iterator<Cell> cellIterator
                        = nextRow.cellIterator();
                CustomerPurchase customerPurchase = new CustomerPurchase();

                while (cellIterator.hasNext()) {
                    Cell nextCell = cellIterator.next();
                    int columnIndex = nextCell.getColumnIndex();

                    switch (columnIndex) {
                        case 0:
                            customerPurchase.setId((int) Math.round(nextCell.getNumericCellValue()));
                            break;
                        case 1:
                            customerPurchase.setPurchasedProduct(
                                    (nextCell.getStringCellValue()));
                            break;
                        case 2:
                            customerPurchase.setName(
                                    (nextCell.getStringCellValue()));
                            break;
                        case 8:
                            customerPurchase.setCategory(
                                    (nextCell.getStringCellValue()));
                    }

                    customerList.add(customerPurchase);
                }


                inputStream.close();


            }
            return customerList;
        }

    }

}


