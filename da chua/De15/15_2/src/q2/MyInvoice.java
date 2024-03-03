/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MyInvoice implements IInvoice{

    @Override
    public String f1(ArrayList<Invoice> a, int st) {
        if (st == 1) {
            Collections.sort(a, Comparator.comparing((Invoice i) -> i.getName().toLowerCase()));
        } else if (st == 2) {
            Collections.sort(a, Comparator.comparingDouble(Invoice:: getTotalamount));
            //Invoice i) -> i.getTotalamount())
        }
    return a.get(1).getName();
}

    @Override
    public int f2(ArrayList<Invoice> a) {
    List<Integer> amounts = new ArrayList<>();
    for (Invoice invoice : a) {
        amounts.add(invoice.getTotalamount());
    }
    
    int x = Collections.max(amounts);
    amounts.remove(Integer.valueOf(x));
    int y = Collections.max(amounts);
    
    a.removeIf((Invoice i) -> i.getTotalamount() == x || i.getTotalamount() == y);
    
    int sum = 0;
    for (Invoice invoice : a) {
        sum += invoice.getTotalamount();
    }
    return sum;
}

    
}
