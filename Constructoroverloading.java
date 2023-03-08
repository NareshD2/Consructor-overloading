public class Constructoroverloading {
    int modelno;
    int price;
    String name;

    Constructoroverloading(int n, int n1) {
        modelno = n;
        price = n1;
        name = "naresh";
        System.out.println(modelno + " " + price + " " + name);
    }

    Constructoroverloading(int n, int n1, String n2) {
        modelno = n;
        price = n1;
        name = n2;
        System.out.println(modelno + " " + price + " " + name);
    }

    public static void main(String[] args) {
        Constructoroverloading sb1 = new Constructoroverloading(3445, 78900);
        Constructoroverloading sb2 = new Constructoroverloading(68687, 7857, "bajaj");

    }
}
