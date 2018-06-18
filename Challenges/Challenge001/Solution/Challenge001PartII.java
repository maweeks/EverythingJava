import java.util.Scanner;

public class Challenge001PartII {
    public static void main(String[] args) {
        System.out.print("Enter your square width: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if ((x==0) || (y==0) || (x==(size-1)) || (y==(size-1)) || (x==y) || ((x+y)==(size-1))) {
                    System.out.print("x");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
