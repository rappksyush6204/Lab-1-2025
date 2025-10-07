import myfirstpackage.*;

class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(0, 0); // создаем объект класса MySecondClass
        
        int i, j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                o.setFirstNum(i);    				// установка 1 числа
                o.setSecondNum(j);   				// установка 2 числа
                System.out.print(o.multip());  // умножаем и выводим
                System.out.print(" ");
            }
            System.out.println();  // переход на новую строку
        }
    }
}