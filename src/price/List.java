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
    public static class Product {

        private String name;
        private final int roub;
        private final int kope;

        public Product(String name, int roub, int kope) {
            this.name = name;
            this.roub = roub;
            this.kope = kope;
        }

        public Product(String name, int kope) {
            this.name = name;
            this.roub = kope / 100;
            this.kope = kope % 100;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", roub=" + roub +
                    ", kope=" + kope +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return roub == product.roub &&
                    kope == product.kope &&
                    name.equals(product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, roub, kope);
        }
    }

    private Map<Integer, Product> listP;

    public List(Map<Integer, Product> listP){
        this.listP = listP;
    }

    public List() {
        this.listP = new HashMap<Integer, Product>();
    }

    public void addProduct(Integer code, Product product) {
        listP.put(code, product);
    }

    public void removeProduct(Integer code){
        listP.remove(code);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        List list = (List) o;
        return listP.equals(list.listP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listP);
    }

    @Override
    public String toString() {
        return "List{" + listP + '}';
    }
}



