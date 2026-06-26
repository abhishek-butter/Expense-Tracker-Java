import java.time.*;
import java.util.ArrayList;



public class Expense{
    private int id;
    private int amount;
    private LocalDate date;
    private String category;

    public Expense(int id,int amount,LocalDate date,String category){
        this.id=id;
        this.amount=amount;
        this.date=date;
        this.category=category;
    }
    public Expense(int id,int amount,String category){
        this(id,amount,LocalDate.now(),category);
    }
    public Expense(int id,int amount){
        this(id,amount,LocalDate.now(),"Unknown");
        
    }
    public Expense(int id,int amount,LocalDate d){
        this(id,amount,d,"Unknown");
        
    }
    @Override
    public String toString(){
        String s="";
        s+="\n=============================================================================\n";  
        s+="ID: "+id;     
        s+="\n=============================================================================\n";        
        s+="Category: "+category+"\n";   
        s+="Date: "+date+"\n";    
        s+="Amount: "+amount+"\n";
        return s;   
    }

    public int getAmount(){
        return amount;
    }
    public LocalDate getDate(){
        return date;

    }
    public String getCategory(){
        return category;
    }
    public void setAmount(int a){
        amount=a;
    }
    public void setDate(LocalDate a){
        date=a;
    }
    public void setCategory(String a){
        category=a;
    }
    public int getId(){
        return id;
    }

    

}
