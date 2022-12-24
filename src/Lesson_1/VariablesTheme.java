package Lesson_1;

public class VariablesTheme {

    public static void main(String[] args) {
        // 1
        System.out.println("""
                \u001B[32m
                1. Вывод значений переменных на консоль
                \u001B[0m""");

        byte ssdSize = 64;
        short ramSize = 1024;
        int cpuFrequency = 7000000;
        long price = 12345678911521515L;
        float memoryFrequency = 123.45F;
        double gpuFrequency = 123.45;
        char cpuModelPrefix = 102;
        boolean isMegaComputer = false;

        System.out.println("ssd size: " + ssdSize + " gb");
        System.out.println("ram size: " + ramSize + " mb");
        System.out.println("cpu frequency: " + cpuFrequency + " MHz");
        System.out.println("price: " + price + " rub");
        System.out.println("memory frequency: " + memoryFrequency + " MHz");
        System.out.println("gpu frequency: " + gpuFrequency + " MHz");
        System.out.println("cpu model prefix: " + cpuModelPrefix);
        System.out.println("is a mega computer: " + isMegaComputer);

        // 2
        System.out.println("""
                \u001B[32m
                2. Расчет стоимости товара со скидкой
                \u001B[0m""");

        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;

        int discountSum = (penPrice + bookPrice) * discount / 100;
        int totalPrice = (penPrice + bookPrice) - discountSum;
        System.out.println("Сумма скидки: " + discountSum + " руб");
        System.out.println("Итоговая сума с учетом скидки: " + totalPrice + " руб");

        // 3
        System.out.println("""
                \u001B[32m
                3. Вывод слова JAVA
                \u001B[0m""");

        System.out.println("   J    a  v     v  a      ");
        System.out.println("   J   a a  v   v  a a     ");
        System.out.println("J  J  aaaaa  V V  aaaaa    ");
        System.out.println(" JJ  a     a  V  a     a   ");

        // 4
        System.out.println("""
                \u001B[32m
                4. Вывод min и max значений целых числовых типов
                \u001B[0m""");

        byte b = Byte.MAX_VALUE;
        short s = Short.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        long l = Long.MAX_VALUE;

        System.out.println("max byte = " + b);
        System.out.println("max byte + 1 = " + (++b));
        System.out.println("max byte - 1 = " + (--b));

        System.out.println("\nmax short = " + s);
        System.out.println("max short + 1 = " + (++s));
        System.out.println("max short - 1 = " + (--s));

        System.out.println("\nmax int = " + i);
        System.out.println("max int + 1 = " + (++i));
        System.out.println("max int - 1 = " + (--i));

        System.out.println("\nmax long = " + l);
        System.out.println("max long + 1 = " + (++l));
        System.out.println("max long - 1 = " + (--l));

        // 5
        System.out.println("""
                \u001B[32m
                5. Перестановка значений переменных
                \u001B[0m""");

        int num1 = 2;
        int num2 = 5;
        System.out.println("Начальные значения: num1 = " + num1 + ", num2 = " + num2);

        int temp = num2;
        num2 = num1;
        num1 = temp;
        System.out.println("\nПерестановка с помощью третьей переменной: num1 = " + num1 + ", num2 = " + num2);

        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Перестановка с помощью арифметических операций: num1 = " + num1 + ", num2 = " + num2);

        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Перестановка с помощью побитовой операции: num1 = " + num1 + ", num2 = " + num2);

        // 6
        System.out.println("""
                \u001B[32m
                6. Вывод символов и их кодов
                \u001B[0m""");

        char q = '#';
        char w = '&';
        char e = '@';
        char r = '^';
        char t = '_';
        System.out.println("35: " + q);
        System.out.println("38: " + w);
        System.out.println("64: " + e);
        System.out.println("94: " + r);
        System.out.println("95: " + t);

        // 7
        System.out.println("""
                \u001B[32m
                7. Вывод в консоль ASCII-арт Дюка
                \u001B[0m""");

        char slash = '/';
        char backSlash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';

        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println(
                "" + slash + underscore + underscore + underscore
                        + underscore + slash + backSlash + underscore + underscore + backSlash
        );

        // 8
        System.out.println("""
                \u001B[32m
                8. Вывод количества сотен, десятков и единиц числа
                \u001B[0m""");

        int number = 123;

        int x = number / 100;
        int y = number / 10 % 10;
        int z = number % 10;

        System.out.println("Число " + number + " содержит: \n"
                + x + " сотен \n" + y + " десятков \n" + z + " единиц \n");
        System.out.println("Сумма его чисел = " + (x + y + z));
        System.out.println("Произведение его чисел = " + (x * y * z));

        // 9
        System.out.println("""
                \u001B[32m
                9. Вывод времени
                \u001B[0m""");

        int seconds = 86399;

        int hour = seconds / 3600;
        int min = seconds / 60 % 60;
        int sec = seconds % 60;

        System.out.println(hour + ":" + min + ":" + sec);
    }
}
