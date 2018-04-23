public class Challenge001PartI {
    public static void main(String[] args) {
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                if ((x==0) || (y==0) || (x==4) || (y==4) || (x==y) || ((x+y)==4)) {
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
