/*
По 50 000 объектов Cat и Dog

Создать в цикле по 50 000 объектов Cat и Dog.
(Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
 */
public class Task3 {

    public static void main(String[] args) {

        for (int i = 0; i < 50000; i++) {

            Cat cat = new Cat();
            Dog dog = new Dog();
        }
    }

    static class Cat {
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("Объект кота уничтожен");
        }

    }

    static class Dog {
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("Объект собаки уничтожен");
        }
    }
}
