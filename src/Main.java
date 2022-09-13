public class Main {
    public static void main(String[] args) {

        System.out.println( " Задание 1.");

        for ( int i = 0; i < 10; i++){
            System.out.println(" Итерация цикла " + i);
        }

        System.out.println(" Задание 2.");


        for ( int  start = 10; start > 0; start -- ) {
            System.out.println( start );
        }

        System.out.println(" Задание 3.");

        for ( int j = 0 ; j < 17; j = j + 2 ){
            System.out.println(j );
        }

        System.out.println(" Задание 4.");

        for ( int i = 10; i >= -10; i -- ) {
            System.out.println(i);
        }

        System.out.println(" Задание 5. ");

        for ( int i = 1904 ; i <= 2096 ; i = i +4) {
            System.out.println( i + " год является високосным.");
        }

        System.out.println(" Задача 6.");

        for ( int i = 7; i <=98; i = i + 7) {
            System.out.println( i );
        }

        System.out.println(" Задание 7.");

        for ( int i = 1 ; i <= 512; i = i * 2 ) {
            System.out.println( i );
        }

        System.out.println(" Задание 8.");

        int saving = 29000;
        int total = 0;
        for ( int i = 0; i < 12; i ++) {
            total = total + saving;
            System.out.println( total );
        }

        System.out.println( " Задание 9.");

        int savings = 29000;
        int total1 = 0;
        for ( int i = 0; i < 12; i ++) {
            total1 = total1 + total1/ 100;
            total1 = total1 + savings;
            System.out.println( total1 );
        }





    }
}