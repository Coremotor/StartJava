package Lesson_1;

import Helpers.PrintTitle;

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

        char firstChairInName = randomName.charAt(0);
        char letterM = 77;
        char letterI = 73;

        if (firstChairInName == letterM) {
            System.out.println("Ваше имя - " + randomName + " начинается на букву М");
        } else if (firstChairInName == letterI) {
            System.out.println("Ваше имя - " + randomName + " начинается на букву I");
        } else {
            System.out.println("Ваше имя - " + randomName + " и оно начинается на букву отличную от M и I");
        }

        //2
        PrintTitle.printTitle("2. Поиск max и min числа");

        int num1 = random.nextInt(-100, 100);
        int num2 = random.nextInt(-100, 100);

        boolean isNum1MoreNum2 = num1 > num2;

        if (isNum1MoreNum2) {
            System.out.println("num1 = " + num1 + "; num2 = " + num2 + "; max number = " + num1);
        } else if (num1 == num2) {
            System.out.println("Числа равны");
        } else {
            System.out.println("num1 = " + num1 + "; num2 = " + num2 + "; max number = " + num2);
        }

        //3
        PrintTitle.printTitle("3. Проверка числа");

        if (num1 != 0) {

            if (num1 % 2 == 0) {
                System.out.println("Число " + num1 + " - четное");
            } else {
                System.out.println("Число " + num1 + " - не четное");
            }

            if (num1 > 0) {
                System.out.println("Число " + num1 + " - положительное");
            } else {
                System.out.println("Число " + num1 + " - отрицательное");
            }

        } else {
            System.out.println("Число равно 0");
        }

        //4
        PrintTitle.printTitle("4. Поиск одинаковых цифр в числах");

        int num3 = random.nextInt(100, 999);
        int num4 = random.nextInt(100, 999);

        int hundredsNum3 = num3 / 100;
        int dozensNum3 = num3 / 10 % 10;
        int unitsNum3 = num3 % 10;

        int hundredsNum4 = num4 / 100;
        int dozensNum4 = num4 / 10 % 10;
        int unitsNum4 = num4 % 10;

        System.out.println("Num3 = " + num3 + "; num4 = " + num4);

        if (hundredsNum3 != hundredsNum4 && dozensNum3 != dozensNum4 && unitsNum3 != unitsNum4) {
            System.out.println("Нет совпадений в разрядах");
        }

        if (unitsNum3 == unitsNum4) {
            System.out.println("Совпадение в I разряде: " + unitsNum3 + " = " + unitsNum4);
        }

        if (dozensNum3 == dozensNum4) {
            System.out.println("Совпадение во II разряде: " + dozensNum3 + " = " + dozensNum4);
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

        byte percent = 1;

        if (deposit > 300_000) {
            percent = 10;
        }
        if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 7;
        }
        if (deposit < 100_000) {
            percent = 5;
        }

        int income = (deposit * percent) / 100;

        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Начисленный процент: " + income);
        System.out.println("Итоговая сумма: " + (deposit + income));

        //7
        PrintTitle.printTitle("7. Определение оценки по предметам");

        byte historyPoints = 59;
        byte programmingPoints = 91;

        byte historyGrade = 1;
        byte programmingGrade = 1;

        if (historyPoints <= 60) {
            historyGrade = 2;
        }
        if (historyPoints > 60) {
            historyGrade = 3;
        }
        if (historyPoints > 73) {
            historyGrade = 4;
        }
        if (historyPoints > 91) {
            historyGrade = 5;
        }

        if (programmingPoints <= 60) {
            programmingGrade = 2;
        }
        if (programmingPoints > 60) {
            programmingGrade = 3;
        }
        if (programmingPoints > 73) {
            programmingGrade = 4;
        }
        if (programmingPoints > 91) {
            programmingGrade = 5;
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
        int dozensInAmount = amount / 10 % 10;

        int countHundreds;
        int countDozens;
        int countUnits;

        if (numberOfBanknotes_100_inBank >= hundredsInAmount) {
            countHundreds = hundredsInAmount;
        } else {
            countHundreds = numberOfBanknotes_100_inBank;
        }
        amount -= countHundreds * 100;

        if (numberOfBanknotes_10_inBank >= dozensInAmount) {
            countDozens = dozensInAmount;
        } else {
            countDozens = numberOfBanknotes_10_inBank;
        }
        amount -= countDozens * 10;

        if (numberOfBanknotes_1_inBank >= amount) {
            countUnits = amount;
        } else {
            countUnits = numberOfBanknotes_1_inBank;
        }
        amount -= countUnits;

        if (amount > 0) {
            System.out.println("не достаточно для выдачи: " + amount + " USD");
        }

        System.out.println("100 USD: " + countHundreds);
        System.out.println("10 USD: " + countDozens);
        System.out.println("1 USD: " + countUnits);

        System.out.println("Сумма к выдаче: " + (100 * countHundreds + 10 * countDozens + countUnits) + " USD");
    }
}
