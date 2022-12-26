package Lesson_1;

import Utils.PrintTitle;

import java.util.Random;

public class IfElseStatementTheme {

    public static void main(String[] args) {
        //1
        PrintTitle.printTitle("1. Перевод псевдокода на язык Java");
        Random random = new Random();

        int randomAge = random.nextInt(50);
        byte maxAge = 20;

        if (randomAge > maxAge) {
            System.out.println("Вы старше 20 лет");
        } else {
            System.out.println("Вы младше 20 лет");
        }

        boolean isMan = random.nextBoolean();
        if (!isMan) {
            System.out.println("Женщина");
        } else {
            System.out.println("Мужчина");
        }

        double height = random.nextDouble(3);
        double maxHeight = 1.8;

        if (height < maxHeight) {
            System.out.println("Ваш рост меньше 1 м 80 см");
        } else {
            System.out.println("Ваш рост выше 1 м 80 см");
        }

        String[] names = {
                "Mike",
                "Jon",
                "Bob",
                "Ivan",
                "Kate",
        };
        int randomNameIndex = random.nextInt(4);

        String randomName = names[randomNameIndex];

        char capitalLetter = randomName.charAt(0);

        if (capitalLetter == 77) {
            System.out.println("Ваше имя - " + randomName + " начинается на букву М");
        } else if (capitalLetter == 73) {
            System.out.println("Ваше имя - " + randomName + " начинается на букву I");
        } else {
            System.out.println("Ваше имя - " + randomName + " и оно начинается на букву отличную от M и I");
        }

        //2
        PrintTitle.printTitle("2. Поиск max и min числа");

        int num1 = random.nextInt(-100, 100);
        int num2 = random.nextInt(-100, 100);


        if (num1 == num2) {
            System.out.println("Числа равны");
        } else if (num1 > num2) {
            System.out.println("num1 = " + num1 + "; num2 = " + num2 + "; max number = " + num1);
        } else {
            System.out.println("num1 = " + num1 + "; num2 = " + num2 + "; max number = " + num2);
        }

        //3
        PrintTitle.printTitle("3. Проверка числа");

        System.out.println("Число: " + num1);

        if (num1 != 0) {
            if (num1 % 2 == 0) {
                System.out.println(" - четное");
            } else {
                System.out.println(" - не четное");
            }

            if (num1 > 0) {
                System.out.println(" - положительное");
            } else {
                System.out.println(" - отрицательное");
            }
        } else {
            System.out.println("Число равно 0");
        }

        //4
        PrintTitle.printTitle("4. Поиск одинаковых цифр в числах");

        int num3 = random.nextInt(100, 999);
        int num4 = random.nextInt(100, 999);

        int hundredsNum3 = num3 / 100;
        int tensNum3 = num3 / 10 % 10;
        int onesNum3 = num3 % 10;

        int hundredsNum4 = num4 / 100;
        int tensNum4 = num4 / 10 % 10;
        int onesNum4 = num4 % 10;

        System.out.println("Num3 = " + num3 + "; num4 = " + num4);

        if (hundredsNum3 != hundredsNum4 && tensNum3 != tensNum4 && onesNum3 != onesNum4) {
            System.out.println("Нет совпадений в разрядах");
        }

        if (onesNum3 == onesNum4) {
            System.out.println("Совпадение в I разряде: " + onesNum3 + " = " + onesNum4);
        }

        if (tensNum3 == tensNum4) {
            System.out.println("Совпадение во II разряде: " + tensNum3 + " = " + tensNum4);
        }

        if (hundredsNum3 == hundredsNum4) {
            System.out.println("Совпадение в III разряде: " + hundredsNum3 + " = " + hundredsNum4);
        }

        //5
        PrintTitle.printTitle("5. Определение символа по его коду");

        char symbol = '\u0057';
        System.out.println(symbol);

        if (symbol >= '0' && symbol <= '9') {
            System.out.println("Это цифра");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Это большая буква");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Это маленькая буква");
        } else {
            System.out.println("Это не число и не буква");
        }

        //6
        // Я так понял подразумевается срок вклада 1 год
        PrintTitle.printTitle("6. Подсчет суммы вклада и начисленных банком %");

        int deposit = 300_000;
        byte percent = 5;

        if (deposit > 300_000) {
            percent = 10;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 7;
        }

        int income = (deposit * percent) / 100;

        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Начисленный процент: " + income);
        System.out.println("Итоговая сумма: " + (deposit + income));

        //7
        PrintTitle.printTitle("7. Определение оценки по предметам");

        byte historyPoints = 59;
        byte programmingPoints = 91;

        byte historyGrade = 5;
        byte programmingGrade = 5;

        if (historyPoints <= 60) {
            historyGrade = 2;
        } else if (historyPoints > 60) {
            historyGrade = 3;
        } else if (historyPoints > 73) {
            historyGrade = 4;
        }

        if (programmingPoints <= 60) {
            programmingGrade = 2;
        } else if (programmingPoints > 60) {
            programmingGrade = 3;
        } else if (programmingPoints > 73) {
            programmingGrade = 4;
        }

        System.out.println(historyGrade + " по истории");
        System.out.println(programmingGrade + " по программированию");
        System.out.println("средний балл: " + ((historyGrade + programmingGrade) / 2));
        System.out.println("средний процент: " + ((historyPoints + programmingPoints) / 2));

        //8
        PrintTitle.printTitle("8. Расчет прибыли за год");

        int rent = 5_000;
        int turnover = 13_000;
        int costPrice = 9_000;

        int profit = 12 * (turnover - costPrice - rent);
        System.out.println("Прибыл за год: " + (profit > 0 ? ("+" + profit) : (profit + " руб.")));

        //9
        PrintTitle.printTitle("9. Подсчет количества банкнот");

        int amount = 567;

        int numberOfBanknotes_100_inBank = 10;
        int numberOfBanknotes_10_inBank = 5;
        int numberOfBanknotes_1_inBank = 50;

        int hundredsInAmount = amount / 100;
        int tensInAmount = amount / 10 % 10;

        int countHundreds;
        int countTens;
        int countOnes;

        if (numberOfBanknotes_100_inBank >= hundredsInAmount) {
            countHundreds = hundredsInAmount;
        } else {
            countHundreds = numberOfBanknotes_100_inBank;
        }
        amount -= countHundreds * 100;

        if (numberOfBanknotes_10_inBank >= tensInAmount) {
            countTens = tensInAmount;
        } else {
            countTens = numberOfBanknotes_10_inBank;
        }
        amount -= countTens * 10;

        if (numberOfBanknotes_1_inBank >= amount) {
            countOnes = amount;
        } else {
            countOnes = numberOfBanknotes_1_inBank;
        }
        amount -= countOnes;

        if (amount > 0) {
            System.out.println("не достаточно для выдачи: " + amount + " USD");
        }

        System.out.println("100 USD: " + countHundreds);
        System.out.println("10 USD: " + countTens);
        System.out.println("1 USD: " + countOnes);

        System.out.println("Сумма к выдаче: " + (100 * countHundreds + 10 * countTens + countOnes) + " USD");
    }
}
