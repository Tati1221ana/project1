import java.util.Scanner;

public class HomeworkTwo {
    static int i = 0;
    public static void main(String []abs){
     task8();

    }

    public static void task1(){
        double price = 7.67;
        /*int pricetrue = (int) (price * 100);
        int d = pricetrue / 100;
        int  c = pricetrue % 100;*/
        int d = (int) (price / 1);
        double  c = (price % 1) * 100;
        System.out.println("цена: " + d + " рублей, " + (int)c + " копеек");
    }

    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число: ");

        String st = sc.nextLine();
        int i = 1;
        String[] numbers = st.split("");
        for (String word : numbers) {
            System.out.println(i + " слово = " + word);
            i++;
        }
    }

    public static void task22(){
        int a = 11534;
        int x = 5;

        int[] values = {4, 3, 5 ,1 ,1};
        for(int i = values.length - 1; i >= 0; i--){
            System.out.println(values[i]);
        }

       /* for(int b : values){
            System.out.println(b);
        }*/


        /*while(a>0){
            System.out.println(i + " value " + (a % 10));
            a = a / 10;

            i--;*/
        }

    public static void task5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("введите слова: ");
        String st = sc.nextLine();
        int i = 1;
        String[] numbers = st.split(" ");
        for (String word: numbers) {
            System.out.println(i + " слово = " + word);
            i++;
        }
        System.out.println( (i-1) + " cлов в строке");
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите символы: ");

        String st = sc.nextLine();
        String[] myarray = new String[st.length()];
        String[] proverka = st.split("");

        String[] numbers = st.split("h");

        for (String word : numbers) {
            myarray[i] = word;
           System.out.println((i+1) + " слово = " + word);
            i++;
        }
       // System.out.println(i);
        String n = proverka[proverka.length-1];
        if (n.equals("h")){
            System.out.println(myarray[0]);
        } else {
            String resolt = myarray[0] + myarray[i - 1];
            System.out.println(resolt);
        }
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите 2 слова: ");

        String st = sc.nextLine();
        String[] myarray = new String[2];
        int i = 0;
        String[] numbers = st.split(" ");
        for (String word : numbers) {
            myarray[i] = word;
            //System.out.println((i+1) + " слово = " + word);
            i++;
        }
        System.out.println(myarray[1] + " " + myarray[0]);
    }

    public static void task6() { //тяжелое утро 2
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");

        int number = sc.nextInt();
        if (number % 2 == 0)
            System.out.println("число четное");
        else
            System.out.println(" число нечетное");

    }
    public static void task7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите номер месяца  ");
        int number = sc.nextInt();

        if ((number == 1) || (number == 2) || (number == 12)) System.out.println("Winter");
        else if (number == 3 || number == 4 || number ==5) {
            System.out.println("Spring");
        } else if (number == 6 || number == 7 || number == 8) {
            System.out.println("Summer");
        } else if (number == 9 || number == 10 || number == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("wrong number");
        }
    }

    public static void task8(){
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }
        int max = array[0];
        int min = array[0];
        int medium = 0;
        for (int i = 0; i < n; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
            medium += array[i];
        }

        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < n-1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        for (int i = 0; i < n; i++)
        System.out.print(array[i] + "  ");
        System.out.println(" ");


        System.out.println("min " + min);
        System.out.println("max " + max);
        System.out.println("medium " + medium/n);
    }

}

