/**
 * 1 задача
 */
public class Sample01 {

    /**
     * Точка входа в программу
     * @param args
     */
    public static void main(String[] args) {

        String[] test1 = {"Hello","world","Привет","Мир"};

        printArray(test1);
        elementsOfArrayChange(test1, 0, 3);
        System.out.println();
        printArray(test1);

    }

    /**
     * Метод для перемещения элементов
     * @param array массив в котором двигаем элементы
     * @param firstElement индекс первого элемента
     * @param secondElement индекс второго элемента
     * @param <T> Тип массива
     */
    public static <T> void elementsOfArrayChange(T[] array, T firstElement, T secondElement) {

        T buf = array[Integer.parseInt(String.valueOf(firstElement))];
        array[Integer.parseInt(String.valueOf(firstElement))] = array[Integer.parseInt(String.valueOf(secondElement))];
        array[Integer.parseInt(String.valueOf(secondElement))] = buf;

    }

    /**
     * Метод для распечатки массива
     * @param array массив
     * @param <T>
     */
    public static <T> void printArray(T[] array) {

        for (T element : array) {
            System.out.print(element + " ");
        }

    }

}
