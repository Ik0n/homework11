import java.util.ArrayList;

/**
 * 2 задача
 */
public class Sample02 {
    /**
     * Точка входа в программу
     * @param args
     */
    public static void main(String[] args) {

        String[] test1 = {"Hello","world","Привет","Мир"};

        printArray(arrayToArrayList(test1));


    }

    /**
     * Метод который преобразует массив в array list
     * @param array Массив
     * @param <T>
     * @return возвращаем array list
     */
    public static <T> ArrayList<T> arrayToArrayList(T[] array) {

        ArrayList<T> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {

            result.add(i, array[i]);

        }

        return result;

    }

    /**
     * Метод для печати array list
     * @param array ArrayList
     * @param <T>
     */
    public static <T> void printArray(ArrayList<T> array) {

        for (T element : array) {
            System.out.print(element + " ");
        }

    }

}
