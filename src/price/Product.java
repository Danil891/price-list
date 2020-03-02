package price;

public class Product {

    public static class RoubKope{
        int roub;
        int kope;
        public RoubKope(int roub, int kope){
            this.roub = roub;
            this.kope = kope;
        }
        public RoubKope(int kope) {
            this.roub = kope / 100;
            this.kope = kope % 100;
        }

    }
}
