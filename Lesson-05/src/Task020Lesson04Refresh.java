public class Task020Lesson04Refresh {
    public static void main(String[] args) {
        int gradeBoundary = -1;
        String grade = "C";
        switch (grade){
            case "A":
                gradeBoundary = 80;
                break;
            case "B":
                gradeBoundary = 70;
                break;
            case "C":
                gradeBoundary = 60;
                break;
            case "D":
                gradeBoundary = 50;
                break;
            case "E":
                gradeBoundary = 40;
                break;
            case "F":
                gradeBoundary = 0;
                break;
            default:
                System.out.println("Invalid grade.");
                break;
        }
        System.out.println(grade + " grade boundary is " + gradeBoundary);
    }
}
