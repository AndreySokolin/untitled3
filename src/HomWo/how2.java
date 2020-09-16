package HomWo;

import java.sql.SQLOutput;

public class how2 {
    public static void main(String[] args) {


        double result = evalvateExpression(2, 3, 3, 5);

        System.out.println(result);
    }

    private static double evalvateExpression(int a, int b, int c, int d) {
        return a * (b + (1.0 * c / d));

    }
}