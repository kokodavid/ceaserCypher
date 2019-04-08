
public class CaeserCypher {
    public String encryptCode(String Text, int Key) {
        String encryptedText = new String();
        String Alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String upperCaseInput = Alpha.substring(Key) + Alpha.substring(0, Key);

        for(int i = 0;i <encryptedText.length();i++){
            char thisCharacter = encryptedText.charAt(i);
            int index = Alpha.indexOf(thisCharacter);
            if (index != -1){
                String lowercaseInput = upperCaseInput.toLowerCase();
                char newCharacter = lowercaseInput .charAt(index);
                encryptedText setCharAt(index, newCharacter);
            }        }
        return encryptedText;
    }
}


