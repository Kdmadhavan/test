package Extractor;

public class extractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sentence = "how are you?, \t hope, you and \tyour \tfamily well?!\"";
String word[] = sentence.split("[\t\n,?.!] +");
System.out.println("Number of words: "+word.length);
for(int i=0;i<word.length;i++) {
	System.out.println("word["+i+"] = "+word[i]);
}

	}

}
