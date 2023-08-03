package libs;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ExcelDriver {
    public static Map getMultipleData(String dataFileName, String sheetName, int columnNumber) throws IOException{
        Map<String, String> testData = new HashMap<String, String>();
        InputStream input = new FileInputStream(dataFileName);
        HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(input));
        HSSFSheet sheet = wb.getSheet(sheetName);

        int dataSize = sheet.getPhysicalNumberOfRows() - 1;
        for (int k = 1; k < (dataSize + 1); k++) {
            HSSFCell keyCell = sheet.getRow(k).getCell(0);
            HSSFCell valueCell = sheet.getRow(k).getCell(columnNumber);
//            valueCell.setCellType(HSSFCell.CELL_TYPE_STRING);
            testData.put(keyCell.getStringCellValue(), valueCell.getStringCellValue());
        }

        input.close();
        return testData;
    }

    public static Map getData(String dataFileName, String sheetName, int columnNumber) throws IOException{
        Map<String, String> testData = new HashMap<String, String>();
        InputStream input = new FileInputStream(dataFileName);
        HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(input));
        HSSFSheet sheet = wb.getSheet(sheetName);

        int dataSize = sheet.getPhysicalNumberOfRows() - 1;
        for (int k = 1; k < (dataSize + 1); k++) {
            HSSFCell keyCell = sheet.getRow(k).getCell(0);
            HSSFCell valueCell = sheet.getRow(k).getCell(1);
//            valueCell.setCellType(HSSFCell.CELL_TYPE_STRING);
            testData.put(keyCell.getStringCellValue(), valueCell.getStringCellValue());
        }

        input.close();
        return testData;
    }
}
