package myfirstpackage;

public class MySecondClass {
    // приватные поля
    private int firstNum;
    private int secondNum;
    
    // конструктор
    public MySecondClass(int first, int second) {
        this.firstNum = first;
        this.secondNum = second;
    }
    
    // метод для получения первого числа
    public int getFirstNum() {
        return firstNum;
    }
    
    // метод для установки первого числа
    public void setFirstNum(int value) {
        this.firstNum = value;
    }
    
    // метод для получения второго числа
    public int getSecondNum() {
        return secondNum;
    }
    
    // метод для установки второго числа
    public void setSecondNum(int value) {
        this.secondNum = value;
    }
    
    // метод для умножения чисел 
    public int multip() {
        return firstNum * secondNum;
    }
}