public class PasswordGenerator {
    public static String password(int passwordLength, boolean haveNumber, boolean haveCharacters,
            boolean haveSpecialChar) {
        String res = "";
        for (int i = 0; i < passwordLength; i++) {
            String arr[] = { haveNumber ? getNumber() : "", haveCharacters ? getCharacter() : "",
                    haveSpecialChar ? getSpecialCharacter() : "" };
            int index = ((int) (Math.random() * 100)) % 3;
            res = res + arr[index];
        }
        return res;
    }

    public static String getNumber() {
        int n = (int) (Math.random() * 10);
        return Integer.toString(n);
    }

    public static String getCharacter() {
        int capChar = (((int) (Math.random() * 100)) % 26) + 65;
        int smallChar = (((int) (Math.random() * 100)) % 26) + 97;
        int setter = (((int) (Math.random() * 10)) % 2);
        char res = setter == 0 ? (char) smallChar : (char) capChar;

        return Character.toString(res);
    }

    public static String getSpecialCharacter() {
        // ascii 33-47 are special characters
        int n = 33 + ((int) (Math.random() * 100)) % 15;
        char res = (char) n;
        return Character.toString(n);
    }

    public static void main(String[] args) {
        int passwordLength = 10;
        boolean haveNumber = true;
        boolean haveCharacters = true;
        boolean haveSpecialChar = true;

        String s = password(passwordLength, haveNumber, haveCharacters,
                haveSpecialChar);
        System.out.println("Password is : " + s);

    }
}
