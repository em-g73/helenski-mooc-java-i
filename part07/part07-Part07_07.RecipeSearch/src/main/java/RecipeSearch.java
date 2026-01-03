
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read:");
        String file = scanner.nextLine();
        RecipeReader recipeReader = new RecipeReader(file);
        recipeReader.readRecipes();
        
        while (true) {
            System.out.println("\nCommands:\n" +
            "list - lists the recipes\n" +
            "stop - stops the program\n" +
            "find name - searches recipes by name\n" +
            "find cooking time - searches recipes by cooking time\n" +
            "find ingredient - searches recipes by ingredient");
            
            System.out.println("\nEnter command:");
            String command = scanner.nextLine();
            
            if (command.equals("list")) {
                recipeReader.listRecipes();
                
            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String searchedWord = scanner.nextLine();
                
                recipeReader.findName(searchedWord);
                
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int max = Integer.valueOf(scanner.nextLine());
                
                recipeReader.findCookingTime(max);
                
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                
                recipeReader.findIngredient(ingredient);
                
            } else if (command.equals("stop")) {
                break;
            }
        }
    }

}
