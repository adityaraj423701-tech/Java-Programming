import java.util.Scanner;

class stringfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();

        if (s.length() >= 7) {
            System.out.println("Character at 6th location is " + s.charAt(6));
        } else {
            System.out.println("String is too short to access 6th location.");
        }

        System.out.println("Length of string is " + s.length());
        System.out.println("Upper case of the string: " + s.toUpperCase());
        sc.close();
    }
}