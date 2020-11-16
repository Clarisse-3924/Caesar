package caesar;
public class encript
{ private String text;
    private int shiftkey;
    public encript(String text, int shiftkey) {
        this.text = text;
        this.shiftkey = shiftkey;
    }
    public String  getText(){
        return this.text;
    }

    public int getShiftkey(){
        return this.shiftkey;
    }

    public static final String letter = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String text, int shiftKey)
    {
        text = text.toLowerCase();
        String cipher = "";
        for (int i = 0; i < text.length(); i++) {
            int charPosition = letter.indexOf(text.charAt(i));
            int key = (shiftKey + charPosition) % 26;
            char replace = letter.charAt(key);
            cipher += replace;

        }
        return cipher;
    }

}




