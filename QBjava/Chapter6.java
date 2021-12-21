package QBJava;
import java.util.*;
import java.io.*;
class Chapter6 {}

/*  
Write a java program which read source file and destination file name and copy the content of
source file to destination file.

Write a Java program to copy content of file1.txt to file2.txt using Java file handling.

Write a program using BufferedInputStream, FileInputStream,
BufferedOutputStream, FileOutputStream to copy content of one file Test1.txt into
another file Test2.txt.
*/
class BuffereClass
{
    public static void main(String args[]) throws IOException
    {
        int ch;
        System.out.println("\nStart Coping...");
        FileInputStream fin = new FileInputStream("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\QBJava\\File1.txt");
        BufferedInputStream bfin = new BufferedInputStream(fin);
        FileOutputStream fout = new FileOutputStream("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\QBJava\\File2.txt");
        BufferedOutputStream bfout = new BufferedOutputStream(fout);
        while((ch=bfin.read()) != -1)
            bfout.write(ch);
        System.out.println("\nNew File Created and save data.");
        bfin.close();
        bfout.close();           
    }
}

/* 
Write a java program to search the file named the word entered as a filename from
commandline: If it exists in the system the program should print the contents of the file on
console.

Write a program that reads file name from user, through command line argument and
displays/reads content of the text file on console
*/
class ReadFile
{
	public static void main(String args[])
	{
            try
            {
		FileOutputStream fout = new FileOutputStream("File3.txt");
		String s = "Welcome java";
		byte b[] = s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("Success");
		FileInputStream fin = new FileInputStream(args[0]);
		int i = 0;
		while((i=fin.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println((char)i);
		fin.close();
            }
            catch(Exception e)
            {
		System.out.println(e);
            }
	}
}

/* 
Write a program to display the bytes of a file in reverse sequence. Provide the name of the file
as a command line argument
*/
class WordSearch
{
    public static void main(String[] args) throws IOException
    {
        File f1=new File(args[0]); 
        boolean wordcheck=false; 
        if(f1.exists())
        {
            BufferedReader br=new BufferedReader(new FileReader(f1)); 
            String line;
            String word=args[1];
            while((line=br.readLine())!=null)
            {
                String wordarray[]=line.split(" ");
                for(String tempword:wordarray)
                {
                    if(tempword.equalsIgnoreCase(word))
                    {
                        System.out.println("The Word "+word+" Exists in a Line: "+line);
                        wordcheck=true;
                    }
                }
                if(!wordcheck)
                {
                    System.out.println("The Word doesn't Exist in a Line!!!");
                }
            }
        }
        else
        {
            System.out.println("File doesn't Exists!!!");
        }
    }
}


/* 
Write a java program which read numbers from number.txt file and store even number to
even.txt and odd number into odd.txt file.
*/
class ReadNumber
{
    public static void main(String args[]) throws IOException
    {
        FileReader fr = new FileReader("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\QBJava\\number.txt");
        int i;
        while((i=fr.read())!=-1)
        {
            System.out.println(i);
        }
        fr.close();
    }
}

/* 
Write a program using Character streams to copy from file from.txt, one byte at a time to a
new file to.txt
*/
class CharacterStreams extends IOException
{
    public static void main(String args[])
    {
        try
        {
         Reader r = new FileReader("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\QBJava\\from.txt");
         Writer w = new FileWriter("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\QBJava\\to.txt");
         int data = r.read();
         while(data!=-1)
         {
             data=r.read();
             w.write(data);
         }
         w.close();
         r.close();
         System.out.println("Success");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

/*  
Create a class called Student. Write a student manager program to manipulate the student
information from files by using the BufferedReader and BufferedWriter.
*/
class student
{
    public static void main(String args[]) throws Exception
    {
        FileWriter w = new FileWriter("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\QBJava\\number.txt");
        BufferedWriter b = new BufferedWriter(w);
        b.write("Name: XYZ"
                + "Branch: CS"
                + "College: IIT Delhi"
                + "Located: India");
        b.close();
        System.out.println("Success");
        FileReader fr = new FileReader("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\QBJava\\number.txt");
        BufferedReader br = new BufferedReader(fr);
        int i;
        while((i=br.read())!=-1)
        {
            System.out.print((char)i);
        }
        br.close();
        fr.close();
    }
}