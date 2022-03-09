package contcount;

public class constcount {
	public static void main(String[] args){
		
	String enter = "customer entered this";
	
	countConst(enter);
	
}

public static void countConst(String enter) {
	
	int constCount=0;
	
	
	for(int i=0; i<enter.length(); i++) {
		if(isConst(enter.charAt(i))) {
			constCount++;
		}
	}
	System.out.println("Const count:");
	System.out.println(constCount);
	enter = enter.replace("b" , "*");
	enter = enter.replace("c" , "*");
	enter = enter.replace("d" , "*");
	enter = enter.replace("f" , "*");
	enter = enter.replace("g" , "*");
	enter = enter.replace("h" , "*");
	enter = enter.replace("j" , "*");
	enter = enter.replace("k" , "*");
	enter = enter.replace("l" , "*");
	enter = enter.replace("m" , "*");
	enter = enter.replace("n" , "*");
	enter = enter.replace("p" , "*");
	enter = enter.replace("q" , "*");
	enter = enter.replace("r" , "*");
	enter = enter.replace("s" , "*");
	enter = enter.replace("t" , "*");
	enter = enter.replace("v" , "*");
	enter = enter.replace("w" , "*");
	enter = enter.replace("x" , "*");
	enter = enter.replace("y" , "*");
	enter = enter.replace("z" , "*");
	
	System.out.println(enter);
	
}


public static boolean isConst(char ch) {
		ch=Character.toUpperCase(ch);
		return (ch=='B' || ch=='C' || ch=='D' || ch=='F' || ch=='G'|| ch=='H' || ch=='J' || ch=='K' || ch=='L' || ch=='M' || ch=='N' || ch=='P' || ch=='Q' || ch=='R' || ch=='S' || ch=='T' || ch=='V' || ch=='W' || ch=='X' || ch=='Y' || ch=='Z');
}





}
