package Java;

public class MissingNumber {
    public static void main(String[] args) {
int[] arr = {1, 2, 4, 5};
int n = 5, total = n*(n+1)/2, sum = 0;
for (int num : arr) sum += num;
System.out.println("Missing: " + (total - sum));
}
}
