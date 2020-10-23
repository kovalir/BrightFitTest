import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Дана строка, которая содержит сумму нескольких цифр, цифры в
 * строке могут быть только 1,2 или 3. Преобразуйте строку таким
 * образом, чтобы цифры в строке шли в порядке неубывания.
 */
public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:"); //ввод строки
        String exp = sc.nextLine();
        sc.close();

        if (exp.matches("[123+]+")) { //проверяем введенные символы
            exp = exp.replaceAll("[+]",""); //удаляем +
            List<String> expArr = Arrays.asList(exp.split(""));
            Collections.sort(expArr); //сортируем символы по-возрастанию
            StringBuilder result = new StringBuilder(); //результирующая строка
            for (int i = 0; i < expArr.size() - 1; i++) {
                result.append(expArr.get(i)).append(" + "); //возвращаем +
            }
            result.append(expArr.get(expArr.size()-1));
            System.out.println(result);
        } else {
            System.out.println("Строка может содержать только следующие символы: 1, 2, 3, +");
        }

    }
}
