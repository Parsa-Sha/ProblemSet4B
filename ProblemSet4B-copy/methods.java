/**
 * Write a description of class methods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class methods {
    public static void isPalindrone(String s) {
        String str = s;
        String rts = "";
        str = str.toLowerCase();
        str = methods.onlyLetters(str);
        for (int i = 0; i < str.length(); i++) {
            rts += str.substring(str.length()-i-1, str.length()-i);
        }
        System.out.println(rts.equals(str));
    }

    public static String onlyLetters(String s) { // All letters are converted to lowercase
        s = s.toLowerCase();  
        String str = "";
        String a = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < s.length(); i++) {
            if (a.indexOf(s.substring(i, i+1)) != -1) {
                str += s.substring(i, i+1);
            }
        }
        return str;
    }

    public static String wordToPiglatin (String s) {
        String str = s;
        str = str.substring(1, str.length()) + str.substring(0, 1) + "ay";
        return str;
    }

    public static void toPiglatin (String s) { // Can't incorporate onlyLetters, (it would delete all spaces)
        String str = "";
        String temp = "";
        str = str.toLowerCase();
        for (int i = 0; i < s.length(); i++) { // Hunting for start of word
            if (!" ".equals(s.substring(i, i+1))) { // First letter located
                for (int j = i; j < s.length(); j++) { // Hunting for end of word
                    if (" ".equals(s.substring(j, j+1)) || j == s.length()-1) { // End of word located
                        if (j-1 > 2){
                            if (" ".equals(s.substring(j, j+1))) temp = s.substring(i, j);
                            if (j == s.length()-1) temp = s.substring(i, j+1);

                            str += wordToPiglatin(temp);
                            if (" ".equals(s.substring(j, j+1))) str += " ";
                            i += temp.length() + 1;
                        }
                    }   
                }
            }
        }
        System.out.println(str);
    }
    
    public static int howManyAscending(int a, int b) {
        int x = 0;
        for (int i = a; i <= b; i++) {
            if (isAscending(i)) x++;
        }
        return x;
    }
    
    public static boolean isAscending(int x) {
        int a = numOfDigits(x); // Find how many digits the number has.
        if (a == 1) return true;
        for (int i = 0; i < a; i++) {
            if ((x/10) % 10 >= x%10) return false;
            x = x/10;
        }
        return true;
    }

    public static int numOfDigits(int x) {
        return (""+x).length();
    }

    public static void makeTimesTable(int n) {
        if (n < 1) return; // Exception 
        System.out.println(""); // Prevents starting the graph on a previously written line
        String kingSpace = " ";
        String space = "";
        for (int i = 0; i < numOfDigits(n*n); i++) kingSpace += " ";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                space = kingSpace.substring(0, kingSpace.length()-numOfDigits(i*j));
                System.out.print(space + (i*j));
            }   
            System.out.println("");
        }
    }
}
