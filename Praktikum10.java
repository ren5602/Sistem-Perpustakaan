import java.util.Scanner;

public class Praktikum10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numBooks = 3;
        String[][] bookInfo = new String[numBooks][5];

        bookInfo[0] = new String[] { "123456", "Harry Potter volume 1", "J.K Rowling", "Gramedia", "300" };
        bookInfo[1] = new String[] { "1234567", "Harry Potter volume 2", "J.K Rowling", "Gramedia", "320" };
        bookInfo[2] = new String[] { "12345678", "Harry Potter volume 3", "J.K Rowling", "Gramedia", "340" };

        for (int i = 0; i < numBooks; i++) {
            System.out.println("Book\t\t: " + (i + 1));
            System.out.println("ISBN\t\t: " + bookInfo[i][0]);
            System.out.println("Title\t\t: " + bookInfo[i][1]);
            System.out.println("Author\t\t: " + bookInfo[i][2]);
            System.out.println("Publisher\t: " + bookInfo[i][3]);
            System.out.println("Pages\t\t: " + bookInfo[i][4]);
            System.out.println();
        }
    }
}
