package ch.learn.stringmanipulation;

import org.apache.commons.lang3.StringUtils;

public class StringUtilMain {
	
	public static void main(String args[]) {
		StringUtilMain utilMain = new StringUtilMain();
		System.out.println(utilMain.strconcat("test ", "join"));
		System.out.println(StringUtils.join("test1 " , "test2  ", "test 3"));
		
	}
	
	public String strconcat(String arg1, String arg2) {
		return StringUtils.join(arg1, arg2);
	}

}
