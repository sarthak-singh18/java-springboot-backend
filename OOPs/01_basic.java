//OOPS : Object oreinted programinng languagre 
// insted of writing a large program as a collection of function we organise the 
// programm around the Object

//Class is a blueprint/template for creating object

// class=blueprint
// object=actual thing created from blueprint

//object
class BankAccount{
    String accountNumber;
    String holderName;
    int balance;
    

    BankAccount(String accountNumber,String holderName,int balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    void deposit(int amount){
        balance+=amount;
    }

    void withdraw(int amount){
        if(amount>balance){
            System.out.println("Insufficient balacne");
            return;
        }
        balance-=amount;
    }

    void displayBalance(){
        System.out.println(balance);

    }
}
class Main{
    public static void main(String[] args){
        BankAccount a1= new BankAccount("124","Sarthak",23500);
        BankAccount a2= new BankAccount("125","Rahul",34456);
        a1.deposit(1000);
        a1.withdraw(3000);
        a1.displayBalance();
        
         a1.deposit(4000);
         a1.withdraw(3000);
         a1.displayBalance();


    }
}