package id.oratakashi.ppdb.data.payment;

import java.util.ArrayList;
import java.util.List;

public class DataPayment {
    public static List<String> dummy_name(){
        List<String> dummy = new ArrayList<>();
        dummy.add("BNI");
        dummy.add("BRI");
        dummy.add("BCA");
        dummy.add("Paypal");

        return dummy;
    }
}
