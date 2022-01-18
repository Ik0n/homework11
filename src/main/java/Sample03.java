import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;

/**
 * 3 задача
 */
public class Sample03 {
    /**
     * точка входа в программу
     * @param args
     */
    public static void main(String[] args) {

        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        Apple apple1 = new Apple();
        Fruit apple2 = new Apple();
        Fruit apple3 = new Apple();

        Fruit orange1 = new Orange();
        Fruit orange2 = new Orange();

        Fruit orange3 = new Orange();
        Fruit orange4 = new Orange();
        Fruit orange5 = new Orange();

        box1.addFruit(apple1);
        box1.addFruit(apple2);
        box1.addFruit(apple3);

        box2.addFruit(orange1);
        box2.addFruit(orange2);
        box2.addFruit(new Orange());

        box3.addFruit(orange3);
        box3.addFruit(orange4);
        box3.addFruit(orange5);

        box1.printArray(box1.inside);

        System.out.println("*****");

        box2.printArray(box2.inside);

        System.out.println("*****");

        box1.showWeight();

        System.out.println("*****");

        box2.showWeight();

        System.out.println("*****");

        System.out.println(box1.compare(box2));

        System.out.println("*****");

        box3.addFruitsFromAnotherBox(box2);

        System.out.println("*****");

        box2.printArray(box2.inside);

        System.out.println("*****");

        box3.printArray(box3.inside);

        System.out.println("*****");


    }

}

/**
 * Общий класс фруктов
 */
class Fruit {

}

/**
 * Класс яблока
 */
class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

/**
 * Класс апельсина
 */
class Orange extends Fruit {
    public String toString() {
        return "Orange";
    }
}

/**
 * Класс коробки
 * @param <T>
 */
class Box<T> {

    ArrayList<T> inside = null;
    String typeBox = null;
    float weight;



    Box() {
        this.inside = new ArrayList<T>();
    }

    /**
     * метод добавления фрукта в коробку
     * @param fruit фрукт
     */
    public void addFruit(T fruit) {
        if (this.inside.size() == 0) {
            this.inside.add(fruit);
            this.typeBox = fruit.toString();
        } else {
            if (this.inside.get(0).getClass() == fruit.getClass()) {
                this.inside.add(fruit);
                this.typeBox = fruit.toString();
            } else {
                System.out.println("В этой корзине уже лежат другие фруткы их нельзя смешивать");
            }
        }

    }

    /**
     * Метод пересыпания фруктов в другую коробку
     * @param box коробку куда сыпем
     */
    public void addFruitsFromAnotherBox(Box box) {

        for (int i = 0; i <= this.inside.size(); i++) {
            box.inside.add(this.inside.get(i));
            this.inside.remove(this.inside.get(i));

        }

        this.inside.remove(0);

    }

    /**
     * Метод для вычесления веса коробки
     * @return
     */
    public float getWeight() {
        if (this.typeBox.equals("Apple")) {
            this.weight = this.inside.size() * 1.0f;
        } else {
            this.weight = this.inside.size() * 1.5f;
        }

        return this.weight;
    }

    /**
     * Метод для вывода веса на экран
     */
    public void showWeight() {
        getWeight();
        System.out.println("Вес коробки : " + this.weight);
    }

    /**
     * Метод для печати array list
     * @param array array list
     * @param <T>
     */
    public <T> void printArray(ArrayList<T> array) {

        for (T element : array) {
            System.out.println(element);
        }
        if (array.size() == 0)
            System.out.println("Коробка пустая....");

    }

    /**
     * Метод сравнивания веса коробок
     * @param box Коробка с которой сравниваем текущую
     * @param <T>
     * @return TRUE OR FALSE
     */
    public <T> boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

}
