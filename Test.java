import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int[] angka = {1, 2, 3};
        int[] angka2 = new int[5];
        angka2[0] = 10;
        angka2[3] = 100;

        String[] nama = {"Ana", "Salsa", "Ari"};
        String[] nama2 = new String[10];

        //Array object
        Scanner s = new Scanner(System.in);
        System.out.println("berapa objek?");
        Product[] p = new Product[10];
        for (int i = 0; i < p.length; i++) {
            System.out.pritIn("Number : ");
            int number = s.nextInt();
            s.nextInt();
            System.out.println("Name : ");
            String name = s.nextLine();
            System.out.println("Quantity : ");
            Int quantity = s.nextInt();
            System.out.println("price : ");
            double price = s.nextDouble()
            p[i] = new Product(number, name, quantity, price);
            p[i].print();
        }
        p[1] = new Product();

        CD[] c = new CD[5];
        c[4] = new CD();
    }
}
