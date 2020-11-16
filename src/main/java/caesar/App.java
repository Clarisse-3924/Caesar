package caesar;

import java.util.Scanner;

import static caesar.decript.decrypt;
import static caesar.encript.encrypt;

public class App {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for Encryption: ");
        String stringmessage = new String();
        stringmessage = scanner.next();

        System.out.println("Enter the key: ");
        String key = new String();
        key = scanner.next();
        Integer shiftkey = Integer.parseInt(key);
        System.out.println(encrypt(stringmessage,shiftkey));
        System.out.println(decrypt(encrypt(stringmessage,shiftkey), shiftkey));
        scanner.close();
    }
}
