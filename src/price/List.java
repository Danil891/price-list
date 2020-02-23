package price;

import java.util.*;

public class List {
    public static Map<Integer, String> listP;

    public static void putInListP(Integer code, String name) {
        listP.put(code, name);
    }
    public static void outOffListP(Integer code){
        listP.remove(code);
    }


}



