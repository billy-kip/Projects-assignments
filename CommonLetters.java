import java.util.Scanner;

public class CommonLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int size1 = input.nextInt();
        char[] list1 = new char[size1];

        for (int i = 0; i < size1; i++) {
            list1[i] = input.next().charAt(0);
        }

        System.out.print("Enter list2: ");
        int size2 = input.nextInt();
        char[] list2 = new char[size2];

        for (int i = 0; i < size2; i++) {
            list2[i] = input.next().charAt(0);
        }

        System.out.print("The common elements are: ");

        for (int i = 0; i < size1; i++) {
            boolean found = false;

            for (int j = 0; j < size2; j++) {
                if (list1[i] == list2[j]) {
                    found = true;
                    break;
                }
            }

            boolean alreadyDisplayed = false;

            for (int k = 0; k < i; k++) {
                if (list1[k] == list1[i]) {
                    alreadyDisplayed = true;
                    break;
                }
            }

            if (found && !alreadyDisplayed) {
                System.out.print(list1[i] + " ");
            }
        }

        System.out.println();
        input.close();
    }
}
