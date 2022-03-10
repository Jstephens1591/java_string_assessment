package letterswap;



public static void main(String[] args) {
    count();


public static void count(){
    int count =0;
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a sentence:");
    String in= input.nextLine();
    String [] words = in.split(" ");
    int num1=0;
    int num2=0;
    String word1="";
    String word2="";
    System.out.println("Input: "+in);

    for(int i=0; i< words.length;++i){
        if(words[i].endsWith("s")){
            word1=words[i];
            count++;
        }
        if(words[i].endsWith("y")){
            word2=words[i];
            count++;
        }
        if(!word1.equals("")&& !word2.equals("")){
                words[num1]=word2;
                words[num2]=word1;
        }

    }

    String final_string="";
    for(int k=0; k< words.length;++k){
        final_string+=words[k]+" ";
    }
    System.out.println("Output: "+final_string);
    System.out.println("The number of words that end with y and s: "+count);
}
}