package Java;

public class PrimeCheck {
    public static void main(String[] args) {
int num = 13;
boolean prime = true;
for (int i = 2; i <= num/2; i++) {
if (num % i == 0) { prime = false; break; }
}
System.out.println(prime ? "Prime" : "Not Prime");
}
}
