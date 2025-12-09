package Java;

public class WordCount {
    
    public static void main(String[] args) {
String str = "Automation testing with Java";
String[] words = str.trim().split("\\s+");
System.out.println("Words: " + words.length);
}
}
