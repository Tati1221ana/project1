import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class MetelFile {
    static int p = 0; // количество строк

    public static void main(String[] args) throws IOException {

        String filepath = "/home/tatiana/Документы/github_repository/project1/src/metel.txt";
        //taskWrite(filepath);
        taskRead(filepath);
    }

    public static void taskRead(String filepath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
        String s;
        HashMap<Integer, Integer> stringAndwords = new HashMap<>(); // номер строки = количество слов длинее 5 символов

        while ((s = bufferedReader.readLine()) != null){
            int q = 0;// количество слов длиннее 5 в строке
            String[] words = s.split(" ");

            for (int i = 0; i < words.length; i++){

                if (words[i].length() > 5) {
                    q++; // сколько слов в строке длинне 5 символов
                }
            }

            p++; // сколько всего строк
            stringAndwords.put(p, q);
        }
        bufferedReader.close();
        String[] array = new String[p];
        // открываем файл еще раз и делаем подготовку для записи в новый файл
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(filepath));

        for (int i = 0; i < p; i++){
            s = bufferedReader1.readLine();
            String[] words = s.split(" ");
            int value = stringAndwords.get(i+1);
            int proverka = 1; // количество уже пройденных слов длинее 5 символов
            for ( int r = 0; r < words.length; r++){
                if ((words[r].length() > 5) && (value%2 == 0)){
                    words[r] = ""; // если количество длинных слов четное, то просто заменяем все эти слова пустотой
                } else if ((words[r].length() > 5) && (value%2 == 1)){ // если количество длинных слов нечетное, то заменяем пустотой все такие слова, кроме последнего
                    if (proverka == value){
                        break;
                    }
                    words[r] = "";
                    proverka++;
                }
            }
            array[i] = String.join(" ", words); // заполняем массив измененной строкой
          System.out.println(array[i]);
        }

      // System.out.println(stringAndwords );
        bufferedReader.close();
    }
}






