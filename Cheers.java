//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String word = args[0];
            int num = Integer.parseInt(args[1]);
            String condition_letters = "AEFHILMNORSX";
            String concat_word = "";
            for(int i = 0; i<word.length(); i++){
                char letter = word.charAt(i);
                if(condition_letters.indexOf(letter) == -1){
                        concat_word = "a";
                }else{
                        concat_word = "an";
                }
                char upperCaseLetter = Character.toUpperCase(letter);
                System.out.println( "Give me "+ concat_word + " " + upperCaseLetter +": " + upperCaseLetter +"!");
        }
             
            for(int i = 0; i<num; i++){
                System.out.println(word.toUpperCase()+"!!!");
            }
        }
}
