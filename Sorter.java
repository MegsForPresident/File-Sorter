import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class Sorter{
    private static Scanner scan = new Scanner(System.in);
    private static LinkedList<String> list = new LinkedList<>();
    private static String s = "\\";
    private static String id = " Alkenes ";
    public static void main(String[] args) {
        System.out.println("============ File Sorter ============");
        String path = ask("What is the folder in which you want to sort: ");
        list(path);
        System.out.println(list);
        //Needs Sorting
    }
    
    private static void list(String path){
        File folder = new File(path);
        for(String file : folder.list()){
            if(new File(path+s+file).isFile()){
                list.add(path + id + file);
            }
            else{
                list(path+s+file);
            }
        }
    }

    private static String ask(String prompt){
        System.out.print(prompt);
        return scan.nextLine();
    }
}