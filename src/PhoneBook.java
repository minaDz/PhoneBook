import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> phoneNumber = new ArrayList<>();
        do{
            System.out.println("------Menu------");
            System.out.println("1.Enter new contact");
            System.out.println("2.Show all contacts");
            System.out.println("3.Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            String n = scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter contact name:");
                    String contactName = scanner.nextLine();
                    System.out.println("Enter contact phone number:");
                    String contactNumber = scanner.nextLine();
                    name.add(contactName);
                    phoneNumber.add(contactNumber);
                    System.out.println("successful!");
                    break;

                case 2:
                    if(name.isEmpty()){
                        System.out.println("Empty");
                    } else{
                        for(int i=0 ; i < name.size() ; i++){
                            System.out.println("Name: "+name.get(i));
                            System.out.println("Phone number: "+phoneNumber.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid number.");
            }

        } while (choice != 3);
            scanner.close();



    }
}