import java.util.Scanner;

public class HomeworkTwo {
    public static void main(String []abs){
     task6();

    }

    public static void task1(){
        double price = 7.67;
        int pricetrue = (int) (price * 100);
        int d = pricetrue / 100;
        int  c = pricetrue % 100;
        System.out.println("цена: " + d + " рублей, " + c + " копеек");
    }

    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число: ");

        String st = sc.nextLine();
        int i = 1;
        String[] numbers = st.split("");
        for (String word: numbers) {
            System.out.println(i + " слово = " + word);
            i++;
        }
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
        String[] myarray = new String[150];

        int i = 0;
        String[] numbers = st.split("h");
        for (String word : numbers) {
            myarray[i] = word;
           System.out.println(i + " слово = " + word);
            i++;
        }
        //String resolt = myarray[0] + myarray[2];
       // System.out.println(resolt);
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

    public static void task6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");

        int number = sc.nextInt();
        if (number % 2 == 0)
            System.out.println("число четное");
        else
            System.out.println(" число нечетное");

    }
}
