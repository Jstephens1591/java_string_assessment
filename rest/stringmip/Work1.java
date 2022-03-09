package stringmip;

public class Work1 {
	
	public static void main(String[] args){
	
	String enter = "customer entered this";
	
	countVowels(enter);
	
}

public static void countVowels(String enter) {
	
	int vowelCount=0;
	
	
	for(int i=0; i<enter.length(); i++) {
		if(isVowel(enter.charAt(i))) {
			vowelCount++;
		}
	}
	System.out.println("vowel count:");
	System.out.println(vowelCount);
}


public static boolean isVowel(char ch) {
		ch=Character.toUpperCase(ch);
		return (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
}




}