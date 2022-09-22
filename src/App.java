import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        strings();
    }

    public static void strings() {
        Scanner scanner = new Scanner(System.in);
        String str;
        String[] strArray;
        float sourceNum;
        String sourceMetric;
        String targetMetric;
        while (true) {
            System.out.println("Please input a phrase!");
            str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("Thank you. Goodbye!");
                scanner.close();
                return;
            }
            strArray = str.split(" ");
            if (strArray.length != 4) {
                System.out.println("Your input is not valid. Please try again ):");
                continue;
            } else {
                sourceNum = Float.parseFloat(strArray[1]);
                sourceMetric = strArray[1];
                targetMetric = strArray[3];
                
            }
            break;
        }
        for (String s : strArray) {
            System.out.println(s);
        }
    }

    public static void forLoop() {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number!");
        String str = scanner.next();

        //for (int i = 0; i < 10; i++) {
        //    System.out.println(i);
        //}
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        scanner.close();
    }

    public static void switchStatement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number!");
        String str = scanner.next();
        switch (str) {
            case "0":
                System.out.println("Case 0");
                break;
            case "1":
                System.out.println("Case 1");
                break;
            case "2":
                System.out.println("Case 2");
                break;
            default:
                System.out.println("default");
        }
        scanner.close();
    }
}