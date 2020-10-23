import java.util.*;

/**
 * Дано два числа. Переставьте в первом числе цифры так, чтобы
 * получилось наименьшее число, в котором нет лидирующих нулей и
 * сравните его со вторым. Если числа совпадут выведите OK, иначе
 * ERROR.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1-ое число:"); //ввод 1-го числа
        String[] a = sc.next().split("");
        System.out.println("Введите 2-ое число:"); //ввод 2-го числа
        String[] b = sc.next().split("");
        sc.close();

        List<String> aAsList = new ArrayList<>(Arrays.asList(a));
        Collections.sort(aAsList); //сортировка массива по-возрастанию

        List<String> result = new ArrayList<>();

        /**
         * Ищем в цикле первое ненулевое значение, вставляем его в начало результирующего списка
         * и удаляем.
         */
        for (int i = 0; i < aAsList.size(); i++) {
            if (!aAsList.get(i).equals("0")) {
                result.add(aAsList.get(i));
                aAsList.remove(i);
                break;
            }
        }
        result.addAll(aAsList); //добавляем оставшуюся часть первоначального списка
        System.out.print(Arrays.equals(result.toArray(), b) ? "OK" : "ERROR"); //сравниваем значения
    }
}
