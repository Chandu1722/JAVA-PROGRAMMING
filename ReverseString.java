import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        sc.close();  // Close scanner after input

        StringBuilder str = new StringBuilder();

        // Loop from the last index to the first
        for (int i = s.length() - 1; i >= 0; i--) {
            str.append(s.charAt(i));
        }

        // Print the reversed string
        System.out.println("Reversed string: " + str.toString());
    }
}
