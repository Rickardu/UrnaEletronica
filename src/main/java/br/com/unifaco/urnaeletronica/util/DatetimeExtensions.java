package br.com.unifaco.urnaeletronica.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatetimeExtensions
{
    public static Date toDate(String date) throws Exception
    {
    	try {
    		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        	Date data = formato.parse(date);
            return data; 
			
		} catch (Exception e) {
			System.out.println("Data Inválida: Error:"+e.getMessage());
			throw e;
		}
    	
    }
    public static String toString(Date date) throws Exception
    {
    	try {
    		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        	 
            return formato.format(date); 
			
		} catch (Exception e) {
			System.out.println("Data Inválida: Error:"+e.getMessage());
			throw e;
		}
    	
    }
}

