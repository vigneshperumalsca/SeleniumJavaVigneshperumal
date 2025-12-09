package Java;

public class LargestInArray {
    public static void main(String[] args) {
int[] arr = {10, 45, 23, 78, 56};
int max = arr[0];
for (int num : arr) {
if (num > max) max = num;
}
System.out.println("Largest: " + max);
}
    
}
