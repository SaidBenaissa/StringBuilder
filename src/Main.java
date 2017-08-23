import java.util.Scanner;

/**
 * Created by benaissa on 8/23/17.
 */
public class Main {
    public static void main(String [] args)
    {
        String str1 = "Hello";
        String str2 = "world";
        String str3 = str1+", "+str2+" !";
        System.out.println(str3);
        StringBuilder sb =new StringBuilder("Hello")
        .append(", ")
        .append("world !");
      //  System.out.println(sb);
       // .delete(5,sb.length());
        System.out.println(sb);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");
        String input = scanner.nextLine();
        System.out.println(input);
        sb.delete(0,sb.length());
        System.out.println(sb);

        for (int i = 0; i < 3; i++) {
            input =scanner.nextLine();
            sb.append(input);

        }
        System.out.println(sb);


    }
}
