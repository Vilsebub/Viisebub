 import java.util.Scanner;

public class Shitovod {
    private static int x = 1;

    public static void main(String[] args) {
        while (x == 1) {
            System.out.println("Работаем? \n>1-да \n0-нет");
            Scanner one = new Scanner(System.in);
            int zavershenie = one.nextInt();
            if (zavershenie==0) {
                break;
            }
            calcylirovanie();
        }
    }


    public static void calcylirovanie () {
        Scanner in = new Scanner(System.in);
        System.out.println("Калькулятор - 1. Решение уравнения - 2");
        String e = in.next();

        if (e.equals("1")) {
            System.out.println("Введите 1 число");
            double f1rst = in.nextInt();
            System.out.println("Введите 2 число");
            double sec0nd = in.nextInt();
            System.out.println("Выберете операцию(+,-,/,*):");
            String op = in.next();

            if (op.equals("+")) {
                System.out.println( summa(f1rst, sec0nd));
            } else if (op.equals("-")) {
                System.out.println(sub(f1rst, sec0nd));
            } else if (op.equals("/")) {
                System.out.println(delenie(f1rst, sec0nd));
            } else if (op.equals("*")) {
                System.out.println(mult(f1rst,sec0nd));
            }else {
                System.out.println("Ошибка");
            }
        } else if (e.equals("2")) {
            System.out.println("Введите a:");
            double a = in.nextInt();
            System.out.println("Введите b:");
            double b = in.nextInt();
            System.out.println("Введите c:");
            double c = in.nextInt();
            System.out.println(urav(a,b,c ));

        }else {
            System.out.println("Ошибка");
        }

    }


    public static double summa(double f1rst, double sec0nd) {
        return f1rst + sec0nd;
    }

    public static double sub(double f1rst, double sec0nd) {
        return f1rst - sec0nd;
    }

    public static double delenie(double f1rst, double sec0nd) {
        return f1rst / sec0nd;
    }

    public static double mult(double f1rst, double sec0nd) {
        return f1rst * sec0nd;
    }

    public static String urav(double a, double b, double c) {
        double d = b * b - (4 * a * c);
        String ansver;
        if (d > 0) {
            double x1 = ((-1) * b - Math.sqrt(d)) / (2 * a);
            double x2 = ((-1) * b + Math.sqrt(d)) / (2 * a);
            ansver = ("x1 = " + x1 + "\nx2 = " + x2);
        } else if (d == 0) {
            double x = (-1) * b / (2 * a);
            ansver = ('x' + "=" + x);
        } else {
            ansver = ("Нет корней");
        }

        return ansver;
    }
}