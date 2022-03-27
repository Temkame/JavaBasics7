/*
Счётчик котов

В конструкторе класса Cat [public Cat()] увеличивать
счётчик котов (статическую переменную catCount этого же класса) на 1. В методе finalize уменьшать на 1.
 */
public class Task4 {
}
class Cat {
    static int catCount = 0;

    public Cat() {
        this.catCount++;
    }

    protected void finalize() throws Throwable {
        catCount = catCount--;
    }
}
