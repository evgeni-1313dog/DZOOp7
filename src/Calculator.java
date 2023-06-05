import java.util.Scanner;

public class Calculator {
    public Calculator(Logger logger){
        double num1;
        double num2;
        double nam1;
        double nam2;
        double ans1;
        double ans2;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите действительную часть комплесного числа: ");
        num1 = reader.nextDouble();
        System.out.print("Введите мнимую часть комплесного числа: ");
        num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        System.out.print("Введите действительную часть комплесного числа: ");
        nam1 = reader.nextDouble();
        System.out.print("Введите мнимую часть комплесного числа: ");
        nam2 = reader.nextDouble();
        switch(op) {
            case '+': ans1 = (num1 + nam1);
                ans2 = (num2 + nam2);
                logger.log("Сложения");

                break;
            case '-': ans1 = num1 - nam1;
                ans2 = (num2 - nam2);
                logger.log("Вычетание");
                break;
            case '*':
                double b = num1 * nam1;
                double a = num2 * nam2;
                double t = (num1 * nam2);
                double y = num2 * nam1;
                ans1 = b - a;
                ans2 = t + y;
                logger.log("Умножение");
                break;
            case '/':
                double q = num1 * nam1;  // -4
                double w = num2 * nam2;  // -12i
                double e = nam1 * num2;  // 2i
                double r = num1 * nam2 * -1; // 6
                double u = q + w;  // 10i
                double i = e + r; // 10
                double o = nam1 * nam1;
                double p = nam2 * nam2;
                double s = o + p;
                ans1 = u / s;
                ans2 = i / s;
                logger.log("Деление");
                break;
            default:  System.out.printf("Error! Enter correct operator");
                return;

        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(ans1 + "+" + ans2 + "i");




    }

}
