package Program;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort{
    int temp_array[];
    int len;
 
    public void sort(int[] nums) {
         
        if (nums == null || nums.length == 0) {
            return;
        }
        this.temp_array = nums;
        len = nums.length;
        quickSort(0, len - 1);
    }
     public void quickSort(int low, int high) {
         
        int a = low;
        int b = high;
        // calculate pivot number 
        int pivot = temp_array[(a+b)/2];
        
        // Divide into two arrays
        while (a <= b) {
               while (temp_array[a] < pivot) {
                a++;
            }
            while (temp_array[b] > pivot) {
                b--;
            }
            if (a <= b) {
                exchangeNumbers(a, b);
                
                //move index to next position on both sides
                a++;
                b--;
            }
        }
        
        // call quickSort()
        if (low < b)
            quickSort(low, b);
        if (a < high)
            quickSort(a, high);
    }
 
    public void exchangeNumbers(int a, int b) {
        int temp = temp_array[a];
        temp_array[a] = temp_array[b];
        temp_array[b] = temp;
    }
     
     //Mengecek
    public static void main(String args[])
    {
        int nums1, nums2, nums3, nums4, nums5, nums6, nums7, nums8;
        Scanner scan = new Scanner(System.in);
        System.out.println("Number :");
        nums1 = scan.nextInt();   
        System.out.println("Number :");
        nums2 = scan.nextInt();  
        System.out.println("Number :");
        nums3 = scan.nextInt();  
        System.out.println("Number :");
        nums4 = scan.nextInt();  
        System.out.println("Number :");
        nums5 = scan.nextInt();  
        System.out.println("Number :");
        nums6 = scan.nextInt();  
        System.out.println("Number :");
        nums7 = scan.nextInt();  
        System.out.println("Number :");
        nums8 = scan.nextInt();  
        
        QuickSort cc = new QuickSort();
                  
        int nums[] = {nums1, nums2, nums3, nums4, nums5, nums6, nums7, nums8};
        System.out.println("BEFORE:");
        System.out.println(Arrays.toString(nums));
        cc.sort(nums);
        System.out.println("AFTER:");
        System.out.println(Arrays.toString(nums));
    }
}