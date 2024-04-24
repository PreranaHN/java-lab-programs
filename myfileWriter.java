package week11;


import java.io.FileWriter;
import java.io.*;
 public class myfileWriter
 {
    public static void main(String args[])throws IOException
    {
    	try
    	{
    		FileWriter fw= new FileWriter("textfile.txt");
    		String s="/n all the best for your exams dear students./n";
    		char ch[]=s.toCharArray();
    		for (int i=0; i<ch.length;i++)
    			fw.write(ch[i]);
    		s="good luck and prepare well";
    		fw.write(s);
    		          fw.close();
    		int i=0;
    		FileReader fr=new FileReader("text file.txt");
    		while((i= fr.read())!= -1)
    			System.out.println((char)i);
    		fr.close();
    	}
    	catch(FileNotFoundException nfe) {
    		System.out.println("invalid file name namne\n file does not exists");
    	}
    }
 }