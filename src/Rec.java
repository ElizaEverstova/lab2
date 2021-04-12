
import java.util.Scanner;

public class Rec {
    public static String str = "";
    public static int[] arr;
    public static Scanner sc;

    public static String decToBin (int n){
        if ( n / 2 != 0){
            decToBin(n/2);
        }
        str= str.concat (Integer.toString(n % 2));
        return str;
    }

    public static void fillArr (int i){
        if (i < arr.length){
            System.out.println("Введите "+i+" элемент");
            arr[i] = sc.nextInt();
            fillArr(++i);
        }
    }
    public static void printArr(int i){
        if (i < arr.length){
            System.out.println(arr[i]);
            printArr(++i);
        }
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        System.out.println("n");
        int n= sc.nextInt();
        decToBin(n);
        arr= new int[5];
        fillArr(0);
        printArr(0);
    }
}
