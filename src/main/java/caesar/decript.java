package caesar;

import static caesar.encript.letter;

public class decript {
    public static String decrypt(String cipherText, int shiftKey)
    {
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++)
        {
            int charPosition = letter.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - shiftKey) % 26;
            if (keyVal < 0)
            {
                keyVal = letter.length() + keyVal;
            }
            char replaceVal = letter.charAt(keyVal);
            plainText += replaceVal;
        }
        return plainText;
    }

}
