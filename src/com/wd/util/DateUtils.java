package com.wd.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	public static String getUniqueId() {
		
		SimpleDateFormat f =new SimpleDateFormat("yyyyMMddhhmmss");
		return f.format(new Date());
		
	}

}
