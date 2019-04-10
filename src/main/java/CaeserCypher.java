public class CaeserCypher {

    public static String encryptCode(String plainText, int shift) {
        if (shift > 26) {
            shift = shift % 26;
        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }
        String cypherText = "";
        int length = plainText.length();
        for (int i = 0; i < length; i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch + shift);
                    if (c > 'z') {
                        cypherText += (char) (ch - (26 - shift));
                    } else if (Character.isLowerCase(ch)) {
                        cypherText += c;
                    }
                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch + shift);
                    if (c > 'Z') {
                        cypherText += (char) (ch - (26 - shift));
                    } else {
                        cypherText += ch;
                    }
                }

            }
        }
        return cypherText;
    }
}