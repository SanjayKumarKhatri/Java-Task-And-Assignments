import java.io.*;

class FileReaderDemo1
{
	public static void main(String args[]) throws IOException
	{
		FileReader fr = new FileReader("abc.txt");
		int i = fr.read();
		
		while(i != -1)
		{
			System.out.println((char)i);
			i = fr.read();
		}
		fr. close();
	}
}e1