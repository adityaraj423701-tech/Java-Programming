import java.util.Scanner;

public class count_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String str;
        if (sc.hasNextLine()) {
            str = sc.nextLine();
        } else {
            str = "aeiou"; // default value if no input is provided
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
        sc.close();
    }
}
