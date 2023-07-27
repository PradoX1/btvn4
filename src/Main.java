import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 4, 0, 1, 3};
        System.out.println("Mảng ban đầu là:" + "\n" + Arrays.toString(arr));
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        System.out.println("Mảng sau khi thêm 1 phần tử:" + "\n" + Arrays.toString(newArray));
        for (int i = 0; i < newArray.length; i++) {
            if (i == 6) {
                System.out.println("Mời bạn nhập giá trị thêm vào mảng : ");
                newArray[i] = Integer.parseInt(sc.nextLine());
            }
        }

        System.out.println(Arrays.toString(newArray));
        for (int i = 0; i < newArray.length; i++) {
            if (i==1){
                newArray[i]=newArray[i+1];

                }
        }
        for (int i = 0; i < newArray.length; i++) {
            if (i==2){
                newArray[i]=2;
            }

        }
        System.out.println("Mảng sau khi đổi chỗ phần tử 2 và 3: "+"\n"+Arrays.toString(newArray));

        System.out.println("Danh sách trước khi sắp xếp:");
        for (int i : newArray) {
        }
        System.out.print(Arrays.toString(newArray));
        BubbleSort.bubbleSort(newArray);

        System.out.println("\nDanh sách sau khi sắp xếp:");
        for (int i : newArray) {

        }
        System.out.print(Arrays.toString(newArray));
}}




