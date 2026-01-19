// controlws the flow of the program 
// main entry point

import transaction.Transaction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        
        // test transaction class is working proeprly
        Transaction transaction1 = new Transaction("ididiid" , "TenSixtySix", 2000);

        System.out.println(transaction1);
    }
}
