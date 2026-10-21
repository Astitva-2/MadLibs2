import java.util.Scanner;

public class madlib {
    public static void main(String[] args) {

        // \" Is how you write quotes inside the string
        String originalStory = "I bent down to tie my shoe at the supermarket, but let out a [adjective] \"[sound]\" that shook the entire [food] aisle. Startled, [person], dropped an open jar of [snack] and began [verb-ing] toward the bakery section. Their bright [color] [piece of clothing] immediately ripped down the middle horrifying a family of [number] trying to buy [food]. In confusion a stray [animal] snatched a handful of [noun] off the shelf, swallowed it whole, and screamed \"[word]\". The store manager slowly closed the blinds in his office and pretended he was blind.";

        // // \n is new line
        System.out.println("Original Story:\n" + originalStory + "\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer each prompt and press Enter.\n");

        System.out.print("Enter an adjective (e.g. enormous): ");
        String adjective = scanner.nextLine();

        // System.out.print("Enter a sound (e.g. honk): ");
        // String sound = scanner.nextLine();

        // System.out.print("Enter a food (e.g. cereal): ");
        // String food1 = scanner.nextLine();

        // System.out.print("Enter a person's name (e.g. Mr. Lopez): ");
        // String person = scanner.nextLine();

        // System.out.print("Enter a snack (e.g. pretzels): ");
        // String snack = scanner.nextLine();

        // System.out.print("Enter a verb ending in -ing (e.g. skipping): ");
        // String verbIng = scanner.nextLine();

        // System.out.print("Enter a color (e.g. purple): ");
        // String color = scanner.nextLine();

        // System.out.print("Enter a piece of clothing (e.g. sweater): ");
        // String clothing = scanner.nextLine();

        // System.out.print("Enter a number (e.g. 7): ");
        // String number = scanner.nextLine();

        // System.out.print("Enter another food (e.g. tacos): ");
        // String food2 = scanner.nextLine();

        // System.out.print("Enter an animal (e.g. goat): ");
        // String animal = scanner.nextLine();

        // System.out.print("Enter a noun (e.g. spatula): ");
        // String noun = scanner.nextLine();

        // System.out.print("Enter a word to scream (e.g. banana): ");
        // String word = scanner.nextLine();

        int bracketLocation1 = originalStory.indexOf("[");
        int bracketLocation2 = originalStory.indexOf("]");
        String newstory = originalStory.substring(0, bracketLocation1) + adjective + originalStory.substring(bracketLocation2+1);
        System.out.println(newstory);
        


    }
}
