package com.arit;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args)throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Student"));
		Student s1=(Student)in.readObject();//type conversion in String to Student
		System.out.println(s1.id+" "+s1.name);
		in.close();
	}
	}
