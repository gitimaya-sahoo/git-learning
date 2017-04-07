package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {

	XSSFWorkbook wb;
	XSSFSheet sh;
	File src;
	public int rowcount;
	
	public void Filelocation(String xlocation){
		try{
		src = new File(xlocation);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		}
		
	catch(Exception e){
		e.printStackTrace();
	}
		}
	
	public String dataread(String sheet,int row, int col){
		sh = wb.getSheet(sheet);
		String data = sh.getRow(row).getCell(col).getStringCellValue();
		rowcount = sh.getLastRowNum();
		return data;
	}
	
	public void datawrite(String sheet1,int cell) throws Exception{
		sh = wb.getSheet(sheet1);
		int lastrow = sh.getLastRowNum();
		
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date dt = new Date();
		sh.createRow(lastrow+1).createCell(cell).setCellValue("Log Entry at : "+df.format(dt));
		
		FileOutputStream fos = new FileOutputStream(src);
		wb.write(fos);
		wb.close();
		
	}
		}
