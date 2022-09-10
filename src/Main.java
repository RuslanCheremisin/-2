import java.util.Random;

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
    }
    public static void task1(){
        int cash = 29_000;
        int deposit=cash;
        int i=0;
        while(deposit<=2459000){
            i++;
            System.out.println("Месяц "+i+" , сумма накоплений равна "+deposit+" рублей");
            deposit=deposit+cash;

        }
        System.out.println("\n");
    }
    public static void task2(){
        int i=1;
        while(i<=10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        i=10;
        while(i>0){
            System.out.print(i+" ");
            i--;
        }
        System.out.println("\n");
    }
    public static void task3(){
        int population = 12_000_000;
        int born=17;
        int died=8;
        for(int i=0; i<11; i++){

            System.out.println(i+" "+population);
            population=population+population*(born-died)/1000;
        }

    }
    public static void task4(){
        double deposit = 15_000;
        int rate=7;
        int i=0;

        do {
            System.out.println(i+" "+Math.round(deposit));
            i++;
            deposit=deposit+deposit/100*rate;
        }while(Math.round(deposit)<=12_000_000);
        System.out.println("\n");
    }
    public static void task5(){
        double deposit = 15_000;
        int rate=7;
        int i=0;

        do {
            if(i%6==0){System.out.println(i+" "+Math.round(deposit));}
            i++;
            deposit=deposit+deposit/100*rate;
        }while(Math.round(deposit)<=12_000_000);
        System.out.println("\n");
    }
    public static void task6(){
        double deposit = 15_000;
        int rate=7;
        int i=0;

        do {
            if(i%6==0){System.out.println(i+" "+Math.round(deposit));}
            i++;
            deposit=deposit+deposit/100*rate;
        }while(i<=12*9);
        System.out.println("\n");
    }
    public static void task7(){
        int fridayDate=4;
        int daysInMonth=31;
        while(fridayDate<=daysInMonth){
            System.out.println("Сегодня пятница, "+fridayDate+"-е число. Необходимо подготовить отчет.");
            fridayDate+=7;
        }
        System.out.println("\n");
    }
    public static void task8(){
        int year=0;
        int cometRotation = 79;
        while(year<=2122){
            year=year+cometRotation;
            if(year>1822 && year<2122){
                System.out.println(year);
            }
        }
        System.out.println("\n");

    }
    public static void task9(){
        int dva=2;
        for(int i=1;i<11;i++){
            System.out.println("2*"+i+"="+i*dva);
        }
    }

}