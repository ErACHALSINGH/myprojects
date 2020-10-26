package com.arit;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class SerializeStudent {
    public static void main(String args[])throws Exception{
    	Student s1=new Student(1234,"Pradeep Beniwal");
    	FileOutputStream fout=new FileOutputStream("Student");
    	ObjectOutputStream out=new ObjectOutputStream(fout);
    	out.writeObject(s1);
    	out.flush();
    	out.close();
    	System.out.println("Object Written to Student.txt");
    }

	}

