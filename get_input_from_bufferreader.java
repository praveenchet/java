package BASICPROJECTS;
import java.util.*;
import java.io.*;



public class get_input_from_bufferreader {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
         BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
         String str = bfr.readLine();
         
         int it = Integer.parseInt(bfr.readLine());
       
         System.out.println(str);
         System.out.println(it);
	}

}
