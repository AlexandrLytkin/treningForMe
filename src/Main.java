import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        task21();
        task22();
        task23();
        task24();
        task25();
        task26();
        task27();
        task28();
        task29();
        task30();
        task31();
        task32();
        task33();
        task34();
        task35();
        task36();
        task37();
        task38();
        task39();
        task40();
        task41();
    }

    public static void task41() {
        System.out.println("Задание41 массивы");
        int [] arrDay = new int[30];
        int i = 0;
        int j = 0;
        int total = 0;
        for (; i < arrDay.length; i++) {
            arrDay[i] = (int) (Math.random() * 100_000) + 100_000;
            //System.out.println(arrDay[i]);   // покажет дни
        }
        for (; j < arrDay.length; j++) {
            total = total + arrDay[i-1];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
        //System.out.println(arrDay[i-1] + " сейчас в i");



    }
    public static void task40() {
        System.out.println("Задание40 массивы");
        int [] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double [] high = {1.57, 7.654, 9.986};
        int [] array = new int[3];
        array[0] = 4;
        array[1] = 5;
        array[2] = 6;
        int i = 0;
        for (; i < arr.length; i++) {
            if (i == arr.length -1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        for (; arr[i] > 0 ; i--) {
            if (arr[i] == arr[0]) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        int j = 0;
        for (; j < high.length; j++) {
            if (j == high.length -1) {
                System.out.println(high[j]);
                break;
            }
            System.out.print(high[j] + ", ");
        }
        for (; high[j] > 0; j--) {
            if (high[j] == high[0]) {
                System.out.println(high[j]);
                break;
            }
            System.out.print(high[j] + ", ");
        }
        int k = 0;
        for (; k < array.length; k++) {
            if (k == array.length -1) {
                System.out.println(array[k]);
                break;
            }
            System.out.print(array[k] + ", ");
        }
        for (; array[k] > 0; k--) {
            if (array[k] == array[0]) {
                System.out.println(array[k]);
                break;
            }
            System.out.print(array[k] + ", ");
        }
        
        for (; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] +=1 ;
            }
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();

//        печать массива в строку
//        System.out.println(Arrays.toString(intArray));
//        System.out.println(Arrays.toString(high));
//        System.out.println(Arrays.toString(length));
    }
    public static void task39() {
        System.out.println("Задание39");
        int monthNumber =12;
        switch (monthNumber) {
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("такого месяца не существует");
        }
        if (monthNumber > 0 && monthNumber <= 2 || monthNumber >11)
            System.out.println("месяц " + monthNumber + " принадлежит к сезону зима");

        if (monthNumber >= 3 && monthNumber <= 5)
            System.out.println("месяц " + monthNumber + " принадлежит к сезону весна");

        if (monthNumber > 5 && monthNumber <= 8)
            System.out.println("месяц " + monthNumber + " принадлежит к сезону лето");

        if (monthNumber > 8 && monthNumber <= 11)
            System.out.println("месяц " + monthNumber + " принадлежит к сезону осень");
    }
    public static void task38() {
        System.out.println("Задание38");
        int deliveryDistance = 95; //95
        int oneDay = 1;
        int twoDay = 2;
        int treeDay = 3;
        if (deliveryDistance>0 && deliveryDistance <=20) {
            System.out.println("дистанция " + deliveryDistance + " км, потребуется дней: "+ oneDay + " + срок доставки");
        }
        if (deliveryDistance>20 && deliveryDistance <= 60) {
            System.out.println("дистанция " + deliveryDistance + " км, потребуется дней: "+ twoDay + " + срок доставки");
        }
        if (deliveryDistance >60 && deliveryDistance <=100) {
            System.out.println("дистанция " + deliveryDistance + " км, потребуется дней: "+ treeDay + " + срок доставки");
        }
    }

    public static void task37() {
        System.out.println("Задание37 циклы");
        int times = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(times+ " * " + i + " = " + (times * i));
        }
    }
    public static void task36() {
        System.out.println("Задание36 циклы");
        int cometFlying = 79;
        int cometOld = 1822;
        int cometFuture = 2122;
        for (int i = cometOld; i < cometFuture; i++) {
            if (i % cometFlying == 0) {
                System.out.println(i);
            }
        }
    }
    public static void task35() {
        System.out.println("Задание35 циклы");
        int day = 31;
        int friday = 4;
        for (int i = friday; i <= day; i = i + 7) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task34() {
        System.out.println("Задание34 циклы");
        int salary = 15_000;
        int percent = 7;
        int deposit = 0;
        int month = 0;
        int year = 9;
        while (month < 12 * year && deposit < 12_000_000) {
            month++;
            deposit = deposit + deposit * percent /100;
            deposit = deposit + salary;
            if (month % 6 == 0)
                System.out.println("месяц " + month + " сумма на вкладе" + deposit);
        }
    }
    public static void task33() {
        System.out.println("Задание33 циклы");
        int salary = 15_000;
        int percent = 7;
        int deposit = 0;
        int month = 0;
        while (deposit < 12_000_000) {
            month++;
            deposit = deposit + deposit * percent /100;
            deposit = deposit + salary;
            if (month % 6 == 0)
            System.out.println("месяц " + month + " сумма на вкладе" + deposit);
        }

    }
    public static void task32() {
        System.out.println("Задание32 циклы");
        int populationCountry = 12_000_000;
        int burnPeople = populationCountry / 1000 * 17;
        int deathPeople = populationCountry / 1000 * 8;
        int i = 0;
        while (i < 10) {
            i++;
            populationCountry = populationCountry + (burnPeople - deathPeople);
            System.out.println("Год " + i + " численность населения составляет " + populationCountry);
        }
    }
    public static void task31() {
        System.out.println("Задание31 циклы");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static void task30() {
        System.out.println("Задание30 условный оператор");
        int salary = 156_000;
        int deposit = 0;
        int needSum = 2_459_000;
        int percentOfYear = 1;
        int i = 0;
        while (deposit < needSum) {
            i++;
            deposit = deposit + deposit * percentOfYear / 100;
            deposit = deposit + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println("сейчас на вкладе" + deposit);
    }
    public static void task29() {
        System.out.println("Задание29");
        int salary = 29_000;
        int percentOfYear = 1;
        int deposit = 0;
        int year = 1 * 12;
        for (int i = 1; i <= year; i++) {
            deposit = deposit + deposit * percentOfYear/100;
            deposit = deposit + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна "+ deposit + " рублей");

        }
    }
    public static void task28() {
        System.out.println("Задание28");
        int salary = 29_000;
        int year = 1 * 12;
        for (int i = 1; i <= year; i++) {
            System.out.println("Месяц " + i + " сумма накоплений равна "+ salary * i + " рублей");
        }
    }
    public static void task27() {
        System.out.println("Задание27");
        for (int i = 1; i <=512; i = i + i ) {
            System.out.println(i);
        }
    }
    public static void task26() {
        System.out.println("Задание26");
        for (int i = 7; i <=98; i++) {
            if (i % 7 == 0)
                System.out.println(i);
        }
    }
    public static void task25() {
        System.out.println("Задание25");
        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " год является високосным");
        }
    }
    public static void task24() {
        System.out.println("Задание24");
        for (int i = 10; i >= -10; i = i -1) {
            System.out.print(" "+i);
            System.out.println();
        }
    }
    public static void task23() {
        System.out.println("Задание23");
        for (int i = 0; i <=17; i = i + 2) {
            System.out.print(" "+i);
        }
        System.out.println();
    }
    public static void task22() {
        System.out.println("Задание22");
        for ( int i = 10; i >=1 ; i = i - 1) {
            System.out.print(" "+i);
        }
        System.out.println();
    }
    public static void task21() {
        System.out.println("Задание21");
        for (int i = 1; i <=12; i = i + 1) {
            System.out.print(" "+i);
        }
        System.out.println();
    }
    public static void task20() {
        System.out.println("Задание20");
        double masha = 67_760;
        double denis = 83_690;
        double kristina = 76_230;
        double increaseSalary10Percent = 1.1;
        {
            System.out.println("Маша теперь получает "+masha * increaseSalary10Percent+" рублей. Годовой доход вырос на " +masha * increaseSalary10Percent / 100+" рублей");
            System.out.println("Маша теперь получает "+denis * increaseSalary10Percent+" рублей. Годовой доход вырос на " +denis * increaseSalary10Percent / 100+" рублей");
            System.out.println("Маша теперь получает "+kristina * increaseSalary10Percent+" рублей. Годовой доход вырос на " +kristina * increaseSalary10Percent / 100+" рублей");
        }
    }
    public static void task19() {
        System.out.println("Задание19");
        int excessWeight = 7000;
        int dietMin = 250;
        int dietMax = 500;
        int dietMid = (dietMax + dietMin) /2;
        {
            System.out.println("чтобы спортсмен мог терять в весе "+dietMin+" грамм в день, на похудение понадобится "+ excessWeight / dietMin+" дней");
            System.out.println("чтобы спортсмен мог терять в весе "+dietMax+" грамм в день, на похудение понадобится "+ excessWeight / dietMax+" дней");
            System.out.println("чтобы спортсмен мог терять в весе "+dietMid+" грамм в день, на похудение понадобится "+ excessWeight / dietMid+" дней");
        }
    }
    public static void task18() {
        System.out.println("Задание18");
        double bananas = 80;
        double milk = 105;
        double iceCream = 100;
        double whetEgg = 70;
        {
            System.out.println("бананов - "+bananas * 5+" грамм \nмолоко - "+milk * 2+" грамм \nмороженое пломбир "+iceCream * 2+" грамм \nяйца сырые "+whetEgg * 4+" грамм");
            System.out.println((bananas * 5 + milk * 2 + iceCream * 2 + whetEgg * 4) / 1000+" кг");
        }
    }
    public static void task17() {
        System.out.println("Задание17");
        int yarPaints = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int oneClass = whitePaint + brownPaint;
        {
            System.out.println("В школе, где "+yarPaints / oneClass+" классов, нужно "+yarPaints / oneClass * whitePaint+" банок белой краски и "+yarPaints / oneClass * brownPaint+" банок коричневой краски");
        }
    }
    public static void task16() {
        System.out.println("Задание16");
        int machineBottle = 16;
        int oneMinute = 4;
        int twentyMinutes = 20;
        int oneDay = oneMinute * 24;
        int treeDay = oneDay * 3;
        int oneMonth = treeDay * 10;
        {
            System.out.println("За 20 минут машина  произвела бутылок " + twentyMinutes * oneMinute + " штук ");
            System.out.println("За сутки машина  произвела бутылок " + oneDay * oneMinute + " штук ");
            System.out.println("За 3 дня машина  произвела бутылок " + twentyMinutes * oneMinute + " штук ");
            System.out.println("За 1 месяц машина  произвела бутылок " + oneMonth * oneMinute + " штук ");
        }
    }
    public static void task15() {
        System.out.println("Задание15");
        int ludmilaP = 23;
        int annaS = 27;
        int ekaterinaA = 30;
        int allPaper = 480; {
            System.out.println("На каждого ученика рассчитано " +allPaper / (ludmilaP + annaS + ekaterinaA)+ " листов бумаги");
        }
    }
    public static void task14() {
        System.out.println("Задание14");
        int year = 4;
        if (year % 4 ==0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }

    }
    public static void task13() {
        System.out.println("Задание13 Условный оператор 13-30");
        int clientOS = 1;
        int productionYear = 2014;
        if (clientOS == 0) {
            if (productionYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную  приложения для iOS по ссылке");
            }
        } else {

        if (clientOS == 1) {
            if (productionYear >=2015) {
            } System.out.println("Установите версию приложения для android по ссылке");
            } else {
            System.out.println("Установите облегченную  приложения для android по ссылке");
        }
        }
    }
    public static void task12() {
        System.out.println("Задание12");
        int one = 12;
        int two = 70;
        int tree = 5;
        if (one > two && one > tree) {
            System.out.println(one + " больше чем " + two + " и " + tree);
        } else if (two > one && two > tree) {
            System.out.println(two + " больше чем " + one + " и " + tree);
        } else {
            System.out.println(tree + " больше чем " + one + " и " + two);
        }
    }
    public static void task11() {
        System.out.println("Задание11");
        int personAge = 13;
        if (personAge <5) {
            System.out.println("ребенок не может кататься на аттракционе");
        } else if (personAge >= 5 && personAge < 14) {
            System.out.println("ребенок может кататься на аттракционе только в сопровождении взрослого, если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("ребенок может кататься без сопровождения взрослого");
        }
    }
    public static void task10() {
        System.out.println("Задание10");
        int capacityWagon = 102; //вместимость вагона 102
        if (capacityWagon < 60) {
            System.out.println("есть сидячее место в вагоне");
        } else if (capacityWagon >=60 && capacityWagon < 102) {
            System.out.println("есть стоячее место в вагоне");
        } else {
            System.out.println("вагон уже полностью забит");
        }
    }
    public static void task9() {
        System.out.println("Задание9");
        int personAgeYear = 18;
        if (personAgeYear>1 && personAgeYear <7) {
            System.out.println("Если возраст человека равен "+personAgeYear+ ", то ему нужно ходить в садик");
        } else if (personAgeYear >= 7 && personAgeYear <18) {
            System.out.println("Если возраст человека равен "+personAgeYear+ ", то ему нужно ходит в школу");
        } else if (personAgeYear >=18 && personAgeYear< 24) {
            System.out.println("Если возраст человека равен "+personAgeYear+ ", то ему нужно идти в университет");
        } else if (personAgeYear >= 24) {
            System.out.println("Если возраст человека равен "+personAgeYear+ ", то ему пора искать первую работу");
        }
    }
    public static void task8() {
        System.out.println("Задание8 Условный оператор 8-12");
        int userAge = 19;
        if (userAge >=18) {
            System.out.println("поздравляем с совершеннолетием");
            } else { System.out.println("возраст совершенолетия еще не наступил, и нужно немного подождать");
        }
    }
    public static void task7() {
        System.out.println("Задание7");
        int workHour = 640;
        int oneStaff = 8;
        int allStaff = workHour / oneStaff;
        int addStaff = 94;
        System.out.println("всего работников в компании "+allStaff+" человек то всего "+ workHour +" часов работы может быть поделено между сотрудниками");
        System.out.println("Если в компании работает "+ (allStaff + addStaff) +" человек, то всего "+ (allStaff + addStaff) * oneStaff +" часов работы может быть поделено между сотрудниками");
    }
    public static void task6() {
        System.out.println("Задание6");
        double oneBoxerWeight = 78.2;
        double twoBoxerWeight = 82.7;
        double totalWeight = oneBoxerWeight + twoBoxerWeight;
        double differenceWeight = Math.abs(oneBoxerWeight - twoBoxerWeight);
        System.out.printf("вес первого боксера %.2f кг\nвес второго боксера %.2f кг\nобщий вес боксеров %.2f кг\nраздница весов %.2f кг" ,oneBoxerWeight , twoBoxerWeight , totalWeight , differenceWeight );
        System.out.println();
    }
    public static void task5() {
        System.out.println("Задание5");
        var frog = 3.5;
        frog = frog * 10 / 3.5;
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task4() {
        System.out.println("Задани4");
        int friend = 19;
        friend = friend + 2;
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task3() {
        System.out.println("Задани3");
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("Задание2");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println(paper);
    }

    public static void task1() {
        System.out.println("Задание1 Переменные 1-7");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(paper);
    }
}
