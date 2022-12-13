import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter width:");
        int width = stdin.nextInt();
        System.out.println("Enter height:");
        int height = stdin.nextInt();
        char token = '*';

        // i is the number of lines displayed so far.
        // j is the number of tokens displayed so far at i-th line.
        int i = 0, j = 0;
        while(i < height) {
            // This while loop prints the full line of token.
            while(j < width) {
                System.out.print(token);
                j++;
            }
            // At the end of the while: j == width.

            // Print a line return before going back in while(i < height).
            System.out.println();
            // Reset j to 0 for next token line.
            j = 0;
            i++;
        }
        stdin.close();
    }
}
