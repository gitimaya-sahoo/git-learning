package BusinessComponent;

import Framework.ReadWriteExcel;
import PageObjects.PO_Login;
import PageObjects.PO_MyInfo;

public class BC_EditInfo {

	public static void editinfo(String txtnick) throws Exception{
		PO_MyInfo.info();
		Thread.sleep(5000);
		PO_MyInfo.clickedit();
		Thread.sleep(2000);
		
		//GetExcelData
		ReadWriteExcel rw = new ReadWriteExcel();
	
		rw.Filelocation("D://Selz//DataDrivenFW//TestData.xlsx");

	//	int rownum = rw.rowcount;
		String nname=null;
		String milit=null;
		for(int i=0;i<=15;i++){
			nname = rw.dataread("Sheet1", i, 0);
			
			if(nname.equalsIgnoreCase(txtnick)){
				milit = rw.dataread("Sheet1", i, 1);
				break;
			}
		}
		
		PO_MyInfo.enternickname(nname);
		PO_MyInfo.entermilitary(milit);
		PO_MyInfo.getotherid();
		
		PO_MyInfo.clicksave();
		rw.datawrite("Sheet2",0);
	}
}
