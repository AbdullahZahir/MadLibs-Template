/**
 * MadLibs.java
 * 
 * Parses a template containing <tag> placeholders and replaces each with user input.
 */
import java.util.Scanner;

public class MadLibs {

    private String template;

    /** CONSTRUCTOR: stores the template string */
    public MadLibs(String initTemplate)
    {
        template = initTemplate;
    }
    
    /** 
     * TODO: IMPLEMENT — replace all <tag> occurrences 
     * using only String methods. 
     * 
     * Parameters: None
     * 
     * Preconditions:
     * - Template needs to be missing one or more words, represented with tags
     * - Tags must be closed
     * 
     * Postconditions:
     * - Missing tags are replaced with the user's input
     * - Final sentence is printed
     * 
     */
    public void play()
    {
        Scanner input = new Scanner(System.in);
        //Source: https://www.geeksforgeeks.org/java/java-while-loop-with-examples/
        //Loops until there are no more "<" characters, meaning no more missing words.
        while (template.indexOf("<") != -1) {
            //Gets values of the where the missing word is.
            int startMissing = template.indexOf("<");
            int endMissing = template.indexOf(">", startMissing);
            
            //Saves the missing word as a string
            String missingTag = template.substring(startMissing+1, endMissing);
            
            //Asks user input for the missing string using the previously defined missingTag
            System.out.println("Enter a " + missingTag + ": ");
            String userWord = input.nextLine();
            
            //Gets the first half of the sentence, second half of the sentence, and creates a new 
            //sentence with both halves and new input
            String firstPart = template.substring(0, startMissing);
            String lastPart = template.substring(endMissing+1);
            template = firstPart + userWord + lastPart;
            
        }
        //Prints out the final sentence    
        System.out.println(template);
    }
}
