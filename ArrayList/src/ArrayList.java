import java.util.*;
public class ArrayList {
	public static void main(String[] args) {
		ArrayList<String>alist=new ArrayList();
		alist.add("benny");
		alist.add("Beniwal");
		alist.add("Praddep");
		System.out.println(alist);
		alist.remove("benny");
		alist.remove(2);
		System.out.println(alist);
		alist.clear();
	}

}
