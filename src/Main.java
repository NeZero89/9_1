import javax.management.loading.MLet;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        //task5();
        //task6();
        //task7();
       // task8();


    }

    public static void task1() {
        System.out.println("Задача №1");
    int [] whole={1,2,3};
    double [] factorial={1.57, 7.654, 9.986};
    char [] shor= {10, 13, 17};
    }
    public static void task2() {
        System.out.println("Задача №2");
        int [] whole={1,2,3};
        double [] factorial={1.57, 7.654, 9.986};
        byte [] shor={10, 13, 17};
    System.out.println(Arrays.toString(whole));
    System.out.println(Arrays.toString(factorial));
    System.out.println(Arrays.toString(shor));


    }
    public static void task3() {
        System.out.println("Задача №3");
        int[] whole = {1, 2, 3};{
        for (int i = 2; i >= 0; i = i - 1)
            System.out.print(whole[i] + " ");
        }
            System.out.println("");
        double [] factorial={1.57, 7.654, 9.986};{
            for (int i = 2; i >= 0; i = i - 1)
                System.out.print(factorial[i] + " ");
        }
             System.out.println("");
        byte [] shor={10, 13, 17};{
            for (int i = 2; i >= 0; i = i - 1)
                System.out.print(shor[i] + " ");
            System.out.println("");
        }
    }
    public static void task4() {
        System.out.println("Задача №4");
        int [] whole={1,2,3};
        for (int i = 0; i < whole.length; i++){
            if (whole[i] % 2 != 0) {
                whole[i] += 1;
            }
        }
            System.out.println(Arrays.toString(whole));




    }}