import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Задача1
        System.out.println("Задача 1");
        //объявляем и инициализируем переменные
        int variable1 = 5;
        byte variable2 = 3;
        short variable3 = 4;
        long variable4 = 25L;
        float variable5 = (float) 3.2;
        double variable6 = 4.58;
            System.out.println("Значение переменной variable1 с типом int равно " + variable1);     //выводим в консоль
            System.out.println("Значение переменной variable2 с типом byte равно " + variable2);
            System.out.println("Значение переменной variable3 с типом short равно " + variable3);
            System.out.println("Значение переменной variable4 с типом long равно " + variable4);
            System.out.println("Значение переменной variable5 с типом float равно " + variable5);
            System.out.println("Значение переменной variable6 с типом double равно " + variable6);

        //Задача2
        System.out.println("Задача 2");
        //инициализируем переменные
        variable1 = 27897;
        variable2 = 67;
        variable3 = -159;
        variable4 = 987678965549L;
        variable5 = (float) 27.12;
        variable6 = 2.786;
        char variable7 = 569;
        boolean variable8 = false;
        //выводим в консоль
        System.out.println("Значение переменной variable1 с типом int равно " + variable1);
        System.out.println("Значение переменной variable2 с типом byte равно " + variable2);
        System.out.println("Значение переменной variable3 с типом short равно " + variable3);
        System.out.println("Значение переменной variable4 с типом long равно " + variable4);
        System.out.println("Значение переменной variable5 с типом float равно " + variable5);
        System.out.println("Значение переменной variable6 с типом double равно " + variable6);
        System.out.println("Значение переменной variable7 с типом double равно " + variable7);
        System.out.println("Значение переменной variable8 с типом double равно " + variable8);

        //Задача3
        System.out.println("Задача 3");
        int lyudmilaPavlovnaPupils = 23;
        int annaSergeevnaPupils = 27;
        int ekaterinaAndreevnaPupils = 30;
        int totalPaper = 480;
        int totalPupils = lyudmilaPavlovnaPupils + annaSergeevnaPupils + ekaterinaAndreevnaPupils;
        int sheetsPerPupil = totalPaper / totalPupils;
        System.out.println("На каждого ученика рассчитано " + sheetsPerPupil + " листов бумаги.");

        //Задача4
        System.out.println("Задача 4");
        int bottlesPerMinute = 8;
        int bottlesPerTwentyMinutes = bottlesPerMinute * 20;
        int bottlesPerHours = bottlesPerTwentyMinutes * 3;
        int bottlesPerDay = bottlesPerHours * 24;
        int bottlesPerThreeDays = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerThreeDays * 10;
        //выводим в консоль
        System.out.println("За 20 минут машина произвела бутылок " + bottlesPerTwentyMinutes + " штук.");
        System.out.println("За сутки машина произвела бутылок " + bottlesPerDay + " штук.");
        System.out.println("За 3 дня машина произвела бутылок " + bottlesPerThreeDays + " штук.");
        System.out.println("За 1 меясц машина произвела бутылок " + bottlesPerMonth + " штук.");

        //Задача5
        System.out.println("Задача 5");
        int totalPaint = 120;           //всего банок краски
        int whitePaintForClass = 2;     //количество банок с белой краской на один класс
        int brownPaintForClass = 4;     //количество банок с коричневой краской на один класс
        int totalClass = totalPaint / (whitePaintForClass + brownPaintForClass);   //всего классов в школе
        int totalWhitePaint = totalClass * whitePaintForClass;
        int totalBrownPaint = totalClass * brownPaintForClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");

        //Задача6
        System.out.println("Задача 6");
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        int breakfastlWeight = bananaWeight * 5 + milkWeight * 2 + iceCreamWeight * 2 + eggWeight * 4;
        int grPerKg = 1000;
        float weightKg = breakfastlWeight / (float)grPerKg;
        System.out.println("Вес завтрака " + breakfastlWeight + " г. или " + weightKg +" кг.");

        //Задача7
        System.out.println("Задача 7");
        int needToLost = 7000;
        int daylyWeightLost1 = 250;
        int daylyWeightLost2 = 500;
        int firstDiet = needToLost / daylyWeightLost1;
        int secondDiet = needToLost / daylyWeightLost2;
        System.out.println("С первой диетой похудение займет " + firstDiet + " дней.");
        System.out.println("Со второй диетой похудение займет " + secondDiet + " дней.");
        System.out.println("В среднем потребуется " + (secondDiet + firstDiet) / 2 + " дней, чтобы добиться результата похудения.");

        //Задача8
        System.out.println("Задача 8");
        int mashaSalaryBefore = 67760;
        int denisSalaryBefore = 83690;
        int kristinaSalaryBefore = 76230;
        float persentPerYear = 0.1f;
        int mashaSalaryAfter = (int) (mashaSalaryBefore * persentPerYear);
        int denisSalaryAftrer = (int) (denisSalaryBefore * persentPerYear);
        int krisrinaSalaryAfter = (int) (kristinaSalaryBefore * persentPerYear);
        System.out.println("Маша теперь получает " + (mashaSalaryAfter + mashaSalaryBefore) + " рублей. Годовой доход вырос на " + mashaSalaryAfter + " рублей.");
        System.out.println("Денис теперь получает " + (denisSalaryAftrer + denisSalaryBefore) + " рублей. Годовой доход вырос на " + denisSalaryAftrer + " рублей.");
        System.out.println("Кристина теперь получает " + (krisrinaSalaryAfter + kristinaSalaryBefore) + " рублей. Годовой доход вырос на " + krisrinaSalaryAfter + " рублей.");

    }
}