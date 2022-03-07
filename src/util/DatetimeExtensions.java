package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatetimeExtensions
{
    public static Date toString(String date) throws ParseException
    {
    	try {
    		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        	Date data = formato.parse("23/11/2015");
            return data; 
			
		} catch (Exception e) {
			System.out.println("Data Inválida: Error:"+e.getMessage());
			throw e;
		}
    	
    }
}

