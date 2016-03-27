package KDF;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.Test;



public class KeywordFramework extends kdf_class{
	
	//public class KeywordFramework extends KeywordActions{
		
		
		public FileInputStream fis;
		
		//String str;
		
		@Test
		
		public void keywordDriver() throws BiffException, IOException, Exception
		{
			
			fis=new FileInputStream("D:\\workspace1\\KDF_excel\\KWFWTests.xls");	
	        //Workbook bb=Workbook.getWorkbook(fis);
			Workbook wb=Workbook.getWorkbook(fis);
			
	        Sheet s=wb.getSheet(0);
	        
	        int r=s.getRows();
	        
	        for(int i=1;i<=r;i++)
	        {
	        	String key=s.getCell(2,i).getContents();
	        	String element=s.getCell(3,i).getContents();
	        	String value=s.getCell(4,i).getContents();
	        	//System.out.println(key);
	        	
	        	if(key.equals("launch"))
	        	{
	        		launch();
	        	}
	        	
	        	else if(key.equals("navigate"))
	        	{
	        		navigate(element);
	        	}
	        	
	        	else if(key.equals("wait"))
	        	{
	        	
	        		int sec=Integer.parseInt(value);
	        		wait(sec);
	        	}
	        	
	        	else if(key.equals("enter"))
	        	{
	        		enter(element,value);
	        	}
	        	
	        	else if(key.equals("clickb"))
	        	{
	        		clickb(element);
	        	}
	        	else if(key.equalsIgnoreCase("clickl"))
	        	{
	        		clickl(element);
	        	}
	        	
	        	else if(key.equals("close"))
	        	{
	        		close();
	        	}
	        	else
	        	{
	        		System.out.println("invalid action keys");
	        	}
	        }
	        
	        
	        fis.close();
			
			
		}

	}