package filedemo;
import java.io.*;
public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr=new FileReader("src/filedemo/abc.txt");
			FileWriter fw=new FileWriter("src/filedemo/abccopy.txt");
			int ch=0;
			while(ch!=-1)
			{
				ch=fr.read();
				if(ch==-1)break;
				fw.write(ch);
			}
			fr.close();
			fw.close();
			System.out.println("File Copied");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
