
import java.util.*;
import java.time.LocalDate;

public class Main {
    public static void main(String args[]){
        System.out.println("Welcome to Your Personal Expense Tracker");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name=sc.nextLine();
        ExpenseTracker tracker=new ExpenseTracker(name);
        while (true) {
            
            
            System.out.print("\n===========================================================\nExpense Tracker Menu\n===========================================================\n");
            System.out.print("\n1.Add Expense\n2.Delete Expense\n3.View Expenses\n4.SearchExpense\n5.EXIT\n");
            System.out.print("Please enter you choice here: ");
            
            int n=sc.nextInt();
            sc.nextLine();
            
            
            switch(n){
                case 1 ->{
                    System.out.print("\nEnter Amount: ");
                    int amount=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter day (DD): ");
                    int day=sc.nextInt();
                    System.out.print("Enter month (MM): ");
                    int month=sc.nextInt();
                    System.out.print("Enter year (YYYY): ");
                    int year=sc.nextInt();
                    sc.nextLine();
                    LocalDate l=LocalDate.of(year,month,day);
                    System.out.print("Enter category: ");
                    String category=sc.nextLine();
                    tracker.addExpense(amount, l, category);
    
                }

                case 2->{
                    System.out.print("Enter id of the expense you want to delete: ");
                    int deleteid=sc.nextInt();
                    sc.nextLine();
                    boolean check=tracker.deleteExpense(deleteid);
                    if(check)System.out.println("Deleted Succesfully");
                    else System.out.println("Expense not found ");

                    
                }
                case 3->{
                    tracker.viewExpenses();
                    
                }
                case 4->{
                    System.out.print("Enter id of the expense you want to search: ");
                    int searchid=sc.nextInt();
                    sc.nextLine();
                    tracker.searchExpense(searchid);
                    
                }
                case 5-> {
                    return;
                }
                default ->{
                    System.out.println("enter a valid choice");
                }
            }
            
        }
   
    }
    
}
