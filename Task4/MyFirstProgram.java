class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(0, 0); // создаем объект класса MySecondClass
        
        int i, j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                o.setFirstNum(i);    				// установка 1 числа
                o.setSecondNum(j);   				// установка 1 числа
                System.out.print(o.multip());  // умножаем и выводим
                System.out.print(" ");
            }
            System.out.println();  // Переход на новую строку
        }
    }
}

class MySecondClass {
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