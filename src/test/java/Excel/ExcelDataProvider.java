package Excel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {

    @Test(dataProvider = "Test1Data")
    public void test1(String q, String key){
        System.out.println(q + " | " + key );

    }


    @DataProvider(name = "Test1Data")
    public static Object[][] getData(){
        String excelPath = "./sheet.xlsx";

        Object data[][] = testData(excelPath, "sheet");
        return data;


    }

    public static Object[][] testData(String excelPath, String sheetName)  {

        ExcelUtils excel = new ExcelUtils(excelPath, sheetName);

        int rowCount = ExcelUtils.getRowCount();
        int colCount = ExcelUtils.getColCount();

        Object data [][] = new Object[rowCount][colCount];

        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {

                String cellData = excel.getCellDataString(i, j);
                System.out.println(cellData + "  |  ");
                data[i-1][j] = cellData;
            }
            System.out.println();
        }
        return data;
    }
}