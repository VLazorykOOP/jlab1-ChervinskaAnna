import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Lab 1 Java");
        System.out.println("Select the task you would like to see (1-4)");
        int choice = s.nextInt();
        switch (choice) {
            case 1: {
                First();
                break;
            }

            case 2: {
                Second();
                break;
            }

            case 3: {
                Third();
                break;
            }

            case 4: {
                Fourth();
                break;
            }
            default: {
                System.out.print("There is no number with this task number");
                break;
            }
        }
    }

    public static void First() {
        Scanner s = new Scanner(System.in);
        System.out.println("Select what you want");
        System.out.println("Input data of valid type, result - valid");
        System.out.println("Input data integer type, result - valid type");
        System.out.println("Input is a valid type, result is an integer");
        int choice = s.nextInt();
        switch (choice) {
            case 1: {
                float x, y;
                System.out.println("Enter x");
                x = s.nextFloat();
                System.out.println("Enter y");
                y = s.nextFloat();
                if (x == 0 || y == 0) {
                    throw new IllegalArgumentException("Error: The entered number is equal 0.");
                } else {
                    float res = ((2 * x * x + x * y) / (x * y) * (x * y))
                            + (((3 * x * y) - (y * y * y)) / (x * x) + (2 * y * y));
                    System.out.println("Option 1: " + res);
                    break;
                }
            }
            case 2: {
                int x, y;
                System.out.println("Enter x");
                x = s.nextInt();
                System.out.println("Enter y");
                y = s.nextInt();
                if (x == 0 || y == 0) {
                    throw new IllegalArgumentException("Error: The entered number is equal 0.");
                } else {
                    float res = ((2 * x * x + x * y) / (x * y) * (x * y))
                            + (((3 * x * y) - (y * y * y)) / (x * x) + (2 * y * y));
                    System.out.println("Option 2: " + res);
                    break;
                }
            }

            case 3: {
                int x, y;
                System.out.println("Enter x");
                x = s.nextInt();
                System.out.println("Enter y");
                y = s.nextInt();
                if (x == 0 || y == 0) {
                    throw new IllegalArgumentException("Error: The entered number is equal 0.");
                } else {
                    int res = ((2 * x * x + x * y) / (x * y) * (x * y))
                            + (((3 * x * y) - (y * y * y)) / (x * x) + (2 * y * y));
                    System.out.println("Option 3: " + res);
                    break;
                }
            }
            default: {
                System.out.print("There is no number with this option");
                break;
            }
        }
    }

    public static void Second() {
        float a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a (a < b)");
        a = s.nextFloat();
        System.out.println("Enter b (a < b) ");
        b = s.nextFloat();
        System.out.print("Size massive? ");
        int n = s.nextInt();
        float[] X = new float[n];
        for (int i = 0; i < n; i++) {
            if (a > b || b < a) {
                System.out.print("Сondition not met(a < b)");
                break;
            }
            System.out.print("Element " + (i + 1) + ": ");
            X[i] = s.nextFloat();
        }
        float Sum = 0, Mult = 1;
        for (int i = 0; i < n; i++) {
            if (X[i] < a) {
                Sum += X[i];
            }
            if (X[i] > b) {
                Mult *= X[i];
            }
        }
        System.out.println("Sum " + Sum);
        System.out.println(" Multiplication " + Mult); // ??????
        float Max = 0, Min = 0;

        for (int i = 0; i < n; i++) {
            if (X[i] > Max) {
                Max = X[i];
            }
            if (X[i] < Min) {
                Min = X[i];
            }
        }
        System.out.println("Max " + Max);
        System.out.println("Min " + Min);
    }

    public static void Third() {
        Scanner s = new Scanner(System.in);
        System.out.print("Size matrix? ");
        int n = s.nextInt();
        float[][] X = new float[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element " + "i[" + (i + 1) + "] " + "j[" + (j + 1) + "]" + ": ");
                X[i][j] = s.nextFloat();
            }
        }

        System.out.println("Matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(X[i][j] + " ");
            }
            System.out.print(" \n");
        }

        boolean[] Y = new boolean[n];

        for (int i = 0; i < n; i++) {
            Y[i] = true;
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (X[i][j] == X[i][k]) {
                        Y[i] = false;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(Y[i] + " ");
        }
    }

    public static void Fourth() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter text ");
        String inputText = s.nextLine();
        System.out.println("Text: " + inputText);
        String res = "";
        char FirstLetter = ' ';
        boolean IsStartWord = true;
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == ' ' || inputText.charAt(i) == '?' || inputText.charAt(i) == ','
                    || inputText.charAt(i) == '.'
                    || inputText.charAt(i) == '!' || inputText.charAt(i) == ':' || inputText.charAt(i) == ';') {
                res = res + inputText.charAt(i);
                IsStartWord = true;
            } else {
                if (IsStartWord) {
                    FirstLetter = inputText.charAt(i);
                    res = res + inputText.charAt(i);
                    IsStartWord = false;
                } else if (inputText.charAt(i) != FirstLetter) {
                    res = res + inputText.charAt(i);
                }
            }
        }
        System.out.println("Res: " + res);
    }
}