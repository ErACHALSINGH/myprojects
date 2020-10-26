import java.io.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList names=new ArrayList();
		names.add("Raju");
		names.add("Shyam");
		names.add("Nanji Bhai");
		names.add("Munna Bhai");
		Iterator<String> it= names.iterator();
		while(it.hasNext()){
			String obj=(String)it.next();
			System.out.println(obj);
		}
		
		

	}

}
