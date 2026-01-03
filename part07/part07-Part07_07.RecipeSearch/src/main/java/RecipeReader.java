
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeReader {
    
    private String file;
    private ArrayList<Recipe> recipes;
    
    public RecipeReader(String file) {
        this.file = file;
        this.recipes = new ArrayList<>();
    }
    
    public void readRecipes() {
        ArrayList<String> lineList = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineList.add(line);
                
                if (line.isEmpty()) {
                    String name = lineList.get(0);
                    int cookingTime = Integer.valueOf(lineList.get(1));
                    
                    ArrayList<String> ingredients = new ArrayList<>();
                    for (String value: lineList) {
                        if (lineList.indexOf(value) > 1) {
                            ingredients.add(value);
                        }
                    }
                    
                    Recipe recipe = new Recipe(name, cookingTime, ingredients);
                    recipes.add(recipe);
                    
                    lineList.clear();
                }
            }
            
            String name = lineList.get(0);
            int cookingTime = Integer.valueOf(lineList.get(1));

            ArrayList<String> ingredients = new ArrayList<>();
            for (String value: lineList) {
                if (lineList.indexOf(value) > 1) {
                    ingredients.add(value);
                }
            }
            
            Recipe recipe = new Recipe(name, cookingTime, ingredients);
            recipes.add(recipe);

            lineList.clear();
                            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void listRecipes() {
        for (Recipe recipe: recipes) {
            System.out.println(recipe);
        }
    }
    
    public void findName(String word) {
        for (Recipe recipe: recipes) {
            String name = recipe.getName();
            
            if (name.contains(word)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findCookingTime(int max) {
        for (Recipe recipe: recipes) {
            int cookTime = recipe.getCookingTime();
            
            if (cookTime <= max) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findIngredient(String ingredient) {
        for (Recipe recipe: recipes) {
            ArrayList<String> ingredients = recipe.getIngredients();
            
            for (String value: ingredients) {
                if (value.equals(ingredient)) {
                    System.out.println(recipe);
                }
            }
        }
    }
    
}
