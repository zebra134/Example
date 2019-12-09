package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            int a = 100;
            int b = 0;
            int c = a / b;
            int[] d = {3,4,5};
            int bb=d[10];
        } catch (ArithmeticException c){
            System.out.println("Арифмет. ошибка");
        }catch (Exception e){
            System.out.println("Ошибка:" + e.toString());
        } finally {
            System.out.println("Всегда!!!");
        }
        System.out.println("!!!Гоша сосет!!!");
    }
}
