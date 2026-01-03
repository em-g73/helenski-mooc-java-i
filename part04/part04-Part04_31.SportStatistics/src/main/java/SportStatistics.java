
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                list.add(fileScanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error e");
        }
        
        int games = 0;
        int wins = 0;
        int losses = 0;
        String place = "";
        
        for (String line: list) {
            String[] pieces = line.split(",");
            
            if (pieces[0].equals(team)) {
                games += 1;
                place = "home";
            } else if (pieces[1].equals(team)) {
                games += 1;
                place = "visiting";
            } else {
                continue;
            }
            
            if (Integer.valueOf(pieces[2]) > Integer.valueOf(pieces[3]) && place.equals("home")) {
                wins += 1;
            } else if (Integer.valueOf(pieces[2]) < Integer.valueOf(pieces[3]) && place.equals("visiting")) {
                wins += 1;
            } else {
                losses += 1;
            }
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
