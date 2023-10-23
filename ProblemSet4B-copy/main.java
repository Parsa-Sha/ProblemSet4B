/**
 * Write a description of class main here.
 *
 * @author Parsa S.
 * @version Problem Set 4B, 19/10/2023
 * 
 * 
 * Code notes for problem by number:
 * 1. Prints true/false depending on if word is palindrone (ignores all non-letter chars)
 * 2. Prints sentence translated to piglatin in console (all letters become lowercase + only non-letter char allowed is " ")
 * 3. Works. First Try. All others took at least half an hour (4 = 30 min, 1 = 2 hrs, 2 = 5+ hrs)
 * 3. a) Prints if numbers are in acending order (only works on ints). No clue what the "how many between two parameters" part means.
 * 4. After struggling with understanding how the spacing should work, then deleting half my code, it prints a times table to the code if the int > 0.
 * 4. a) If input < 1, it prints nothing.
 * 
 */
public class main {
    public static void main() {
        // Check if string is palindrone.
        methods.isPalindrone("tacocat"); 
        
        // Print piglatin-ified string to console
        methods.toPiglatin("wing wrought"); 
        
        // check how many ints between two ints are strictly ascending
        System.out.println(methods.howManyAscending(5000, 10000));
        
        // Prints times table up to int^2
        methods.makeTimesTable(15);
    }
}
