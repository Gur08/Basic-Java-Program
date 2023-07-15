package July15;

import java.util.Scanner;

public class MethodOverload {

    public static int calculatoroverload(int num1, int num2) {
        return num1 + num2;
    }

    public static int calculatoroverload(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public static int calculatoroverload(int num1, int num2, int num3, int num4) {
        return num1 - num2 - num3 - num4;
    }
}