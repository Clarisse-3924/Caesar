package caesar;
import java.util.Scanner;

public class encript
{
    public static final String letter = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String text, int shiftKey)
    {
        text = text.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < text.length(); i++)
        {
            int charPosition = letter.indexOf(text.charAt(i));
            int key = (shiftKey + charPosition) % 26;
            char replace = letter.charAt(key);
            cipherText += replace;
        }
        return cipherText;
    }



}




