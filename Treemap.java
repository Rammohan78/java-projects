package xyz;

import java.util.TreeMap;
public class Treemap {
	public static void main(String [] args) {
		TreeMap<String,String> tre=new TreeMap<String,String>();
		tre.put("INDIA","NEWDELHI");
		tre.put("JAPAN","TOKY0");
		tre.put("USA","WASHINGTON");
		tre.put("INDIA","DELHI");
		tre.put("CHINA","BEGIENG");
		
		System.out.println(tre);
	}

}
