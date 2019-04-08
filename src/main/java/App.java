import java.io.Console;

public class App {

    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Enter text to Encypyt");
        CaeserCypher Encrypt = new CaeserCypher();
        String encrypted = myConsole.readLine();

        String result = Encrypt.encryptCode(encrypted, 3);
        System.out.println(result);

    }
}
