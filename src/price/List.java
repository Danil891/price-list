package price;

/* что я должен уметь:
добавление товара +
изменение цены
изменение имени товара по коду
определение цены покупки по коду и кол-ву
удаление товара +
 */

import java.util.*;

public class List {
    private Map<Integer, String> listP;
    public List(Map<Integer, String> listP){
        this.listP = listP;
    }

    public void putInListP(Integer code, String name) {
        listP.put(code, name);
    }
    public void outOffListP(Integer code){
        listP.remove(code);
    }
    public void changeP(Integer code, String name){
        listP.replace(code,name);
    }

}



