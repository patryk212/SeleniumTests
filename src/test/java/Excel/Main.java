package Excel;

public class Main {

    public static void main(String[] args) {

        String filePath = System.getProperty("user.dir");
        ExcelUtils excel = new ExcelUtils(filePath + "/sheet.xlsx", "sheet");
        excel.getCellDataString(1,1);
        ExcelUtils.getRowCount();
        excel.getCellDataNumber(1,1);
    }
}
