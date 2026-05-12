import java.util.*;

public class BadExample {

    static String password = "12345";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int unused = 100;

        System.out.println("Enter number:");

        int num = sc.nextInt();

        int result = 100 / num;

        System.out.println("Result: " + result);

        String text = null;

        if (text.equals("hello")) {
            System.out.println("Hi");
        }

        int[] arr = {1, 2, 3};

        System.out.println(arr[10]);

        try {
            int x = Integer.parseInt("abc");
        } catch (Exception e) {

        }

        if (false) {
            System.out.println("Dead code");
        }

        while (true) {
            break;
        }

        String query =
                "SELECT * FROM users WHERE id = '" + num + "'";

        System.out.println(query);

        sc = null;

        System.out.println(sc.nextLine());
    }
}