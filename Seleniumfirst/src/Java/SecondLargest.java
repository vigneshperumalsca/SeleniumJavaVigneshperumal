package Java;

public class SecondLargest {
public static void main(String[] args) {
int[] arr = {10, 45, 50, 56};
int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
for (int num : arr) {
if (num > largest) {
second = largest;
largest = num;
} else if (num > second && num != largest) {
second = num;
}
}
System.out.println("Second Largest: " + second);
}
}