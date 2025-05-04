// Q1. data type


public class dataType {
    public static void main(String[] args) {
        int a;
        char c;
        String s;
        float f;
        double d;
        long l;
        boolean flag;
        int i[] = { 1, 2, 3, 4, 5 };

        // Assign the values
        a = 30;
        c = 'h'; // Character should be enclosed in single quotes
        s = "he";
        f = 0.56f; // 'f' suffix for float
        d = 56.256;
        l = 6787878878L; // 'L' suffix for long
        flag = true;

        // Print the values
        System.out.println("Integer: " + a);
        System.out.println("Character: " + c);
        System.out.println("String: " + s);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Long: " + l);
        System.out.println("Boolean: " + flag);
        System.out.print("Array: ");
        for (int num : i) {
            System.out.print(num + " ");
        }
    }
}