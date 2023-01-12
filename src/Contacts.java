import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
// import java.nio.file.StandardOpenOption;
import java.nio.file.StandardOpenOption;

public class Contacts {
    static String dir = "data";
    static String filename = "contacts.txt";
    static Path dataFile = Paths.get(dir, filename);
    public static Scanner sc = new Scanner(System.in);
    private String name;
    private long phoneNumber;
    static List<String> contacts = new ArrayList<>();
    // static List<String> lines = Files.readAllLines(dataFile);
    public String getName(){
        return this.name;
    }

    public long getPhone(){
        return this.phoneNumber;
    }

    public Contacts(){
        this.name = "";
        this.phoneNumber = 0;
    }

    public Contacts(String name, long phone){
        this.name = name;
        this.phoneNumber = phone;

    }
    public static void addContact()throws IOException{
         // Add contact 
         System.out.println("Enter a contact");
         String name = sc.nextLine();
         System.out.println("Enter a Phone Number");
         Long phone = sc.nextLong();
         Contacts person = new Contacts(name, phone);
         System.out.println(person.getName());
          contacts.add(name.toLowerCase()+" | "+phone.toString());
         Files.write(dataFile, contacts, StandardOpenOption.APPEND);
    }
    public static void ViewContacts() throws IOException{
      for(int i=0;i<Files.readAllLines(dataFile).size();i++){
        System.out.println(Files.readAllLines(dataFile).get(i));
      }
    }
    public static void searchContact() throws IOException{
        System.out.println("Enter the contact name");
        String n = sc.nextLine(); 

        for (int i=0;i<Files.readAllLines(dataFile).size();i++){
           String line =  Files.readAllLines(dataFile).get(i);
           if (line.toUpperCase().contains(n.toUpperCase())){
            System.out.println(line + " was found on line " + (i+1));
           }
            // System.out.println(line);
        }
        
    }
    



    public static void choice(int choice) throws IOException{
        switch(choice){
            case 1:
            ViewContacts();
                break;
            case 2:
            addContact();
                break;
            case 3:
            searchContact();
                break;
            case 4:
                
                break;
            case 5:
            System.exit(0);
        }

    }

   


    public static void main(String[] args) throws IOException{
    //    Contacts jack = new Contacts("jack", 1234343343);
    
      contacts = Files.readAllLines(dataFile);

       System.out.println("What would you like to do?\n");
       System.out.println("1. View contacts.\n2. Add a new contact.\n3. Search a contact by name.\n4. Delete an existing contact.\n5. Exit.\nEnter an option (1, 2, 3, 4 or 5):");
       int num = sc.nextInt(); 
       sc.nextLine();
       choice(num);

    
       
        
            
    }
}





