import java.io.Console;

public class App {

    public static void main(String[] args) {
        Console myConsole = System.console();
        CaeserCypher cypher = new CaeserCypher();
        String plainText = myConsole.readLine();
        System.out.println("Enter text to Encrypt");
        int shift = 3;
        String result = cypher.encryptCode(plainText,shift);
        System.out.println(result);
    }
}
