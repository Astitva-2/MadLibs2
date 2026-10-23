import java.util.Scanner; //Imports the scanner class, allowing user input
/* 
Raghuveer did the initialization (public class, creation of original Story and scanner
Ryan added the ability to ask user input for all of the blanks
Jags allows the user input to replace the brackets with the user input
Aakarsh made the program be able to replace all of the brackets with user inputs and store it in a varable
Calvin added documentation, final output and checked the code for errors/final test
*/
public class madlib {
    public static void main(String[] args) {
        //The story which would be used as a reference for the program
        String originalStory = "I bent down to tie my shoe at the supermarket, but let out a [adjective] \"[sound]\" that shook the entire [food] aisle. Startled, [person], dropped an open jar of [snack] and began [verb-ing] toward the bakery section. Their bright [color] [piece of clothing] immediately ripped down the middle horrifying a family of [number] trying to buy [food]. In confusion a stray [animal] snatched a handful of [noun] off the shelf, swallowed it whole, and screamed \"[word]\". The store manager slowly closed the blinds in his office and pretended he was blind.";

        System.out.println("Original Story:\n" + originalStory + "\n");

        Scanner scanner = new Scanner(System.in); //Initializing Scanner

        System.out.println("Answer each prompt and press Enter.\n"); //Instructions for the user 

        ///For each of the [blanks], the user has to input a text and have it saved within the variable
        System.out.print("Enter an adjective (e.g. enormous): ");
        String adjective = scanner.nextLine();

        System.out.print("Enter a sound (e.g. honk): ");
        String sound = scanner.nextLine();

        System.out.print("Enter a food (e.g. cereal): ");
        String food1 = scanner.nextLine();

        System.out.print("Enter a person's name (e.g. Mr. Lopez): ");
        String person = scanner.nextLine();

        System.out.print("Enter a snack (e.g. pretzels): ");
        String snack = scanner.nextLine();

        System.out.print("Enter a verb ending in -ing (e.g. skipping): ");
        String verbIng = scanner.nextLine();

        System.out.print("Enter a color (e.g. purple): ");
        String color = scanner.nextLine();

        System.out.print("Enter a piece of clothing (e.g. sweater): ");
        String clothing = scanner.nextLine();

        System.out.print("Enter a number (e.g. 7): ");
        String number = scanner.nextLine();

        System.out.print("Enter another food (e.g. tacos): ");
        String food2 = scanner.nextLine();

        System.out.print("Enter an animal (e.g. goat): ");
        String animal = scanner.nextLine();

        System.out.print("Enter a noun (e.g. spatula): ");
        String noun = scanner.nextLine();

        System.out.print("Enter a word to scream (e.g. banana): ");
        String word = scanner.nextLine();

        //Process where they replace all bracket placeholder (ex: [adjective]) with the user input
        int bracketLocation1 = originalStory.indexOf("[");
        int bracketLocation2 = originalStory.indexOf("]");
        String newstory = originalStory.substring(0, bracketLocation1) + adjective + originalStory.substring(bracketLocation2 + 1);

        int bracketLocation3 = newstory.indexOf("[");
        int bracketLocation4 = newstory.indexOf("]");
        newstory = newstory.substring(0, bracketLocation3) + sound + newstory.substring(bracketLocation4 + 1);

        int bracketLocation5 = newstory.indexOf("[");
        int bracketLocation6 = newstory.indexOf("]");
        newstory = newstory.substring(0, bracketLocation5) + food1 + newstory.substring(bracketLocation6 + 1);

        int bracketLocation7 = newstory.indexOf("[");
        int bracketLocation8 = newstory.indexOf("]");
        newstory = newstory.substring(0, bracketLocation7) + person + newstory.substring(bracketLocation8 + 1);


        int bracketLocation9 = newstory.indexOf("[");
        int bracketLocation10 = newstory.indexOf("]");
        newstory = newstory.substring(0, bracketLocation9) + snack + newstory.substring(bracketLocation10 + 1);


        int bracketLocation11 = newstory.indexOf("[");
        int bracketLocation12 = newstory.indexOf("]");
        newstory = newstory.substring(0, bracketLocation11) + verbIng + newstory.substring(bracketLocation12 + 1);


        int bracketLocation13 = newstory.indexOf("[");
        int bracketLocation14 = newstory.indexOf("]");
        newstory = newstory.substring(0, bracketLocation13) + color + newstory.substring(bracketLocation14 + 1);

        int bracketLocation15 = newstory.indexOf("[");
        int bracketLocation16 = newstory.indexOf("]");
        newstory = newstory.substring(0, bracketLocation15) + clothing + newstory.substring(bracketLocation16 + 1);

        int bracketLocation17 = newstory.indexOf("[");
        int bracketLocation18 = newstory.indexOf("]");
        newstory = newstory.substring(0, bracketLocation17) + number + newstory.substring(bracketLocation18 + 1);

        int bracketLocation19 = newstory.indexOf("[");
        int bracketLocation20 = newstory.indexOf("]");
        newstory = newstory.substring(0, bracketLocation19) + food2 + newstory.substring(bracketLocation20 + 1);

        int bracketLocation21 = newstory.indexOf("[");
        int bracketLocation22 = newstory.indexOf("]");
        newstory = newstory.substring(0, bracketLocation21) + animal + newstory.substring(bracketLocation22 + 1);

        int bracketLocation23 = newstory.indexOf("[");
        int bracketLocation24 = newstory.indexOf("]");
        newstory = newstory.substring(0, bracketLocation23) + noun + newstory.substring(bracketLocation24 + 1);
        int bracketLocation25 = newstory.indexOf("[");
        int bracketLocation26 = newstory.indexOf("]");
        newstory = newstory.substring(0, bracketLocation25) + word + newstory.substring(bracketLocation26 + 1);

        System.out.println(newstory); //prints out the story plus the revisions caused by user input
        scanner.close() //prevent further issues by disabling user input after finishing



    }
}
