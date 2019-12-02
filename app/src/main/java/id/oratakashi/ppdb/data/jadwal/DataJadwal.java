package id.oratakashi.ppdb.data.jadwal;

import java.util.ArrayList;
import java.util.List;

public class DataJadwal {
    public static List<String> name(){
        List<String> dummy = new ArrayList<>();
        for(int i=1; i<=10; i++){
            dummy.add("Gelombang "+ i);
        }
        return dummy;
    }
    public static List<String> tgl(){
        List<String> dummy = new ArrayList<>();
        for(int i=1; i<=10; i++){
            dummy.add(i+" Nov 2019 - "+(i+1)+" Des 2019");
        }
        return dummy;
    }
}
