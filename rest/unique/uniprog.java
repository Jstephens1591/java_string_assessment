package unique;

public class uniprog {
	public static void uniqueCharacters(String test) {
		String word = "racecar";
        String temp = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = test.charAt(i);
            if (temp.indexOf(ch) == -1) {
                temp = temp + ch;
            } else {
                temp.replace(String.valueOf(ch),""); 
            }
        }

        System.out.println(temp + " ");

    }

}
