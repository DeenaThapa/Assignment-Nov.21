//WAP to count the number of vowels and consonants in a given string.
public class countvowelandconsonants {
    public static void main(String[] args) {
        String string = "Hi I am Deena";
        int vowels = 0;
        int consonants = 0;
        int i = 0;
        string = string.toUpperCase();
        for (i = 0; i < string.length(); i++)
        {
            char character = string.charAt(i);
            if (Character.isLetter(character)) {
                if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') ;

                vowels++;
                System.out.println("the vowels number are:" + vowels);
            } else {
                consonants++;
                System.out.println("the consonants number are:" + consonants);
            }
        }

    }
}
