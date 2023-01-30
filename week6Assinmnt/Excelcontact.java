package week6Assinmnt;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelcontact {
	
	

	public static String[][] contactmethod() throws IOException {
		
		
		XSSFWorkbook Workb= new XSSFWorkbook("Data/Createcontact.xlsx");
        XSSFSheet		 wbsheet=Workb.getSheetAt(0);
        int rowcount= wbsheet.getLastRowNum();
        int columncount=wbsheet.getRow(0).getLastCellNum();
        String[][] datacontact=new String[rowcount][columncount];
        for(int i=1; i<=rowcount;i++)
        	
        {
        	 XSSFRow row = wbsheet.getRow(i);
        	for(int j=0;j<columncount;j++)
        	{
        		XSSFCell cell = row.getCell(j);
        		String cellData = cell.getStringCellValue();
				System.out.println(cellData);
				
				datacontact[i-1][j]=cellData;
				
        	}
        }
        Workb.close();
        return datacontact;     
		
		
	}

}
