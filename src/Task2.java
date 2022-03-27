/*
Классы Cat и Dog и метод finalize для каждого

В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.
 */
public class Task2 {
    public static void main(String[] args) {

    }


    class Cat {
        protected void finalize() throws Throwable {
            System.out.println("Объект класса Сat уничтожен");
        }
    }

    class Dog {
        protected void finalize() throws Throwable {
            System.out.println("Объект класса Dog уничтожен");
        }

    }
}

