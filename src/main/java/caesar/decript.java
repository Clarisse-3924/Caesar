package caesar;

import static caesar.encript.letter;

public class decript {
    public static String decrypt(String cipher, int shiftKey)
    {
        cipherText = cipherText.toLowerCase();
        String text = "";
        for (int i = 0; i < cipherText.length(); i++)
        {
            int charPosition = letter.indexOf(cipherText.charAt(i));
            int key = (charPosition - shiftKey) % 26;
            if (key < 0)
            {
                key = letter.length() + key;
            }
            char replace = letter.charAt(key);
            text += replace;
        }
        return text;
    }

}
