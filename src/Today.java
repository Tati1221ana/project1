public class Today {

    public static void main(String[] abs) {
        task2();
    }

    public static void task1() { /*Напишите программу,
        которая выводит на консоль простые числа в промежутке от [2, 100].
        Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы. */
        int n = 101;
        for (int i = 2; i < n; i++) {

            for (int d = 2; d < i + 1; d++) {

                if ((i % d == 0) && (i != d)) {
                    break;
                } else if ((i % d == 0) && (i == d)) {
                    System.out.println(i);
                }
                }
            }
        }
    public static void task2() {  /* Дан массив целых чисел и ещё одно целое число.
    Удалите все вхождения этого числа из массива (пропусков быть не должно).  */
        int n = 10;
        int[] array = new int[n];
        int value = 1;
        int number = 0;
        System.out.println("Массив:");
        for (int i = 0; i < n; i++){ // задаем массив рандомно
            array[i] = (int) (Math.random() * 5);
            System.out.println(array[i]);
        }
        for (int i = 0; i < n; i++){ // считаем вхождение числа в массив
            if (array[i] == value){
                number++;
            }
        }
        System.out.println("число " + value + " встречается в массиве " + number +" раз(а)");
        int[] myarray = new int[n - number];
        int k = 0;
        System.out.println("Новый массив:");
        for (int i = 0; i < n; i++){
            if (array[i] != value){
                myarray[k] = array[i];
                System.out.println(myarray[k]);
                k++;

            }

        }

    }
    }

