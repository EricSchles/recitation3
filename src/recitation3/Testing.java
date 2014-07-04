package recitation3;

import java.nio.charset.Charset;

/**
 * @author Eric
 *
 */
public class Testing {
/*
	
	*/
	public static String thing(String s){
		return s;
	}
	


public static void main(String[] arguments){
		
		System.out.println("Hello");
		System.out.println(Charset.forName("UTF-8").encode("\u2591"));
	}
}