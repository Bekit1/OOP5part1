package task3;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File one=new File("a.txt");
Frequency a=new Frequency();
a.loadFromFile(one);

File two=new File("alphabit.txt");
Alphabit three=new Alphabit();
three.loadFromFile(two);
System.out.println(three.toString());
a.createAlpha(two);
a.comp();
System.out.println(a.getAlpha().toString());
a.sort();
	}

}
