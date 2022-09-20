//decalring Account as clas
public class Account {

    //declaring variables
    private String holderName;
    private String holderAddress;
    private int openingBalance;
    private int currentBalance;
    private int creditLimit;

    // Static variable to store the total number of accounts
    public static int numOfAccounts = 0;

    /**
     * Constructor
     */
    public Account(String name, String address, int startAmount, int balance, int credit) {
        holderName = name;
        holderAddress = address;       
        openingBalance = startAmount;
        currentBalance = balance;
        creditLimit = credit;
        numOfAccounts++;
    }

    // set the account holder name
    public void setName(String name){
        holderName = name;
    }

    //get the account holder name
    public String getName(){
        return holderName;
    }

    //set the account holder address
    public void setAddress(String address){
        holderAddress = address;
    }

    //get the account holder address
    public String getAddress(){
        return holderAddress;
    }

    /**
     * Set the balance
     */
    public void setBalance( int amount)  {
        currentBalance = amount;
    }

    /**
     * Get the balance
     */
    public int getBalance()   {
        return currentBalance;
    }

    /**
     * Set the credit limit
     */
    public void setCreditLimit(int amount) {
        creditLimit = amount;
    }

    /**
     * Get the credit limit
     */
    public int getCreditLimit()   {
        return creditLimit;
    }

    /**
     * Show all the data of the customer in method showdata
     */ 
    public void showData()     {
        System.out.println(holderName + " living in " + holderAddress + " has got balance = " + currentBalance + " credit = " + creditLimit + " with opening balance = " + openingBalance);
    }
    
    
}
