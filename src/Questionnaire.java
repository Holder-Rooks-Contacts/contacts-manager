import java.util.Scanner;

public class Questionnaire {
    Scanner sc = new Scanner(System.in);
    int userInput;

    public void ask(){
        System.out.println("What would you like to do?\n");
        System.out.println("1. View contacts.\n2. Add a new contact.\n3. Search a contact by name.\n4. Delete an existing contact.\n5. Exit.\nEnter an option (1, 2, 3, 4 or 5):");
    }

    public static void main(String[] args) {
        Questionnaire q = new Questionnaire();
        q.ask();
    }
}
