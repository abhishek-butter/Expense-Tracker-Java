
import java.time.*;
import java.util.ArrayList;




class ExpenseTracker{
    private int nextId=1;
    
    private String name;

    private ArrayList<Expense> expenses;

    public ExpenseTracker(String name){
        this.name=name;
        expenses=new ArrayList<>();
        
        

    }
    public void addExpense(int amount,LocalDate date,String category){
        
        Expense a=new Expense(nextId,amount,date,category);
        System.out.println("\nYour expense id is "+nextId);
        
        expenses.add(a);
        nextId++;
        
        

    }
    public boolean deleteExpense(int id){
        boolean found=false;
        
        for(int i=0;i<expenses.size();i++){
            if(expenses.get(i).getId()==id){
                expenses.remove(i);
                found=true;

                break;
            }
        }
        return found;
    }
    public void viewExpenses(){
        if(expenses.isEmpty()){
            System.out.println("No expense recorded");
            return;
        }
        for(Expense e:expenses){
            System.out.print(e.toString());
        }

    }
    public void searchExpense(int id){
        boolean found=false;
        for(Expense e:expenses){
            if(e.getId()==id){
                System.out.print(e.toString());
                found=true;
                break;
            }
        }
        if(!found){
            System.out.printf("Expense with id %d not found\n",id);
        }
    }


}