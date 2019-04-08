import jdk.internal.util.xml.impl.Input;

public class CaeserCypher{
    public String encryptCode(String Text,int Key) {
        StringBuilder encryptedText = new StringBuilder(Text);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";


        for (int i = 0; i < encryptedText.length(); i++) {
            char currentCharacter = Text.charAt(i);
            int index = alphabet.indexOf(currentCharacter);
            if (index != -1){
                char newCharacter = Input.charArt(i);
              encryptedText.setCharAt(i ,newCharacter);

            }


            }

        return encryptedText.toString();
    }
    }