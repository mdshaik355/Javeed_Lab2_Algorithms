package MinNotes;

import java.util.*;

public class SystemInput {
    public Map denominationCollector() {
        Scanner ipObj = new Scanner(System.in);
        System.out.println("Please enter the size of currency denominations:");

        int size = ipObj.nextInt();

        Map<Integer,Integer> denom = new TreeMap<Integer, Integer>(Collections.reverseOrder());

        for(int index=1; index<=size; index++) {
            System.out.println("Please enter the currency denominations number "+index+"'s value :");
            denom.put(ipObj.nextInt(),0);
        }
        denom.putAll(denom);
        return denom;
    }

    public int amountCollector() {
        Scanner ipObj = new Scanner(System.in);
        System.out.println("Please enter the amount you want to pay:");
        return ipObj.nextInt();
    }
}