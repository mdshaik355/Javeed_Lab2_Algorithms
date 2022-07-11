
package PayMoney1;
import java.util.Scanner;

public class InputOutput {
	
    public int[] transactionCollector() {
        Scanner scObj=new Scanner(System.in);
        System.out.println("Enter the number of transactions: ");
        int transactions = scObj.nextInt();
        System.out.println("Enter the transactions:");
        int[] transactionArr = new int[transactions];

        for (int index=0;index<transactions;index++) {
            transactionArr[index]=scObj.nextInt();
        }

        return transactionArr;
    }

    
    public int valueCollector() {
        Scanner scObj=new Scanner(System.in);
        System.out.println("Enter the number of Targets: ");
        return scObj.nextInt();
    }

       public int tranGet() {
        Scanner scObj=new Scanner(System.in);
        System.out.println("Enter the Target: ");
        return scObj.nextInt();
    }

}
