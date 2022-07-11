package MinNotes;

import java.util.Map;
import java.util.TreeMap;

public class NoteCalculator {
    public static void main(String args[]) {

        SystemInput uTObj = new SystemInput();
        Map<Integer, Integer> denominations = new TreeMap<Integer, Integer>();
        denominations = uTObj.denominationCollector();
        Integer value = uTObj.amountCollector();

        for (Map.Entry<Integer, Integer> index : denominations.entrySet()) {
            denominations.put(index.getKey(), value / index.getKey());
            value = value % index.getKey();
        }

        System.out.println("Your payment approach in order to give min no of notes will be:");
        for (Map.Entry<Integer, Integer> index : denominations.entrySet()) {
            if (index.getValue() != 0)
                System.out.println(index.getKey() + " denomination " + index.getValue() + " times");
        }
        System.out.println("Remaining amount not payable = " + value);
    }
}