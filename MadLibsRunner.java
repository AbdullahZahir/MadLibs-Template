/**
 * MadLibsRunner.java
 * 
 * Creates MadLibs objects with different templates and calls play() to test.
 * 
 * @author: Abdullah Zahir - Period 6 Lakind
 * @version: 10/15/25
 */
import java.util.Scanner;

public class MadLibsRunner
{
    public static void main(String[] args)
    {
        //First Test Case: three missing words.
        String story1 = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        //Creates new MadLibs object with the above story.
        MadLibs finalStory1 = new MadLibs(story1);
        System.out.println("First Story: ");
        //Calls nonstatic MadLibs method on the newly created MadLibs object
        finalStory1.play();
        
        //Second Test Case: three missing words.
        String story2 = "The <adjective> <noun> was quickly running across the park, when they ran into <plural_noun>.";
        //Creates new MadLibs object with the above story.
        MadLibs finalStory2 = new MadLibs(story2);
        System.out.println("Second Story: ");
        //Calls nonstatic MadLibs method on the newly created MadLibs object
        finalStory2.play();
        
        
        //Third Test Case: four missing words.
        String story3 = "My <adjective> teacher brought a <noun> to class and told us to <verb> it with a bunch of <plural_noun>.";
        //Creates new MadLibs object with the above story.
        MadLibs finalStory3 = new MadLibs(story3);
        System.out.println("Third Story: ");
        //Calls nonstatic MadLibs method on the newly created MadLibs object
        finalStory3.play();
        
        System.out.println("\n");
        //ENHANCEMENT: Allows for user to input their own madlibs story and implement their own missing words.
        System.out.println("Now it is your turn to input your own story.\nMake sure when you input your own story that for the missing words,\nyou use \"<\" and \">\" to surround the missing word type.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a story: ");
        
        //Fourth Test Case (ENHANCEMENT Test Case): User inputted.
        String userInputStory = input.nextLine();
        //Creates new MadLibs object with the above story.
        MadLibs finalUserInputStory = new MadLibs(userInputStory);
        System.out.println("User inputted story: ");
        //Calls nonstatic MadLibs method on the newly created MadLibs object
        finalUserInputStory.play();
        
        
    }
}
