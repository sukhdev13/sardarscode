package filedemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
import java.util.*;

public class ScannerDemo{
	public static void main(String args[]) {
	try {
		FileReader fr=new FileReader("src/filedemo/xyz.txt");
		FileWriter fw=new FileWriter("src/filedemo/sumofxyz.txt");
		BufferedReader br=new BufferedReader(fr);
		
		
		while(true)
		{
			String s1=br.readLine();
			if(s1==null)
			break;
			else
			{
			Scanner sc=new Scanner(s1);
			int sum=0;
			while(sc.hasNext())
			{
				int x=sc.nextInt();
				sum+=x;
				
			}
			fw.write("sum="+sum+"\n");
			System.out.println(sum);
			sc.close();
			}
		}
				br.close();
		fr.close();
		fw.close();
		
		System.out.println("sum completed");
	}
	catch(FileNotFoundException e1)
	{
		e1.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
