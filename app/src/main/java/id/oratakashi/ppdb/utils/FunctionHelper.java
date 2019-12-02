package id.oratakashi.ppdb.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class FunctionHelper {
    public static String formatRupiah(int price) {
        Locale localeID = new Locale("in", "ID");
        NumberFormat format = NumberFormat.getCurrencyInstance(localeID);
        return format.format(price);
    }
}
