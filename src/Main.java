import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 8");
        //
        System.out.println("          Задача 8-1");
        //
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        //
        double[] arr2 = {
                1.57, 7.654, 9.986};
        //
        char[] arr3 = {'A', 'R', 'R', 'A', 'Y'};
        System.out.println("Создали три массива");
        //
        System.out.println("          Задача 8-2");
        System.out.println("И распечатали:");
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1)
                System.out.println(arr1[i]);
            else
                System.out.print(arr1[i] + ", ");
        }
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1)
                System.out.println(arr2[i]);
            else
                System.out.print(arr2[i] + ", ");
        }
        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1)
                System.out.println(arr3[i]);
            else
                System.out.print(arr3[i] + ", ");
        }
        //
        System.out.println("          Задача 8-3");
        System.out.println("Затем распечатали в обратном порядке:");
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i == 0)
                System.out.println(arr1[i]);
            else
                System.out.print(arr1[i] + ", ");
        }
        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i == 0)
                System.out.println(arr2[i]);
            else
                System.out.print(arr2[i] + ", ");
        }
        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == 0)
                System.out.println(arr3[i]);
            else
                System.out.print(arr3[i] + ", ");
        }
        //
        System.out.println("          Задача 8-4");
        System.out.println("Исходный целочисленный массив:");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Теперь нечетные элементы этого массива стали четными (увеличены на единицу):");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] % 2 == 0 ? arr1[i] : arr1[i] + 1;
        }
        System.out.println(Arrays.toString(arr1));
    }
}