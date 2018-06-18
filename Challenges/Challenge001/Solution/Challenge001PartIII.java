import java.lang.Math;
import java.util.Scanner;

public class Challenge001PartIII {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter grid size: ");
       float size = sc.nextInt();

       float cp = (size - 1) / 2;           // centerPoint of circle
       float r = size / 2;                  // radius of circle
       double min = Math.pow((r - 1), 2);   // min distance from cp to be part of circle
       double max = Math.pow(r, 2);         // max distance from cp to be part of circle

        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                // calculate disance from cp
                double h2 = (Math.pow((cp - x), 2) + Math.pow((cp - y), 2));
                if ((h2 < max) && (h2 > min)) {
                    System.out.print("#");
                } else if ((y == 0) || (y == (size-1)) || (x == 0) || (x == (size-1))) {
                    System.out.print(".");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
