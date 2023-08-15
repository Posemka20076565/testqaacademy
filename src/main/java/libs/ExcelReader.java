package libs;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    /**
     * @param filePath  excel file path
     * @param sheetName sheet name in xlsx file
     * @return excel data
     *
     */
    public static Map readExcel(String filePath, String sheetName) throws IOException{
                Map<String, String> testData = new HashMap<String, String>();
                FileInputStream file = new FileInputStream(filePath);
                XSSFWorkbook wb = new XSSFWorkbook(file);
                XSSFSheet sheet = wb.getSheet(sheetName);
                int rowCount = sheet.getLastRowNum() + 1;
                for (int i = 1; i < rowCount; i++) {
                    XSSFCell keyCell = sheet.getRow(i).getCell(0);
                    keyCell.setCellType(CellType.STRING);
                    XSSFCell valueCell = sheet.getRow(i).getCell(1);
                    valueCell.setCellType(CellType.STRING);
                    testData.put(keyCell.getStringCellValue(), valueCell.getStringCellValue());
                }
                file.close();
                return testData;
    }
}
