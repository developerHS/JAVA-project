import javax.swing.*;
import java.io.IOException;

public class Main {
    static int buffer; //변수 교체에 이용할 버퍼변수 선언

    public static void main(String[] args){
        int[] array1;

        int vary = Integer.parseInt(JOptionPane.showInputDialog("버블정렬 (1), 선택정렬 (2)"));
        switch (vary){
            case 1:{
                int[] ar = new int[1000], ar1;
                int j;
                for (j=0; j<1000; j++){
                    String input = JOptionPane.showInputDialog("array["+j+"]: ");
                    if (input.equals("end")){
                        break;
                    }
                    ar[j] = Integer.parseInt(input);
                }

                ar1 = new int[j];

                for (int a=0; a<=j-1; a++){
                    ar1[a] = ar[a];
                }

                System.out.println("\n\n버블정렬");
                array1 = bubble_sort(ar1);
                for (int i=0; i< array1.length; i++){

                    System.out.printf("%d",array1[i]);
                }
                break;
            }
            case 2:{
                int[] ar = new int[1000], ar1;
                int j;
                for (j=0; j<1000; j++){
                    String input = JOptionPane.showInputDialog("array["+j+"]: ");
                    if (input.equals("end")){
                        break;
                    }
                    ar[j] = Integer.parseInt(input);
                }

                ar1 = new int[j];

                for (int a=0; a<=j-1; a++){
                    ar1[a] = ar[a];
                }

                System.out.println("\n\n선택정렬");
                array1 = selection_sort(ar1);
                for (int i=0; i< array1.length; i++){

                    System.out.printf("%d",array1[i]);
                }
                break;
            }
        }
        try {
            int dummy = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //버블정렬
    public static int[] bubble_sort(int[] array){
        int compare=0, change=0;
        for (int i=0; i< array.length-1; i++){
            for (int j=0; j< array.length-1; j++){
                if (array[j] > array[j+1]){
                    change++;
                    buffer = array[j];
                    array[j] = array[j+1];
                    array[j+1] = buffer;
                }
                compare++;
            }
        }
        System.out.printf("비교 :%d, 교환: %d\n", compare, change);
        return array;
    }

    //선택정렬
    public static int[] selection_sort(int[] array){
        int pivot=0, compare=0, change=0;; //선택정렬의 책갈피 역할

        for (int i=0; i<array.length-1; i++){
            pivot = i; //피벗 초기화
            for (int j=i; j< array.length-1; j++){
                if (array[pivot] >= array[1+j]){
                    pivot = pivot+1; //피벗 이동
                }
                compare++;
            }
            buffer = array[i];
            array[i] = array[pivot];
            array[pivot] = buffer;
            change++;


        }
        System.out.printf("비교 :%d, 교환: %d\n", compare, change);
        return array;
    }
}
