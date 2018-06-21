package FileListing;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;

public class FileList {
	
public void filee(String s,ArrayList<File> list)throws IOException
{
	File f=new File(s);
	File file[]=f.listFiles();
	try
	{
	for(File fi:file)
	{
		if(fi.isDirectory()==true)
		{
			filee(fi.getAbsolutePath(),list);
		}
		else
		{
			list.add(fi);
		}
	}
	}
	catch(Exception e)
	{
		return;
	}
	}

public static void main(String[] args)throws IOException
{
	
	FileList fl=new FileList();
	Scanner sc=new Scanner(System.in);
	String s1,s2;
	s1=sc.nextLine();
	s2=sc.nextLine();
	sc.close();
	File f=new File("C:\\Users\\Anjali\\Desktop\\assignments\\abc.txt");
	
	FileWriter fw=new FileWriter(f);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write(s1);
	bw.newLine();
	bw.write(s2);
	bw.close();
	ArrayList<File>list=new ArrayList<File>();
	fl.filee(s1,list);
	File file=new File(s2);
	FileWriter w=new FileWriter(file,true);
	for(int i=0;i<list.size();i++)
	{
		w.write("Name=" +list.get(i).getName());
		w.write(',');
		w.write("Path=" +list.get(i).getAbsolutePath() +"\n");
	}
	w.flush();
	w.close();
	}
}



