package Excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ReadExcel {


    public static void readExcel(){
        try {
            XSSFWorkbook workbook = new XSSFWorkbook("./sheet.xlsx");
            for(int i=0; i<workbook.getNumberOfSheets(); i++){
                System.out.println("Sheet name: " + workbook.getSheetAt(i).getSheetName());
                for (Row row : workbook.getSheetAt(i)) {
                    for (Cell cell : row) {
                        switch (cell.getCellType()) {
                            case STRING:
                                System.out.println(cell.getStringCellValue() + "\t");
                                break;
                            case NUMERIC:
                                System.out.println(cell.getNumericCellValue()+ "\t");
                                break;
                            case BOOLEAN:
                                System.out.println(cell.getBooleanCellValue()+ "\t");
                                break;
                        }

                    }
                    System.out.println();
                }
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        readExcel();
    }
}