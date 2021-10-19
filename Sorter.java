import java.util.Scanner;
public class Sorter{
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("============ File Sorter ============");
        String path = ask("What is the folder in which you want to sort: ");
        //Needs Listing
    }

    private static String ask(String prompt){
        System.out.print(prompt);
        return scan.nextLine();
    }
}